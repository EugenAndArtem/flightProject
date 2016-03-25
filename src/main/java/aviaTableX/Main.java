package aviaTableX;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Артём on 21.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        //ExistOfType exist = new ExistOfType();
        //exist.exist();
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("portal-service.xml");

        /*
        RouteImpl route = new RouteImpl("Ot", "Do");
        Flight flight = new InnerFlight(123, "Samara", "34", "69",route, exist.getInnerFlight());
        RouteDAO routeDAO = new RouteDAOImpl();
        FlightDAO flightDAO = new FlightDAOImpl();
        Flight flightNew;
        show(flight);

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
