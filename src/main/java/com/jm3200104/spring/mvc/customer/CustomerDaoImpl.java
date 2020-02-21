package com.jm3200104.spring.mvc.customer;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Long createCustomer(Customer customer) {
		return (Long) sessionFactory.getCurrentSession().save(customer);
	}

	@Override
	public void createOrUpdateCustomer(Customer customer) {
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(Long ID) {
		return sessionFactory.getCurrentSession().get(Customer.class, ID);
	}

	@Override
	public List<Customer> getCustomers() {
		return sessionFactory.getCurrentSession().createQuery("from Customer order by id").getResultList();
	}

	@Override
	public void deleteCustomer(Long customerId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("DELETE FROM Customer WHERE customerID=:customerID");
		query.setParameter("customerID", customerId);
		query.executeUpdate();
	}

}
