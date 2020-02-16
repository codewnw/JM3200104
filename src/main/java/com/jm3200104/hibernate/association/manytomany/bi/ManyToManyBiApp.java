package com.jm3200104.hibernate.association.manytomany.bi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyBiApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class).addAnnotatedClass(Address.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

//			Person sachin = new Person("Sachin");
//			Address bombayVilla = new Address("Bombay Villa");
//			Address delhiFlat = new Address("Delhi flat");
//			sachin.addAddress(bombayVilla);
//			sachin.addAddress(delhiFlat);
//			
//			session.save(bombayVilla);
			
			
			
			Person rohit = new Person("Rohit");
			Address existingDelhiFlat = session.get(Address.class, 8l);
			rohit.addAddress(existingDelhiFlat);
			
			session.save(existingDelhiFlat);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
