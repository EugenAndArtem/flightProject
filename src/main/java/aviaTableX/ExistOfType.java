package aviaTableX;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

/**
 * Created by Артём on 26.02.2016.
 */
public class ExistOfType {
    private Type inner;
    private Type world;

    public void exist() {
        Session session = null;
        java.util.List<Type> types = new ArrayList();
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            types = session.createCriteria(Type.class).list();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (types.size() == 0) {
            inner = new Type("InnerFlight");
            world = new Type("WorldWideFlight");
            try {
                session = HibernateUtil.getSessionFactory().getCurrentSession();
                session.beginTransaction();
                session.save(inner);
                session.save(world);
                session.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public Type getInnerFlight() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("from Type WHERE type=:typeOfFlight");
            query.setParameter("typeOfFlight", "InnerFlight");
            inner= (Type)query.uniqueResult();
            tx.commit();
            return inner;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Type getWorldFlight() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            Query query = session.createQuery("from Type WHERE type=:typeOfFlight");
            query.setParameter("typeOfFlight", "WorldWideFlight");
            Type world = (Type)query.uniqueResult();
            tx.commit();
            return world;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
