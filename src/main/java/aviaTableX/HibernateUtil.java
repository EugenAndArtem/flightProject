package aviaTableX;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import javax.security.auth.login.Configuration;

/**
 * Created by Артём on 09.02.2016.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    public HibernateUtil() {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            sessionFactory.openSession();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
