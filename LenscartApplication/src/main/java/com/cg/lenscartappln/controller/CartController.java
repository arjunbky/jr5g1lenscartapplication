package com.cg.lenscartappln.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.dto.CartDto;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.service.CartService;
import com.cg.lenscartappln.utils.CartNotFoundException;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService cartService;
	@PostMapping("/insertcart")
	public ResponseEntity<String> addCart(@RequestBody Cart cart){
		System.out.println(cart);
		cartService.addCart(cart);
		return new ResponseEntity<String>("Cart Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<CartDto>> getAllCarts(){
		List<CartDto> cartList=cartService.getAllCarts();
		return new ResponseEntity<List<CartDto>>(cartList,HttpStatus.OK);
	}
	@GetMapping("/byid")
	public ResponseEntity<Optional<Cart>> getCartById(@RequestParam int cart_id) throws CartNotFoundException{
		Optional<Cart> cart =cartService.getCartById(cart_id);
		return new ResponseEntity<Optional<Cart>>(cart,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletecart")
	public ResponseEntity<String> deleteCart(@RequestParam int cart_id) throws CartNotFoundException{
		cartService.deleteCart(cart_id);
		return new ResponseEntity<String>("Cart deleted",HttpStatus.OK);
	}

}
