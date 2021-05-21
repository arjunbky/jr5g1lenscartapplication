package com.cg.lenscartappln.dto;

import java.util.Date;

import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Customer;

public class OrdersDto {
	private int orderId;
	private double totalCost;
	private Date dateOfOrder;
	private Date expectedDateOfArrival;
	
	private Cart cart;
	private Customer customer;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public Date getExpectedDateOfArrival() {
		return expectedDateOfArrival;
	}
	public void setExpectedDateOfArrival(Date expectedDateOfArrival) {
		this.expectedDateOfArrival = expectedDateOfArrival;
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
