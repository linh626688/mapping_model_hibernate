package mapping.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linh6_000 on 05/28/2017.
 */
@Entity
public class ExamType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int examType_id;
    private String description;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "examType")
    private List<Exam> exams = new ArrayList<Exam>();

}
