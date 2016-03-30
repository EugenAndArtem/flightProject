package aviaTableX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
 * Created by Артём on 30.03.2016.
 */
@Service("RouteService")
public class RouteServiceImpl implements ServiceRoute {
    @Autowired
    RouteDAO routeDAO;
    @Transactional
    public void addRoute(Route route) throws SQLException {
        routeDAO.addRoute(route);
    }
    @Transactional
    public void updateRoute(Route route) throws SQLException {
        routeDAO.updateRoute(route);
    }
    @Transactional
    public Route getRouteById(Long routeId) throws SQLException {
        return routeDAO.getRouteById(routeId);
    }
    @Transactional
    public java.util.List<Route> getAllRoute() throws SQLException {
        return routeDAO.getAllRoute();
    }
    @Transactional
    public void deleteRoute(Route route) throws SQLException {
        routeDAO.deleteRoute(route);
    }
}
