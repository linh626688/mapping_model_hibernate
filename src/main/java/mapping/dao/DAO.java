package mapping.dao;

import mapping.model.entity.Student;

import java.util.List;

/**
 * Created by linh6_000 on 05/29/2017.
 */
public interface DAO {
    Student findById(int id);

    List<Student> findAll();

}
