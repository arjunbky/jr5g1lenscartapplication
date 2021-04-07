package com.cg.lenscartappln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.service.CustomerService;
import com.cg.lenscartappln.utils.CustomerNotFoundException;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping("/insertcustomer")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		service.addCustomer(customer);
		return new ResponseEntity<String>("Customer Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> customerList=service.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletecustomer")
	public ResponseEntity<String> deleteCustomer(@RequestBody int customer_id) throws CustomerNotFoundException{
		String str=service.deleteCustomer(customer_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updatecust/{code}")
	public ResponseEntity<String> modifyCustomer(@PathVariable int customer_id,@RequestBody Customer cust) throws CustomerNotFoundException{
		String str=service.modifyCustomer(customer_id, cust);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
