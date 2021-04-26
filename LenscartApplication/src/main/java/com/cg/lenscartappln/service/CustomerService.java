package com.cg.lenscartappln.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.lenscartappln.dao.ICustomerDao;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.utils.CustomerNotFoundException;


@Service
public class CustomerService implements ICustomerService {
	@Autowired
	ICustomerDao customerDao;
	
	public Customer validate(String email_id,String password) {
		Customer customer =customerDao.validate(email_id,password);
		if(customer ==null) {
			customer=new Customer();
			customer.setMessage("Invalid email");
		}
		return customer;
	}
	
	//** method to add customer details to the customer table**
	public void addCustomer(Customer customer) {
		customerDao.save(customer);  
	}
//** method to get all the customer details **
	public List<Customer> getAllCustomer(){
		List<Customer> custList=customerDao.findAll();
		return custList;
	}
//** method to delete the customer based on customer_id**
	public String deleteCustomer(int customer_id) throws CustomerNotFoundException {
		if(customerDao.existsById(customer_id)) {
			customerDao.deleteById(customer_id);
			return "Customer Deleted";
		}
		else
		throw new CustomerNotFoundException();
	}
//**method to update the existing customer details in the table**
	public String modifyCustomer(int customer_id,Customer cust) throws CustomerNotFoundException {
		if(customerDao.existsById(customer_id)) {
			Customer customer=customerDao.findById(customer_id).get();
			customer.setFirst_name(cust.getFirst_name());
			customer.setLast_name(cust.getLast_name());
			customer.setPhone_number(cust.getPhone_number());
			customer.setEmail_id(cust.getEmail_id());
			customer.setPassword(cust.getPassword());
			customer.setHouse_number(cust.getHouse_number());
			customer.setCity(cust.getCity());
			customer.setState(cust.getState());
			customer.setPincode(cust.getPincode());
			
			customerDao.save(customer);
			return "Customer Updated";
		}
		else
			throw new CustomerNotFoundException();
	}

}