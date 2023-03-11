package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.TAPosition;
import models.User;
import play.Logger;
import play.libs.Json;
import play.mvc.*;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import controllers.CourseController;

import java.util.ArrayList;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    public Result index() {
        return ok(Json.toJson("Welcome to backend!"));
    }
    public Result info() {
        System.out.println("In info");
        Long id = 1L;
        User user = User.find.byId(id);
        List<String> infos = new ArrayList<>();
        infos.add("Username: " + user.username);
        infos.add("Password: " + user.password);
        infos.add("Firstname: " + user.firstname);
        Seq<String> infoSeq = JavaConverters.asScalaBufferConverter(infos).asScala().toSeq();
        Logger.info("infos" + infoSeq);
        CourseController course = new CourseController();
        course.addCourse();
        return ok(views.html.info.render(infoSeq));
    }

    public Result userData(String username) {
        System.out.println("In userData");
        User user = User.findByName(username);
        if (user == null) {
            return notFound("User does not exist");
        } else {
            ObjectNode result = Json.newObject();
            result.put("id", user.id);
            result.put("firstname", user.firstname);
            result.put("lastname", user.lastname);
            result.put("email", user.email);
            result.put("phonenumber", user.phoneNumber);
            result.put("degreePlan", user.degreePlan);
            result.put("startSem", user.startSem);
            result.put("endSem", user.endSem);
            result.put("address", user.address);
            result.put("region", user.region);
            result.put("city", user.city);
            result.put("fax", user.fax);
            result.put("title", user.title);
            result.put("zipcode", user.zipcode);
            return ok(result);
        }
    }

    public Result allPositions() {
        System.out.println("In allPositions");
        TAPosition position = new TAPosition();
        List<TAPosition> allPositions = TAPosition.getAllPositions();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonPositions = mapper.convertValue(allPositions, JsonNode.class);
        return ok(jsonPositions);
    }
}
