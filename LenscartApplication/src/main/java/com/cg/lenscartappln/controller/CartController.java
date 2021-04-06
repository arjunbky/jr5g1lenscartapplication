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

import com.cg.lenscartappln.dto.CartDto;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.service.CartService;
import com.cg.lenscartappln.utils.CartNotFoundException;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService service;
	@PostMapping("/insertcart")
	public ResponseEntity<String> addCart(@RequestBody CartDto cartdto){
		System.out.println(cartdto);
		service.addCart(cartdto);
		return new ResponseEntity<String>("Cart Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Cart>> getAllCarts(){
		List<Cart> cartList=service.getAllCarts();
		return new ResponseEntity<List<Cart>>(cartList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletecart")
	public ResponseEntity<String> deleteCart(@RequestBody int cart_id) throws CartNotFoundException{
		String str=service.deleteCart(cart_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
//	@PutMapping("/updatecart/{code}")
//	public ResponseEntity<String> modifyCart(@PathVariable int cart_id,@RequestBody Cart cart){
//		String str=service.modifyCart(cart_id, cart);
//		return new ResponseEntity<String>(str,HttpStatus.OK);
//	}


}
