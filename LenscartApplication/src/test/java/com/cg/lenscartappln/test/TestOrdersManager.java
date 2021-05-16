package com.cg.lenscartappln.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.cg.lenscartappln.dao.IOrdersDao;
import com.cg.lenscartappln.entity.Address;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.entity.Orders;
import com.cg.lenscartappln.service.OrdersService;

public class TestOrdersManager {
	@InjectMocks
	OrdersService orderService;
	
	@Mock
	IOrdersDao orderDao;
	


@Test
public void testgetOrders() {

 
	
	
	Cart cart=new Cart();
	cart.setCart_id(1);
	cart.setFrames(null);
	cart.setLenses(null);

	

	Address address = new Address();
	address.setAddress_id(0);
	address.setHouse_number("4-33a");
	address.setStreet_name("mg road");
	address.setCity("Udupi");
	address.setState("Karnataka");
	address.setPincode(576122);
	
	 
	Customer customer = new Customer();
	customer.setCustomer_id(2);
	customer.setFirst_name("Roshni");
	customer.setLast_name("Kumar");
	customer.setPhone_number(355);
	customer.setEmail_id("rosh@gmail.com");
	customer.setPassword("abc");
	customer.setAddress(address);
	
	Date dateOfOrder=Date.valueOf("2021-03-09");
	Date dateOfArrival=Date.valueOf("2021-04-01");
	
	List<Orders> ordersList=new ArrayList<>();
	
	ordersList.add(new Orders(2,345.3,dateOfOrder,dateOfArrival,cart,customer)); 
	Mockito.when(orderDao.findAll()).thenReturn(ordersList);
	List<Orders> list=orderService.getAllOrders();
	Assertions.assertEquals(1,list.size());
	Mockito.verify(orderDao,Mockito.times(1)).findAll();
	
}
}