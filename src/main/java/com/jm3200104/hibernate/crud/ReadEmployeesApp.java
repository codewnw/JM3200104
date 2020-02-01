package com.jm3200104.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadEmployeesApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			//List<Employee>  empoyees = session.createQuery("from Employee").getResultList();
			//List<Employee>  empoyees = session.createQuery("from Employee e where e.name = 'Rohit'").getResultList();
			//List<Employee>  empoyees = session.createQuery("from Employee e where e.age = 26").getResultList();
			List<Employee>  empoyees = session.createQuery("from Employee e where e.name = 'Rohit Sharma' AND e.age = 26").getResultList();
			
			
			
			
			
			
			System.out.println(empoyees);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}
}
