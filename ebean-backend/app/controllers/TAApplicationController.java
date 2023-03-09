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
        String lastname = req.get("lastname").asText();
        String email = req.get("email").asText();
        String phoneNumber = req.get("phoneNumber").asText();
        String degreePlane = req.get("degreePlane").asText();
        String beginningSemester = req.get("beginningSemester").asText();
        String gradSemester = req.get("gradSemester").asText();
        String preference1 = req.get("preference1").asText();
        String preference2 = req.get("preference2").asText();


        TAApplication p = TAApplication.findByTitle(title);
        ObjectNode result = null;
        if (p == null) {
            System.out.println("new application");
            result = Json.newObject();
            TAApplication application = new TAApplication();
            application.title=title;
            application.firstname=firstname;
            application.lastname=lastname;
            application.email=email;
            application.phoneNumber=phoneNumber;
            application.degreePlan=degreePlane;
            application.beginningSemester=beginningSemester;
            application.gradSemester=gradSemester;
            application.preference1=preference1;
            application.preference2=preference2;

            application.save();
            result.put("body", title);
        }
        return ok(result);
    }
}
