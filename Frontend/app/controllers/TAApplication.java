package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class TAApplication {
    private String title;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String degreePlan;
    private String beginningSemester;
    private String gradSemester;
    private String previousCourses;
    private String topPreferenceOpen;
    private String topPreferenceAll;
    private String secondPreference;
    private String thirdPreference;

    public void setTitle(String title) {this.title = title;}
    public String getTitle() { return this.title; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getFirstname() {return this.firstname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public String getLastname() {return this.lastname; }
    public void setEmail(String email) {this.email = email;}
    public String getEmail() {return this.email; }
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() {return this.phoneNumber;}
    public void setDegreePlan(String degreePlan) {this.degreePlan = degreePlan;}
    public String getDegreePlan() {return this.degreePlan;}
    public void setBeginningSemester(String beginningSemester) {this.beginningSemester = beginningSemester;}
    public String getBeginningSemester() {return this.beginningSemester;}
    public void setGradSemester(String gradSemester) {this.gradSemester = gradSemester;}
    public String getGradSemester() {return this.gradSemester;}
    public void setTopPreferenceOpen(String topPreferenceOpen) {this.topPreferenceOpen = topPreferenceOpen;}
    public String getTopPreferenceOpen() {return this.getTopPreferenceOpen();}
    public void setTopPreferenceAll(String topPreferenceAll) {this.topPreferenceAll = topPreferenceAll;}
    public String getTopPreferenceAll() {return this.topPreferenceAll;}

    public  CompletionStage<WSResponse> submitApplication() {
        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("title", this.title);
        res.put("firstname",this.firstname);
        res.put("lastname", this.lastname);
        res.put("email", this.email);
        res.put("phoneNumber", this.phoneNumber);
        res.put("degreePlane", this.degreePlan);
        res.put("beginningSemester", this.beginningSemester);
        res.put("gradSemester", this.gradSemester);




        System.out.println(title);
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(degreePlan);
        System.out.println(beginningSemester);
        System.out.println(gradSemester);

        WSRequest request = ws.url("http://localhost:9005/newApplication");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    public CompletionStage<WSResponse> getUserInfo(String username) {
        WSClient ws = play.test.WSTestClient.newClient(9005);

        WSRequest request = ws.url("http://localhost:9005/userData")
                .setQueryParameter("username", username);
        return request.get()
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


}
