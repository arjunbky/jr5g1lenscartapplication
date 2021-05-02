package com.cg.lenscartappln.dto;


public class FramesDto {
	private int frame_id;
	private String frame_shape;
	private String frame_colour;
	private String frame_brand;
	private double frame_price;
	private CartDto cart;
	
	
	
	public int getFrame_id() {
		return frame_id;
	}
	public void setFrame_id(int frame_id) {
		this.frame_id = frame_id;
	}
	public String getFrame_shape() {
		return frame_shape;
	}
	public void setFrame_shape(String frame_shape) {
		this.frame_shape = frame_shape;
	}
	public String getFrame_colour() {
		return frame_colour;
	}
	public void setFrame_colour(String frame_colour) {
		this.frame_colour = frame_colour;
	}
	public String getFrame_brand() {
		return frame_brand;
	}
	public void setFrame_brand(String frame_brand) {
		this.frame_brand = frame_brand;
	}
	public double getFrame_price() {
		return frame_price;
	}
	public void setFrame_price(double frame_price) {
		this.frame_price = frame_price;
	
}
	public CartDto getCart() {
		return cart;
	}
	public void setCart(CartDto cart) {
		this.cart = cart;
	}
	}

