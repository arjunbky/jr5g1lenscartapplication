package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.entity.Orders;

public interface IOrdersService {
	public void addOrders(Orders orders);
	public List<Orders> getAllOrders();
	public Orders getOrdersByCartId(int cart_id);
	public List<Orders> getCustomerDetails(int customer_id);

}
