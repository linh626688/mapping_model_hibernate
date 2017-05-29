package mapping.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linh6_000 on 05/28/2017.
 */
@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int grade_id;
    private String name;
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "grade")
    private List<Classroom> classrooms = new ArrayList<Classroom>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "grade")
    private List<Course> courses = new ArrayList<Course>();


}
