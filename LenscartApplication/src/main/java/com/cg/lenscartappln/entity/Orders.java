package com.cg.lenscartappln.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@Column(name="totalCost")
	private double totalCost;

	@Column(name="dateOfOrder")
	private Date dateOfOrder;
	
	@Column(name="expectedOateOfArrival")
	private Date expectedDateOfArrival;
	
	@OneToOne(targetEntity = Cart.class)
	@JoinColumn(name = "cartId")
	private Cart cart;
	
	
	@OneToOne(targetEntity = Customer.class)
	@JoinColumn(name = "customerId")
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