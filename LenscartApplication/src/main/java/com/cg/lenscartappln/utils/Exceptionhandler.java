package com.cg.lenscartappln.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptionhandler {
	@ExceptionHandler(value = FrameNotFoundException.class)
	public ResponseEntity<Object> exception(FrameNotFoundException exception){
		return new ResponseEntity<Object>("Frame not found...",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = LensesNotFoundException.class)
	public ResponseEntity<Object> exception(LensesNotFoundException exception){
		return new ResponseEntity<Object>("Lense not found...",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = OrdersNotFoundException.class)
	public ResponseEntity<Object> exception(OrdersNotFoundException exception){
		return new ResponseEntity<Object>("Orders not found...",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = PaymentNotFoundException.class)
	public ResponseEntity<Object> exception(PaymentNotFoundException exception){
		return new ResponseEntity<Object>("Payment not found...",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<Object> exception(CustomerNotFoundException exception){
		return new ResponseEntity<Object>("Customer not found...",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value = AddressNotFoundException.class)
	public ResponseEntity<Object> exception(AddressNotFoundException exception){
		return new ResponseEntity<Object>("Address not found...",HttpStatus.NOT_FOUND);
	}
	

}
