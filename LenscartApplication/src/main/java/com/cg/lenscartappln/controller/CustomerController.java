
package com.cg.lenscartappln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.dto.CustomerDto;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.service.CartService;
import com.cg.lenscartappln.service.CustomerService;
import com.cg.lenscartappln.utils.CustomerNotFoundException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/customer")

public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/validate")
	public ResponseEntity<Customer> validate(@RequestBody Customer customer){
		Customer log=customerService.validate(customer.getEmailId(),customer.getPassword());
		Cart cart=new Cart();
		cart.setCartId(1);
		cartService.addCart(cart);
		return new ResponseEntity<Customer>(log,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto customerDto){
		customerService.addCustomer(customerDto);
		return new ResponseEntity<String>("Customer Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomer(){
		List<Customer> customerList=customerService.getAllCustomer();
		return new ResponseEntity<List<Customer>>(customerList,HttpStatus.OK);
	}
	@DeleteMapping("/deletecustomer")
	public ResponseEntity<String> deleteCustomer(@RequestParam int customerId) throws CustomerNotFoundException{
		String str=customerService.deleteCustomer(customerId);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updatecust")
	public ResponseEntity<String> modifyCustomer(@RequestParam int customerId,@RequestBody Customer cust) throws CustomerNotFoundException{
		String str=customerService.modifyCustomer(customerId, cust);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
