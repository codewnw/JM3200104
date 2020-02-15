package com.jm3200104.hibernate.association.onetomany.uni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyUniApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Assignment.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			Assignment assignment1 = new Assignment("Spring Assignment 1");
			Assignment assignment2 = new Assignment("Spring Assignment 2");
			List<Assignment> assignments = new ArrayList<Assignment>();
			assignments.add(assignment1);
			assignments.add(assignment2);

			Course springCourse = new Course("Spring Framework", assignments);

			session.save(springCourse);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
