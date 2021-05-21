package com.cg.lenscartappln.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.dto.OrdersDto;
import com.cg.lenscartappln.entity.Orders;
import com.cg.lenscartappln.service.OrdersService;
import com.cg.lenscartappln.utils.OrdersNotFoundException;

@RestController
@RequestMapping("/order")
public class OrdersController {

	@Autowired
	OrdersService service;
	@PostMapping("/insertorder")
	public ResponseEntity<String> addOrders(@RequestBody OrdersDto ordersDto){
		service.addOrders(ordersDto);
		return new ResponseEntity<String>("Order Added",HttpStatus.OK);
	}
	@GetMapping
   public ResponseEntity<List<Orders>> getAllOrders(){
		List<Orders> ordersList=service.getAllOrders();
		return new ResponseEntity<List<Orders>>(ordersList,HttpStatus.OK);
	}
	@DeleteMapping("/deleteorder")
	public ResponseEntity<String> deleteOrders(@RequestParam int orderId) throws OrdersNotFoundException{
		String str=service.deleteOrder(orderId);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updateorder/{code}")
	public ResponseEntity<String> modifyOrder(@RequestParam int orderId,@RequestBody Orders order) throws OrdersNotFoundException{
		String str=service.modifyOrder(orderId, order);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}


