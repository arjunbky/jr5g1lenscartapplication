package com.cg.lenscartappln.service;


import java.util.List;

import com.cg.lenscartappln.entity.Customer;

public interface ICustomerService {
	public void addCustomer(Customer customer);
	public List<Customer> getAllCustomer();
	public String deleteCustomer(int customer_id);
	public String modifyCustomer(int customer_id, Customer cust);
}