package com.cg.lenscartappln.service;


import java.util.List;

import com.cg.lenscartappln.dto.CustomerDto;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.utils.CustomerNotFoundException;

public interface ICustomerService {
	public void addCustomer(CustomerDto customerdto)throws CustomerNotFoundException;
	public List<Customer> getAllCustomer()throws CustomerNotFoundException;
	public String deleteCustomer(int customer_id)throws CustomerNotFoundException;
	public String modifyCustomer(int customer_id, CustomerDto cust)throws CustomerNotFoundException;
	public Customer validate(String email_id,String password);
}