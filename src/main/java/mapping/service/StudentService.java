package mapping.service;

import mapping.model.entity.Student;

import java.util.List;

/**
 * Created by linh6_000 on 05/29/2017.
 */
@org.springframework.stereotype.Service
public interface StudentService {
    public Student getPersonById(int id);

    public List<Student> findAll();
}

