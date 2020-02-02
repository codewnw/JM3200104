package com.jm3200104.hibernate.association.onetoone.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Trainee.class).addAnnotatedClass(Result.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			Result result = new Result("Pass");
			Trainee trainee = new Trainee("Rohit", result);
			
			session.save(trainee);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
