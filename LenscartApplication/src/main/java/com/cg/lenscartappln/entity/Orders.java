package com.cg.lenscartappln.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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
	private int order_id;
	

	
	@Column(name="total_cost")
	private double total_cost;
	
	

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

	public Customer getCustomer(int customer_id) {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name="date_of_order")
	private Date date_of_order;
	
	@Column(name="expected_date_of_arrival")
	private Date expected_date_of_arrival;
	
	@OneToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
	
	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	public Orders() {
		
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Orders(int order_id, double total_cost,Date date_of_order, Date expected_date_of_arrival, Cart cart,Customer customer) {
		this.order_id = order_id;
		this.total_cost = total_cost;
		this.date_of_order = date_of_order;
		this.expected_date_of_arrival = expected_date_of_arrival;
		this.cart=cart;
		this.customer=customer;
	}

	

	
	

}