package com.jm3200104.hibernate.association.onetoone.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBiApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Trainee.class).addAnnotatedClass(Result.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			/**
			 * save
			 * 
			 * You need handshaking method or util method to set result into trainee and
			 * trainee into result see one to many bi-direction example
			 */

//			Result result = new Result("Pass with Honors");
//			Trainee trainee = new Trainee("Sachin", result);
//			result.setTrainee(trainee);
//			session.save(result);

			// get
			Result result = session.get(Result.class, 1l);
			System.out.println(result);
			System.out.println(result.getTrainee());
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
