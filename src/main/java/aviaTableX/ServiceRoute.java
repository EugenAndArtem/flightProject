package aviaTableX;



import model.Route;

import java.sql.SQLException;

/**
 * Created by Артём on 30.03.2016.
 */
public interface ServiceRoute {
    public void addRoute(Route route) throws SQLException;
    public void updateRoute(Route route) throws SQLException;
    public Route getRouteById(Long routeId) throws SQLException;
    public java.util.List<Route> getAllRoute() throws SQLException;
    public void deleteRoute(Route route) throws SQLException;
}
