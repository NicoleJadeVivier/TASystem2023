package controllers;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Course;
import play.libs.ws.WSResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;

public class CourseController {
    private List<Course> courseList;

    public void fillCourses() {
        System.out.println("Getting courses");
        Course course = new Course();
        CompletionStage<WSResponse> response = course.getCourses();
        response.thenApply(r -> {
            String responseBody = r.getBody();
            System.out.println("Response body: " +  responseBody);
            System.out.println("OVer");
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                Course[] courses = objectMapper.readValue(responseBody, Course[].class);
                courseList = Arrays.asList(courses);
                return null;
            } catch (IOException e){
                throw new RuntimeException(e);
            }
        }).toCompletableFuture().join();
    }

    public List<Course> getCourses()  {
        return this.courseList;
    }
}
