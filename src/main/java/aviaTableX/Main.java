package aviaTableX;

/**
 * Created by Артём on 21.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        ExistOfType exist = new ExistOfType();
        exist.exist();

        /*
        RouteImpl route = new RouteImpl("Ot", "Do");
        Flight flight = new InnerFlight(123, "Samara", "34", "69",route, exist.getInnerFlight());
        RouteDAO routeDAO = new RouteDAOImpl();
        FlightDAO flightDAO = new FlightDAOImpl();
        Flight flightNew;
        show(flight);
        try {

            routeDAO.addRoute(route);
            flightDAO.addFlight(flight);
            int value = 61;
            flightNew = flightDAO.getFlightById(value);

            show(flightNew);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            HibernateUtil.getSessionFactory().close();
        }*/
    }

    public static void show(Flight flight){
        System.out.println(flight.getFlightTime());
        System.out.println(flight.getId());
        System.out.println(flight.getPlaneName());
        System.out.println(flight.getRoute().getFromPoint());
        System.out.println(flight.getRoute().getToPoint());
        System.out.println(flight.getType());
    }
}
