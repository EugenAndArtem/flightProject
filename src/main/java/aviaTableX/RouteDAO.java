package aviaTableX;

import java.sql.SQLException;

/**
 * Created by Артём on 09.02.2016.
 */
public interface RouteDAO {
    public void addRoute(Route route) throws SQLException;
    public void updateRoute(int routeId, Route route) throws SQLException;
    public Route getRouteById(Long routeId) throws SQLException;
    public java.util.List getAllRoute() throws SQLException;
    public void deleteRoute(Route route) throws SQLException;
}
