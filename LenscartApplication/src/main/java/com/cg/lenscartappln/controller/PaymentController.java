package com.cg.lenscartappln.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.entity.Payment;
import com.cg.lenscartappln.service.PaymentService;
import com.cg.lenscartappln.utils.PaymentNotFoundException;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentService service;
	
	@PostMapping("/insertpayment")
	public ResponseEntity<String> addPayment(@RequestBody Payment payment){
		service.addPayment(payment);
		return new ResponseEntity<String>("Customer Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Payment>> getAllPayment(){
		List<Payment> paymentList=service.getAllPayment();
		return new ResponseEntity<List<Payment>>(paymentList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletepayment")
	public ResponseEntity<String> cancelAllPayment(@RequestBody int payment_id) throws PaymentNotFoundException{
		String str=service.cancelAllPayment(payment_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	
	
	}
	


