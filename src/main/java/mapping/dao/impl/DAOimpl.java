package mapping.dao.impl;

import mapping.dao.DAO;
import mapping.model.entity.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by linh6_000 on 05/29/2017.
 */
@Repository
public class DAOimpl implements DAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public  Student findById(int id) {
        String sql = "Select p from Student p where p.id = :id";

        Query query = entityManager.createQuery(sql).setParameter("id", id);

        return (Student) query.getSingleResult();
    }

    @Override
    public  List<Student> findAll() {
        String sql = "Select p from Student p";

        Query query = entityManager.createQuery(sql);

        return query.getResultList();
    }

}
