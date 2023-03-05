package controllers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.util.concurrent.atomic.AtomicReference;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

    public List<TAPosition> taPositionList;
    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        Http.Context ctx = Http.Context.current();
        String username = ctx.session().get("username");
        System.out.println(username);
        TAPosition taPosition = new TAPosition();
        CompletionStage<WSResponse> response = taPosition.getTAPositions();

        if (username != null) {
            return response.thenApply(r -> {
                String responseBody = r.getBody();
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                    TAPosition[] taPositions = objectMapper.readValue(responseBody, TAPosition[].class);
                    taPositionList = Arrays.asList(taPositions);
                    for (TAPosition position: taPositionList) {
                        System.out.println(position.getTitle());
                    }
                    return ok(views.html.index.render(username, taPositionList));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).toCompletableFuture().join();
        } else {
            return ok(views.html.login.render(null));
        }
    }


    /**
     * Index page
     */
    public Result signup() {
        return ok(views.html.register.render(null));
    }

    public Result addPosition(){ return ok(views.html.TAForm.render(null)); }

    public Result newApplication() {
        //get username from session
        //get user information from ta application model
        //open form
        Http.Context ctx = Http.Context.current();
        String username = ctx.session().get("username");
        System.out.println("Username " + username);
        User user = new User();

        TAApplication app = new TAApplication();
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
            return ok(views.html.TAApplication.render(user));
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
            return (CompletionStage<Result>) badRequest(views.html.register.render(null));
        }
        return registrationForm.get().registerUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        return ok(login.render(""));
                    } else if(registrationForm.get().getUsername().isEmpty()) {
                        return badRequest(views.html.register.render("Please fill in required fields"));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.register.render("Username already exists"));
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
                        return ok(index.render(username, taPositionList));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.TAForm.render("Position already exists"));
                    }
                }, ec.current());
    };

    public CompletionStage<Result> newApplicationHandler() {
        Form<TAApplication> TAApplicationForm = formFactory.form(TAApplication.class).bindFromRequest();
        if (TAApplicationForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.TAApplication.render(null));
        }
        return TAApplicationForm.get().submitApplication()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        Http.Context ctx = Http.Context.current();
                        String username = ctx.session().get("username");
                        return ok(views.html.index.render(username, taPositionList));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.TAApplication.render(null));
                    }
                }, ec.current());
    };


}