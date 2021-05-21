package com.cg.lenscartappln.service;


import java.util.List;

import com.cg.lenscartappln.dto.CustomerDto;
import com.cg.lenscartappln.entity.Address;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.utils.CustomerNotFoundException;

public interface ICustomerService {
	public void addCustomer(CustomerDto customerDto)throws CustomerNotFoundException;
	public List<Customer> getAllCustomer()throws CustomerNotFoundException;
	public String deleteCustomer(int customerId)throws CustomerNotFoundException;
	public String modifyCustomer(int customerId, Customer cust)throws CustomerNotFoundException;
	public Customer validate(String emailId,String password);
}