package mapping.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by linh6_000 on 05/28/2017.
 */
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classroomId;

    private String year;
    private char section;
    private String remarks;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grade_id", nullable = false)
    private Grade grade;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "classroom_student",
            joinColumns = {
                    @JoinColumn(name = "classroom_id", referencedColumnName = "classroomId")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "studentId")
            }
    )
    private List<Student> students = new ArrayList<Student>();

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
