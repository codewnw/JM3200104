package com.jm3200104.spring.mvc.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public Long createCustomer(Customer customer) {
		return customerDao.createCustomer(customer);
	}

	@Override
	public Customer getCustomer(Long ID) {
		return customerDao.getCustomer(ID);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.getCustomers();
	}

	@Override
	public void createOrUpdateCustomer(Customer customer) {
		customerDao.createOrUpdateCustomer(customer);
	}

	@Override
	public void deleteCustomer(Long customerId) {
		customerDao.deleteCustomer(customerId);
	}

}
