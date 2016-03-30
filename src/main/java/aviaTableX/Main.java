package aviaTableX;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by Артём on 21.02.2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("portal-service.xml");

        SessionFactory session= (SessionFactory)appContext.getBean("sessionFactory");
        ServiceFlight flightService = (ServiceFlight)appContext.getBean("FlightService");
        ServiceRoute routeService = (ServiceRoute)appContext.getBean("RouteService");
        ServiceType typeService = (ServiceType)appContext.getBean("TypeService");


        Route route = new RouteImpl("Touda", "Obratno");
        Flight flight = new FlightImpl(123, "Pestravka", "34", "69",route, typeService.getInnerType());

        routeService.addRoute(route);
        flightService.addFlight(flight);

        show(flightService.getFlightById(20));

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
