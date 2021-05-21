package com.cg.lenscartappln.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IAddressDao;
import com.cg.lenscartappln.dao.ICustomerDao;
import com.cg.lenscartappln.dto.CustomerDto;
import com.cg.lenscartappln.entity.Address;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.utils.CustomerNotFoundException;


@Service
public class CustomerService implements ICustomerService {
	@Autowired
	ICustomerDao customerDao;
	@Autowired
	IAddressDao addressDao;
	
	public Customer validate(String emailId,String password) {
		Customer customer =customerDao.validate(emailId,password);
		if(customer ==null) {
			customer=new Customer();
			customer.setMessage("Invalid email");
		}
		return customer;
	}
	
	//** method to add customer details to the customer table**
	public void addCustomer(CustomerDto customerdto) {

		Customer customer=new Customer();
		Address address=new Address();
    	address.setAddressId(customerdto.getAddressId());
		address.setHouseNumber(customerdto.getHouseNumber());
		address.setCity(customerdto.getCity());
		address.setStreetName(customerdto.getStreetName());
		address.setState(customerdto.getState());
		address.setPincode(customerdto.getPincode());
	 
		if(addressDao.findById(address.getAddressId()).isEmpty()) {
			

			customer.setFirstName(customerdto.getFirstName());
			customer.setLastName(customerdto.getLastName());
			customer.setEmailId(customerdto.getEmailId());
			customer.setPassword(customerdto.getPassword());
            customer.setPhoneNumber(customerdto.getPhoneNumber());
            customer.setRole(customerdto.getRole());

			customer.setAddress(address);
			addressDao.save(address);
			   customerDao.save(customer);
			}
		else {
		customer.setMessage("invalid Address");
		customerDao.save(customer);
		}
		
		
	}
//** method to get all the customer details **
	public List<Customer> getAllCustomer(){
		List<Customer> custList=customerDao.findAll();
		return custList;
	}
//** method to delete the customer based on customer_id**
	public String deleteCustomer(int customerId) throws CustomerNotFoundException {
		if(customerDao.existsById(customerId)) {
			customerDao.deleteById(customerId);
			return "Customer Deleted";
		}
		else
			throw new CustomerNotFoundException();
	}
//**method to update the existing customer details in the table**
	public String modifyCustomer(int customerId,Customer cust) throws CustomerNotFoundException {
		if(customerDao.existsById(customerId)) {
			Customer customer=customerDao.findById(customerId).get();
			customer.setFirstName(cust.getFirstName());
			customer.setLastName(cust.getLastName());
			customer.setPhoneNumber(cust.getPhoneNumber());
			customer.setEmailId(cust.getEmailId());
			customer.setPassword(cust.getPassword());
			
			
			customerDao.save(customer);
			return "Customer Updated";
		}
		else
			throw new CustomerNotFoundException();
	}


}