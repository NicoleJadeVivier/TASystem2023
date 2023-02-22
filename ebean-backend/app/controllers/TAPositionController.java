package controllers;

import play.mvc.Controller;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.TAPosition;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class TAPositionController extends Controller {
    public Result addPosition() {
        System.out.println("Adding a new position");
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        String description = req.get("description").asText();

        TAPosition p = TAPosition.findByTitle(title);
        ObjectNode result = null;
        if (p == null) {
            System.out.println("new position");
            result = Json.newObject();
            TAPosition position = new TAPosition();
            position.title=title;
            position.description=description;

            position.save();
            result.put("body", title);
        }
        return ok(result);
    }
}
