package mapping.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linh6_000 on 05/28/2017.
 */
@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int examId;
    private String name;
    private String startDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "examType_id", nullable = false)
    private ExamType examType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "exam")
    private List<ExamResult> examResults = new ArrayList<ExamResult>();
}

