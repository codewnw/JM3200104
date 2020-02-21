package com.jm3200104.spring.mvc.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/add")
	public String createCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "add-customer";
	}

	@Transactional
	@RequestMapping("/update")
	public String updateCustomer(@RequestParam("customerId") Long customerId, Model model) {
		Customer customer = customerService.getCustomer(customerId);
		model.addAttribute("customer", customer);
		return "add-customer";
	}

	@Transactional
	@RequestMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model) {
		customerService.createOrUpdateCustomer(customer);
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}

	@Transactional
	@RequestMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") Long customerId, Model model) {
		customerService.deleteCustomer(customerId);
		return listCustomer(model);
	}

	@Transactional
	@RequestMapping("/list")
	public String listCustomer(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "list-customers";
	}

}
