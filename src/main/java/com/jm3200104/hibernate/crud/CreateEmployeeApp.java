package com.jm3200104.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateEmployeeApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			long id = (long)session.save(new Employee(103l, "virat", 26));
			System.out.println(id);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
