package com.cg.lenscartappln.dto;

public class CartDto {
	private int quantity;
	private double price;
	private int frame_id;
	private int lens_id;
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getFrame_id() {
		return frame_id;
	}
	public void setFrame_id(int frame_id) {
		this.frame_id = frame_id;
	}
	public int getLens_id() {
		return lens_id;
	}
	public void setLens_id(int lens_id) {
		this.lens_id = lens_id;
	}
	@Override
	public String toString() {
		return "CartDto [cart_id=" + ", quantity=" + quantity + ", price=" + price + ", frame_id=" + frame_id
				+ ", lens_id=" + lens_id + "]";
	}

}
