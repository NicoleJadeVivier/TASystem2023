package controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.TAPosition;
import play.mvc.Controller;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Course;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;

public class CourseController {
    public void addCourse() {
        Course course = new Course();
        course.name = "Software Engineering Principles";
        course.title = "CS4345";
        course.save();

        Course course2 = new Course();
        course2.name = "Data Structures";
        course2.title = "CS2341";
        course2.save();

        Course course3 = new Course();
        course3.name = "Algorithms";
        course3.title = "CS3353";
        course3.save();

        Course course4 = new Course();
        course4.name = "Principles of Computer Science";
        course4.title = "CS1342";
        course4.save();

    }

    public Result getAllCourses() {
        System.out.println("In getAllCourses");
        List<Course> courses = Course.find.all();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonCourses = mapper.convertValue(courses, JsonNode.class);
        System.out.println(jsonCourses);
        return ok(jsonCourses);
    }
}


