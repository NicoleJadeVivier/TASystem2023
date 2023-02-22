package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;
public class TAPosition {
    private String title;
    private String description;

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return this.title; }
    public void setDescription(String description) { this.description = description; }
    public String getDescription () { return this.description; }
    public  CompletionStage<WSResponse> submitPosition() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("title", this.title);
        res.put("description",this.description);



        System.out.println(title);
        System.out.println(description);

        WSRequest request = ws.url("http://localhost:9005/addPosition");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }
}
