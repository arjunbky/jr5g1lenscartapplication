package com.cg.lenscartappln.dto;

import java.util.Date;

public class OrdersDto {
	private int order_id;
	private double total_cost;
	private Date date_of_order;
	private Date expected_date_of_arrival;
	
	private int cart_id;
	private int customer_id;
	public OrdersDto(int order_id, double total_cost, Date date_of_order, Date expected_date_of_arrival, int cart_id, int customer_id) {
		this.order_id = order_id;
		this.total_cost = total_cost;
		this.date_of_order = date_of_order;
		this.expected_date_of_arrival = expected_date_of_arrival;
		this.cart_id = cart_id;
		this.customer_id = customer_id;
	}
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

	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
}
