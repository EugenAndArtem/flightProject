package aviaTableX;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Артём on 30.03.2016.
 */
@Repository("TypeDAO")
public class TypeDAOImpl implements TypeDAO {
    @Autowired
    SessionFactory sessionFactory;

    public void addType(Type type) throws SQLException {
        try {
            sessionFactory.getCurrentSession().save(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Type geInnerType() throws SQLException {
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from Type WHERE type=:typeOfFlight");
            query.setParameter("typeOfFlight", 0);
            Type inner = (Type) query.uniqueResult();
            return inner;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Type getWorldType() throws SQLException {
        try {
            Query query = sessionFactory.getCurrentSession().createQuery("from Type WHERE type=:typeOfFlight");
            query.setParameter("typeOfFlight", 1);
            Type world = (Type) query.uniqueResult();
            return world;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Type> getAllType() throws SQLException {
        java.util.List<Type> types = new ArrayList();
        try {
            types = sessionFactory.getCurrentSession().createCriteria(Type.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }

    public void deleteType(Type type) throws SQLException {
        try {
            sessionFactory.getCurrentSession().delete(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
