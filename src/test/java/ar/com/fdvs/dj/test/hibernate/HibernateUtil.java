package ar.com.fdvs.dj.test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateUtil {
    private static SessionFactory factory;

    public static synchronized Session getSession() {
        if (factory == null) {
            throw new IllegalStateException(
                "SessionFactory not initialized. Call TestSchema.buildConfiguration() first.");
        }
        return factory.openSession();
    }

    public static void setSessionFactory(SessionFactory factory) {
        HibernateUtil.factory = factory;
    }

    public static SessionFactory getFactory() {
        return factory;
    }
}
