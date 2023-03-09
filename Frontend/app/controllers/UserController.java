package controllers;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.typesafe.config.Config;
import models.*;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import utils.RESTfulCalls;
import utils.RESTfulCalls.ResponseType;
import views.html.*;
import controllers.HomeController;


import javax.inject.Inject;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;

public class UserController extends Controller {
    @Inject
    Config config;

    @Inject
    HttpExecutionContext ec;

    private Form<User> userForm;
    private FormFactory formFactory;
    private User user;

    private HomeController homeController;

    @Inject
    public UserController(FormFactory factory) {
        userForm = factory.form(User.class);
        formFactory = factory;
    }

    public Result userEdit() {
        Http.Context ctx = Http.Context.current();
        String username = ctx.session().get("username");
        System.out.println("Username " + username);
        user = new User();

        CompletionStage<WSResponse> response = user.getUserInfo(username);
        return response.thenApply(r -> {
            String responseBody = r.getBody();
            System.out.println(responseBody);
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                System.out.println("In try");
                JsonNode jsonNode = objectMapper.readTree(responseBody);
                user.setId((jsonNode.get("id").asLong()));
                user.setFirstname(jsonNode.get("firstname").asText());
                user.setLastname(jsonNode.get("lastname").asText());
                user.setPhoneNumber(jsonNode.get("phonenumber").asText());
                user.setEmail(jsonNode.get("email").asText());
                user.setDegreePlan(jsonNode.get("degreePlan").asText());
                user.setStartSem(jsonNode.get("startSem").asText());
                user.setEndSem(jsonNode.get("endSem").asText());
                user.setAddress(jsonNode.get("address").asText());
                user.setCity(jsonNode.get("city").asText());
                user.setRegion(jsonNode.get("region").asText());
                user.setFax(jsonNode.get("fax").asText());
                user.setTitle(jsonNode.get("title").asText());
                user.setZipcode(jsonNode.get("zipcode").asText());

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //try returning the data and making this another function?
            System.out.println("Firstname" + user.getFirstname());
            return ok(views.html.UserEdit.render(user));
        }).toCompletableFuture().join();
    }

    public CompletionStage<Result> editUserHandler() {
        Form<User> editUserForm = formFactory.form(User.class).bindFromRequest();
        if (editUserForm.hasErrors()){
            return (CompletionStage<Result>) badRequest(views.html.UserEdit.render(user));
        }
        return editUserForm.get().updateUser()
                .thenApplyAsync((WSResponse r) -> {
                    if (r.getStatus() == 200 && r.asJson() != null) {
                        System.out.println("success");
                        System.out.println(r.asJson());
                        Http.Context ctx = Http.Context.current();
                        String username = ctx.session().get("username");
                        homeController = new HomeController(formFactory);
                        homeController.fillPositions();
                        return ok(index.render(username, homeController.taPositionList));
                    } else {
                        System.out.println("response null");
                        return badRequest(views.html.UserEdit.render(user));
                    }
                }, ec.current());
    }
}
