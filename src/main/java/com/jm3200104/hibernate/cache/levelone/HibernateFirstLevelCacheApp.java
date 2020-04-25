package com.jm3200104.hibernate.cache.levelone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateFirstLevelCacheApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();

			Employee e1 = session.load(Employee.class, 101L);
			System.out.println("e1: " + e1);
			Employee e2 = session.load(Employee.class, 101L);
			System.out.println("e2: " + e2);

			session.evict(e1);

			Employee e3 = session.load(Employee.class, 101L);
			System.out.println(session.contains(e3));
			System.out.println("e3: " + e3);

			session.clear();
			Employee e4 = session.load(Employee.class, 101L);
			System.out.println("e4: " + e4);

			session.getTransaction().commit();
		} finally {
			session.close();
			sessionFactory.close();
		}
	}
}
