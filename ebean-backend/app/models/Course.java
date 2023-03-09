package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Course extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String name;


    public static Find<Long, Course> find = new Find<Long, Course>(){};

    public static Course findByTitle(String title) {
        return Course.find
                .where()
                .eq("title", title)
                .findUnique();
    }

    public static List<Course> getCourses() {
        return Course.find.query().findList();
    }
}
