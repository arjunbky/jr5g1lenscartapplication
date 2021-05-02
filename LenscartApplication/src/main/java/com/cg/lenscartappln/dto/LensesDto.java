package com.cg.lenscartappln.dto;

import com.cg.lenscartappln.entity.Cart;

public class LensesDto {
	private int lens_id;
	private float lens_power;
	private String lens_brand;
	private String lens_type;
	private double lens_price;
	private CartDto cart;
	
	
	public CartDto getCart() {
		return cart;
	}
	public void setCart(CartDto cart) {
		this.cart = cart;
	}
	public int getLens_id() {
		return lens_id;
	}
	public void setLens_id(int lens_id) {
		this.lens_id = lens_id;
	}
	public float getLens_power() {
		return lens_power;
	}
	public void setLens_power(float lens_power) {
		this.lens_power = lens_power;
	}
	public String getLens_brand() {
		return lens_brand;
	}
	public void setLens_brand(String lens_brand) {
		this.lens_brand = lens_brand;
	}
	public String getLens_type() {
		return lens_type;
	}
	public void setLens_type(String lens_type) {
		this.lens_type = lens_type;
	}
	public double getLens_price() {
		return lens_price;
	}
	public void setLens_price(double lens_price) {
		this.lens_price = lens_price;
	}

	
}
