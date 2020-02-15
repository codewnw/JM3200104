package com.jm3200104.hibernate.association.onetoone.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Trainee.class).addAnnotatedClass(Result.class).buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			// save
//			Result result = new Result("Fail");
//			Trainee trainee = new Trainee("Rishabh", result);
//			session.save(trainee);

			// get
			Trainee trainee = session.get(Trainee.class, 2l);
			System.out.println(trainee);

			// update
//			Trainee trainee = session.get(Trainee.class, 2l);
//			trainee.setName("Rishabh Pant");
//			trainee.getResult().setStatus("Pass");

			// remove
//			Trainee trainee = session.get(Trainee.class, 2l);
//			session.delete(trainee);
			

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
