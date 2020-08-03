package hibernateproject;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * @author Deepak Kumar 

 
 * Web: http://www.roseindia.net
 */
public class hibernateUtil {
	private static final SessionFactory sessionFactory;

	private static ServiceRegistry serviceRegistry;

	static {

		try {

			

			Configuration cfg=new Configuration().configure();
			StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(
			            cfg.getProperties());
			sessionFactory= cfg.buildSessionFactory(builder.build());
			
			

		} catch (Throwable th) {

			System.err.println("Enitial SessionFactory creation failed" + th);

			throw new ExceptionInInitializerError(th);

		}

	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;

	}
}