package aviaTableX;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Артём on 09.02.2016.
 */
@Repository("FlightDAO")
public class FlightDAOImpl implements FlightDAO {
    @Autowired
    private SessionFactory sessionFactory;


    public void addFlight(Flight flight) throws SQLException {
        //Session session = null;
        try {
           // session = HibernateUtil.getSessionFactory().getCurrentSession();
            //session.beginTransaction();
            sessionFactory.getCurrentSession().save(flight);
            //session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateFlight(Flight flight) throws SQLException {
        //Session session = null;
        try {
           /* session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.update(flight);
//            session.flush();
            session.getTransaction().commit();*/
            sessionFactory.getCurrentSession().update(flight);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Flight getFlightById(int flightId) throws SQLException {
        //Session session = null;
        Flight flight = null;
        try {
           // session = HibernateUtil.getSessionFactory().getCurrentSession();
            //Transaction tx = session.beginTransaction();
            flight = (Flight) sessionFactory.getCurrentSession().get(FlightImpl.class, flightId);
           // tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flight;
    }

    public java.util.List getAllFlights() throws SQLException {
       // Session session = null;
        java.util.List<Flight> flights = new ArrayList();
        try {
           // session = HibernateUtil.getSessionFactory().getCurrentSession();
           // Transaction tx = session.beginTransaction();
            flights = sessionFactory.getCurrentSession().createCriteria(FlightImpl.class).list();
            //flights.
           // tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flights;

    }

    public void deleteFlight(Flight flight) throws SQLException {
       // Session session = null;
        try {
            sessionFactory.getCurrentSession().delete(flight);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
