package controllers;

import play.mvc.Controller;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.TAApplication;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class TAApplicationController extends Controller {
    public Result newApplication() {
        System.out.println("Creating a new application");
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        String firstname = req.get("firstname").asText();

        TAApplication p = TAApplication.findByTitle(title);
        ObjectNode result = null;
        if (p == null) {
            System.out.println("new application");
            result = Json.newObject();
            TAApplication application = new TAApplication();
            application.title=title;
            application.firstname=firstname;

            application.save();
            result.put("body", title);
        }
        return ok(result);
    }
}
