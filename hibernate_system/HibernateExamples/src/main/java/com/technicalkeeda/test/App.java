package com.technicalkeeda.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.technicalkeeda.entities.Employee;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setFirstName("Yashwant");
		emp.setLastName("Chavan");
		
		session.save(emp);

		tx.commit();
	}
}
