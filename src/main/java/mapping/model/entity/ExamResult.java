package mapping.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by linh6_000 on 05/28/2017.
 */
@Entity
public class ExamResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int examResult_id;

    private String marks;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public int getExamResult_id() {
        return examResult_id;
    }

    public void setExamResult_id(int examResult_id) {
        this.examResult_id = examResult_id;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
