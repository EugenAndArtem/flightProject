package aviaTableX;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Артём on 09.02.2016.
 */
public class RouteDAOImpl implements RouteDAO {
    public void addRoute(Route route) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(route);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen())
            {
                session.close();
            }
        }
    }

    public void updateRoute(int routeId, Route route) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.update(route);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }



    public Route getRouteById(Long routeId) throws SQLException {
        Session session = null;
        Route route = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            route = (Route) session.get(RouteImpl.class, routeId);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return route;
    }

    public java.util.List getAllRoute() throws SQLException {
        Session session = null;
        java.util.List<Route> routes = new ArrayList();
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            routes = session.createCriteria(RouteImpl.class).list();
            //flights.
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return routes;
    }

    public void deleteRoute(Route route) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.delete(route);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
