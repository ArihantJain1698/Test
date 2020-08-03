package hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernateproject.*;
/**
 * @author Deepak Kumar 
 * Web: http://www.roseindia.net
 */
public class CreateData {
	public static void main(String[] args) throws Exception {

		SessionFactory sessFact = hibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		Employee emp = new Employee();
		emp.setEmpName("Deepak Kumar");
		emp.setEmpMobileNos("000000");
		emp.setEmpAddress("Delhi - India");
		session.save(emp);
		tr.commit();
		System.out.println("Successfully inserted");
		sessFact.close();
	}

}