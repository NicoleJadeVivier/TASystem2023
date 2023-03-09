package models;

import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Course {

    private Long id;
    private String title;
    private String name;

    public void setId(Long id) { this.id = id; }
    public Long getId() { return this.id; }
    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return this.title; }
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public CompletionStage<WSResponse> getCourses() {
        WSClient ws = play.test.WSTestClient.newClient(9005);

        WSRequest request = ws.url("http://localhost:9005/getCourses");
        return request.get();

    }
}
