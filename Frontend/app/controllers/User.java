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

    private String phoneNumber;

    private String email;

    private String address;
    private String city;
    private String region;
    private String zipcode;

    private String comments;



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

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

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

    public String getComments () { return this.comments; }
    public void setComments () { this.comments = comments; }

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
        res.put("phoneNumber", this.phoneNumber);
        res.put("email", this.email);
        res.put("address", this.address);
        res.put("city", this.city);
        res.put("region", this.region);
        res.put("zipcode", this.zipcode);
        res.put("comments", this.comments);


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
