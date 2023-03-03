package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;


public class User {

    private String username;

    private String password;

    private String firstname;

    private String lastname;
    private String title;
    private String phoneNumber;
    private String fax;
    private String email;
    private String address;
    private String city;
    private String region;
    private String zipcode;
    private String status;
    private String degreePlan;
    private String startSem;
    private String endSem;
    private String facultyPosition;
    private String comments;
    private String securityQ1;
    private String securityQ2;
    private String backupEmail;




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() { return firstname; }

    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }

    public void setLastname(String lastname) { this.lastname = lastname; }
    public String getTitle() {return this.title;}
    public void setTitle(String title) {this.title = title;}

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getFax (String fax) { return this.fax; }
    public void setFax (String fax) { this.fax = fax; }
    public String getEmail() { return email; }

    public void setEmail (String email) { this.email = email; }

    public String getAddress() { return this.address; }
    public void setAddress (String address) { this.address = address; }

    public String getCity() { return this.city; }
    public void  setCity (String city ) { this.city = city; }

    public String getRegion() { return this.region; }
    public void setRegion ( String region ) { this.region = region; }

    public String getZipcode () { return this.zipcode; }
    public void setZipcode (String zipcode ) { this.zipcode = zipcode; }
    public String getStatus () {return this.status;}
    public void setStatus (String status) {this.status = status;}
    public String getDegreePlan() {return this.degreePlan;}
    public void setDegreePlan(String degreePlan) {this.degreePlan = degreePlan;}
    public String getStartSem () {return this.startSem;}
    public void setStartSem (String startSem) {this.startSem = startSem;}
    public String getEndSem() {return this.endSem;}
    public void setEndSem(String endSem) {this.endSem = endSem;}
    public String getComments () { return this.comments; }
    public void setComments (String comments) { this.comments = comments; }
    public String getSecurityQ1 () {return this.securityQ1;}
    public void setSecurityQ2 (String securityQ2) {this.securityQ2 = securityQ2;}
    public String getBackupEmail () {return this.backupEmail;}
    public void setBackupEmail(String backupEmail) {this.backupEmail = backupEmail;}

    public CompletionStage<WSResponse> checkAuthorized() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/login");
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }



    public  CompletionStage<WSResponse> registerUser() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        // send this. user
        ObjectNode res = Json.newObject();
        res.put("username", this.username);
        res.put("password",this.password);
        res.put("firstname", this.firstname);
        res.put("lastname", this.lastname);
        res.put("title", this.title);
        res.put("phoneNumber", this.phoneNumber);
        res.put("fax", this.fax);
        res.put("email", this.email);
        res.put("address", this.address);
        res.put("city", this.city);
        res.put("region", this.region);
        res.put("zipcode", this.zipcode);
        res.put("status", this.status);
        res.put("degreePlan", this.degreePlan);
        res.put("beginningSemester", this.startSem);
        res.put("endSem", this.endSem);
        res.put("faculty-position", this.facultyPosition);
        res.put("comments", this.comments);
        res.put("securityQ1", this.securityQ1);
        res.put("securityQ2", this.securityQ2);
        res.put("backupEmail", this.backupEmail);


        System.out.println(username);
        System.out.println(password);
        System.out.println(firstname);

        WSRequest request = ws.url("http://localhost:9005/signup");
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


}
