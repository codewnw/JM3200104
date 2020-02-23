package com.jm3200104.spring.mvc.customer;

import java.util.List;

public interface CustomerDao {

	Long createCustomer(Customer customer);

	Customer getCustomer(Long ID);

	List<Customer> getCustomers();

	void createOrUpdateCustomer(Customer customer);

	void deleteCustomer(Long customerId);

}
