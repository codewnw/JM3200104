package com.jm3200104.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployeeApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			Employee emp = session.get(Employee.class, 101l);
			System.out.println(emp);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
