package com.jm3200104.hibernate.association.onetomany.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyBiApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Assignment.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			Assignment assignment1 = new Assignment("Hibernate ORM Assignment 1");
			Assignment assignment2 = new Assignment("Hibernate ORM Assignment 2");
			Course hibernateOrmCourse = new Course("Hibernate ORM Framework");
			hibernateOrmCourse.addAssignment(assignment1);
			hibernateOrmCourse.addAssignment(assignment2);

			session.save(assignment1);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
