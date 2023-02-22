package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class TAPosition extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String title;

    @Constraints.Required
    public String description;

    public static Find<Long, TAPosition> find = new Find<Long, TAPosition>(){};

    public static TAPosition findByTitle(String title) {
        return TAPosition.find
                .where()
                .eq("title", title)
                .findUnique();
    }
}
