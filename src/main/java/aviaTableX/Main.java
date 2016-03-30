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
        ExistOfType exist = (ExistOfType)appContext.getBean("Exist");

        Route route = new RouteImpl("Touda", "Obratno");
        Flight flight = new FlightImpl(123, "Pestravka", "34", "69",route, exist.getInnerFlight());

        routeService.addRoute(route);
        flightService.addFlight(flight);
        show(flightService.getFlightById(61));
        /*
        RouteImpl route = new RouteImpl("Ot", "Do");
        Flight flight = new FlightImpl(123, "Samara", "34", "69",route, exist.getInnerFlight());
        RouteDAO routeDAO = new RouteDAOImpl();
        FlightDAO flightDAO = new FlightDAOImpl();
        Flight flightNew;
        show(flight);

        <property name="current_session_context_class">thread</property>
        5.0.1.Final

        <bean id="sessionFactory" class="org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean"
          p:dataSource-ref="dataSource"
          p:configLocation="${hibernate.config}"
          p:packagesToScan="aviaTableX"/>


        <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
          destroy-method="close"
          p:driverClass="${app.jdbc.driverClassName}"
          p:jdbcUrl="${app.jdbc.url}"
          p:user="${app.jdbc.username}"
          p:password="${app.jdbc.password}"
          p:acquireIncrement="5"
          p:idleConnectionTestPeriod="60"
          p:maxPoolSize="100"
          p:maxStatements="50"
          p:minPoolSize="10" />










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
