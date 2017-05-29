package mapping.model.entity;

import javax.persistence.*;

/**
 * Created by linh6_000 on 05/28/2017.
 */
@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int attendanceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private Boolean stattus;
    private String remark;


}
