package com.jm3200104.hibernate.pk.sequence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployeeSeqApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(EmployeeSequence.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			long id = (long)session.save(new EmployeeSequence("Rohit", 25));
			System.out.println(id);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
