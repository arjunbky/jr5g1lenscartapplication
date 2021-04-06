package com.cg.lenscartappln.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IAddressDao;
import com.cg.lenscartappln.dao.ICustomerDao;
import com.cg.lenscartappln.entity.Customer;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	ICustomerDao customerDao;
	@Autowired
	IAddressDao addressDao;
	public void addCustomer(Customer customer) {
		customerDao.save(customer);  
	}
	public List<Customer> getAllCustomer(){
		List<Customer> custList=customerDao.findAll();
		return custList;
	}
	public String deleteCustomer(int customer_id) {
		if(customerDao.existsById(customer_id)) {
			customerDao.deleteById(customer_id);
			return "Customer Deleted";
		}
		return "Customer not found";
	}
	public String modifyCustomer(int customer_id,Customer cust) {
		if(customerDao.existsById(customer_id)) {
			Customer customer=customerDao.findById(customer_id).get();
			customer.setFirst_name(cust.getFirst_name());
			customer.setLast_name(cust.getLast_name());
			customer.setPhone_number(cust.getPhone_number());
			customer.setEmail_id(cust.getEmail_id());
			customer.setPassword(cust.getPassword());
			addressDao.save(cust.getAddress());
			customerDao.save(customer);
			return "Customer Updated";
		}
		return "Customer not found";
	}

}