package aviaTableX;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Артём on 09.02.2016.
 */
@Repository("RouteDAO")
public class RouteDAOImpl implements RouteDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void addRoute(Route route) throws SQLException {
        try {
            sessionFactory.getCurrentSession().save(route);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRoute(int routeId, Route route) throws SQLException {
        try {
            sessionFactory.getCurrentSession().update(route);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Route getRouteById(Long routeId) throws SQLException {
        Route route = null;
        try {
            route = (Route) sessionFactory.getCurrentSession().get(RouteImpl.class, routeId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return route;
    }

    public java.util.List getAllRoute() throws SQLException {
        java.util.List<Route> routes = new ArrayList();
        try {
            routes = sessionFactory.getCurrentSession().createCriteria(RouteImpl.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return routes;
    }

    public void deleteRoute(Route route) throws SQLException {
        try {
            sessionFactory.getCurrentSession().delete(route);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
