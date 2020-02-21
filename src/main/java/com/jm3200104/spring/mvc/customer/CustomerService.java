package com.jm3200104.spring.mvc.customer;

import java.util.List;

public interface CustomerService {

	public Long createCustomer(Customer customer);

	public Customer getCustomer(Long ID);

	public List<Customer> getCustomers();

	public void createOrUpdateCustomer(Customer customer);

	public void deleteCustomer(Long customerId);

}
