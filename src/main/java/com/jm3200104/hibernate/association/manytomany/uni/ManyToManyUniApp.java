package com.jm3200104.hibernate.association.manytomany.uni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyUniApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class).addAnnotatedClass(Address.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

//			Person sachin = new Person("Sachin");
//			Address bombayVilla = new Address("Bombay Villa");
//			Address delhiFlat = new Address("Delhi flat");
//			List<Address> sachinAddresses = new ArrayList<>();
//			sachinAddresses.add(bombayVilla);
//			sachinAddresses.add(delhiFlat);
//			sachin.setAddresses(sachinAddresses);
//			
//			session.save(sachin);
			
			
			
			Person rohit = new Person("Rohit");
			List<Address> rohitAddresses = new ArrayList<>();
			Address existingDelhiFlat = session.get(Address.class, 2l);
			rohitAddresses.add(existingDelhiFlat);
			rohit.setAddresses(rohitAddresses);
			
			session.save(rohit);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
