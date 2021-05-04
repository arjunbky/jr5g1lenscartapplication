package com.cg.lenscartappln.dto;

import java.util.Date;

import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Customer;

public class OrdersDto {
	private int order_id;
	private double total_cost;
	private Date date_of_order;
	private Date expected_date_of_arrival;
	
	private Cart cart;
	private Customer customer;
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}
	public Date getDate_of_order() {
		return date_of_order;
	}
	public void setDate_of_order(Date date_of_order) {
		this.date_of_order = date_of_order;
	}
	public Date getExpected_date_of_arrival() {
		return expected_date_of_arrival;
	}
	public void setExpected_date_of_arrival(Date expected_date_of_arrival) {
		this.expected_date_of_arrival = expected_date_of_arrival;
	}

	
	
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
