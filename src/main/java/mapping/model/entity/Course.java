package mapping.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linh6_000 on 05/28/2017.
 */
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;

    private String name;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id", nullable = false)
    private Grade grade;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private List<ExamResult> examResults = new ArrayList<ExamResult>();


}
