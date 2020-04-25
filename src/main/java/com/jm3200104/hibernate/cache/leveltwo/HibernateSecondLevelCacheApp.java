package com.jm3200104.hibernate.cache.leveltwo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSecondLevelCacheApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		Session session1 = sessionFactory.openSession();
		Employee e1 = session1.load(Employee.class, 101L);
		System.out.println(e1);
		session1.close();

		Session session2 = sessionFactory.openSession();
		Employee e2 = session2.load(Employee.class, 101L);
		System.out.println(e2);
		session2.close();

		sessionFactory.close();
	}
}
