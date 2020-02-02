package com.jm3200104.hibernate.pk.auto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployeeAutoApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(EmployeeAuto.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			long id = (long)session.save(new EmployeeAuto("Rohit", 25));
			System.out.println(id);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
