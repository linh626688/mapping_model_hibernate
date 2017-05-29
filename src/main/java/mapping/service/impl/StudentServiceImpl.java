package mapping.service.impl;

import mapping.dao.DAO;
import mapping.dao.impl.DAOimpl;
import mapping.model.entity.Student;
import mapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by linh6_000 on 05/29/2017.
 */
@org.springframework.stereotype.Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    DAO studentDAO;

    @Override
    public Student getPersonById(int id) {
        Student student = studentDAO.findById(id);
        return student;
    }

    @Override
    public List<Student> findAll() {

        List<Student> students = studentDAO.findAll();
        return students;
    }

}
