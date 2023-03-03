package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class TAApplication extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String firstname;
    @Constraints.Required
    public String lastname;
    @Constraints.Required
    public String email;
    @Constraints.Required
    public String phoneNumber;
    @Constraints.Required
    public String degreePlan;
    @Constraints.Required
    public String beginningSemester;
    @Constraints.Required
    public String gradSemester;


    public static Find<Long, TAApplication> find = new Find<Long, TAApplication>(){};

    public static TAApplication findByTitle(String title) {
        return TAApplication.find
                .where()
                .eq("title", title)
                .findUnique();
    }
}
