package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.TAPosition;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;
import models.Course;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    public List<TAPosition> taPositionList;
    public CourseController courseController;
    public List<Course> courseList;
    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public void fillPositions() {
        TAPosition taPosition = new TAPosition();
        CompletionStage<WSResponse> response = taPosition.getTAPositions();
        response.thenApply(r -> {
            String responseBody = r.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                TAPosition[] taPositions = objectMapper.readValue(responseBody, TAPosition[].class);
                taPositionList = Arrays.asList(taPositions);
                return null;
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }).toCompletableFuture().join();
    }
    public Result index() {
        Http.Context ctx = Http.Context.current();
        String username = ctx.session().get("username");
        System.out.println(username);

        courseController = new CourseController();
        courseController.fillCourses();
        courseList = courseController.getCourses();

        if (username != null) {
            fillPositions();
            return ok(views.html.index.render(username, taPositionList));

        } else {
            return ok(views.html.login.render(null));
        }
    }


    /**
     * Index page
     */
    public Result signup() {
        courseController = new CourseController();
        courseController.fillCourses();
        courseList = courseController.getCourses();
        return ok(views.html.register.render(null, courseList));
    }

    public Result addPosition(){ return ok(views.html.TAForm.render(null)); }

    public Result newSpecificApplication(String positionTitle) {
        //get username from session
        //get user information from ta application model
        //open form
        Http.Context ctx = Http.Context.current();
        String username = ctx.session().get("username");
        System.out.println("Username " + username);
        User user = new User();

        models.TAApplication app = new models.TAApplication();
        CompletionStage<WSResponse> response = app.getUserInfo(username);
        return response.thenApply(r -> {
            String responseBody = r.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                System.out.println("In try");
                JsonNode jsonNode = objectMapper.readTree(responseBody);
                user.setFirstname(jsonNode.get("firstname").asText());
                user.setLastname(jsonNode.get("lastname").asText());
                user.setPhoneNumber(jsonNode.get("phonenumber").asText());
                user.setEmail(jsonNode.get("email").asText());
                user.setDegreePlan(jsonNode.get("degreePlan").asText());
                user.setStartSem(jsonNode.get("startSem").asText());
                user.setEndSem(jsonNode.get("endSem").asText());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //try returning the data and making this another function?
            System.out.println("Firstname" + user.getFirstname());
            return ok(views.html.TAApplicationSpecific.render(user, positionTitle));
        }).toCompletableFuture().join();
    }
    public Result newApplication() {
        //get username from session
        //get user information from ta application model
        //open form
        Http.Context ctx = Http.Context.current();
        String username = ctx.session().get("username");
        System.out.println("Username " + username);
        User user = new User();

        models.TAApplication app = new models.TAApplication();
        CompletionStage<WSResponse> response = app.getUserInfo(username);
        return response.thenApply(r -> {
            String responseBody = r.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                System.out.println("In try");
                JsonNode jsonNode = objectMapper.readTree(responseBody);
                user.setFirstname(jsonNode.get("firstname").asText());
                user.setLastname(jsonNode.get("lastname").asText());
                user.setPhoneNumber(jsonNode.get("phonenumber").asText());
                user.setEmail(jsonNode.get("email").asText());
                user.setDegreePlan(jsonNode.get("degreePlan").asText());
                user.setStartSem(jsonNode.get("startSem").asText());
                user.setEndSem(jsonNode.get("endSem").asText());


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //try returning the data and making this another function?
            System.out.println("Firstname" + user.getFirstname());
            System.out.print("Reached here");
            return ok(views.html.TAApplication.render(user, courseList));
        }).toCompletableFuture().join();
    }
    public CompletionStage<Result> loginHandler() {

        Form<User> loginForm = formFactory.form(User.class).bindFromRequest();
        if (loginForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.login.render(""));  // send parameter like register so that user could know
        }

        return loginForm.get().checkAuthorized()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null && r.asJson().asBoolean()) {
                        System.out.println(r.asJson());
                        // add username to session
                        session("username",loginForm.get().getUsername());   // store username in session for your project
                        // redirect to index page, to display all categories
                        fillPositions();
                        return ok(views.html.index.render(loginForm.get().getUsername(), taPositionList));
                    } else {
                        System.out.println("response null");
                        String authorizeMessage = "Incorrect Username or Password ";
                        return badRequest(views.html.login.render(authorizeMessage));
                    }
                }, ec.current());
    }

    public CompletionStage<Result> signupHandler() {

        Form<User> registrationForm = formFactory.form(User.class).bindFromRequest();
        if (registrationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.register.render(null, courseList));
        }
        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        return ok(login.render(""));
                    } else if(registrationForm.get().getUsername().isEmpty()) {
                        return badRequest(views.html.register.render("Please fill in required fields", courseList));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.register.render("Username already exists", courseList));
                    }
                }, ec.current());

    }

    public CompletionStage<Result> newPositionHandler() {
        Form<TAPosition> TAPositionForm = formFactory.form(TAPosition.class).bindFromRequest();
        if (TAPositionForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.TAForm.render(null));
        }
        return TAPositionForm.get().submitPosition()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        Http.Context ctx = Http.Context.current();
                        String username = ctx.session().get("username");
                        fillPositions();
                        return ok(index.render(username, taPositionList));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.TAForm.render("Position already exists"));
                    }
                }, ec.current());
    };

    public CompletionStage<Result> newApplicationHandler() {
        Form<models.TAApplication> TAApplicationForm = formFactory.form(models.TAApplication.class).bindFromRequest();
        if (TAApplicationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.TAApplication.render(null, courseList));
        }
        return TAApplicationForm.get().submitApplication()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        Http.Context ctx = Http.Context.current();
                        String username = ctx.session().get("username");
                        fillPositions();
                        return ok(views.html.index.render(username, taPositionList));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.TAApplication.render(null, courseList));
                    }
                }, ec.current());
    };


}