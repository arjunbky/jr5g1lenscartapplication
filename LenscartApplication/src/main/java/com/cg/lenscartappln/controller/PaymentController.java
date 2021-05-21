package com.cg.lenscartappln.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.dto.PaymentDto;
import com.cg.lenscartappln.entity.Payment;
import com.cg.lenscartappln.service.PaymentService;
import com.cg.lenscartappln.utils.PaymentNotFoundException;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	PaymentService service;
	
	@PostMapping
	public ResponseEntity<String> addPayment(@RequestBody PaymentDto paymentDto){
		service.addPayment(paymentDto);
		return new ResponseEntity<String>("Customer Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Payment>> getAllPayment(){
		List<Payment> paymentList=service.getAllPayment();
		return new ResponseEntity<List<Payment>>(paymentList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletepayment")
	public ResponseEntity<String> cancelAllPayment(@RequestParam int paymentId) throws PaymentNotFoundException{
		String str=service.cancelAllPayment(paymentId);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	
	
	
	}
	


