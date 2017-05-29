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
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    private String email;

    private String password;

    private String fname;

    private String lname;

    private String phone;

    private String mobile;

    private String last_login_ip;

    private Boolean status;

    private String dob;

    private String last_login_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", nullable = false)
    private Parent parent;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<ExamResult> examResults = new ArrayList<ExamResult>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<Attendance> attendances = new ArrayList<Attendance>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "students")
    private List<Classroom> classRooms = new ArrayList<Classroom>();

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLast_login_date() {
        return last_login_date;
    }

    public void setLast_login_date(String last_login_date) {
        this.last_login_date = last_login_date;
    }
}
