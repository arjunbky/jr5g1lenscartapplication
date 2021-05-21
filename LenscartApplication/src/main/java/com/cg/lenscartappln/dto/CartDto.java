package com.cg.lenscartappln.dto;

import java.util.List;

import com.cg.lenscartappln.entity.Customer;

public class CartDto {
	private int cartId;
	private int totalFrames;
	private int totalLenses;
	private int quantity;
	private List<FramesDto> frames;
	private List<LensesDto> lenses;
    private Customer customer;
	
	
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getTotalFrames() {
		return totalFrames;
	}
	public void setTotalFrames(int totalFrames) {
		this.totalFrames = totalFrames;
	}
	public int getTotalLenses() {
		return totalLenses;
	}
	public void setTotalLenses(int totalLenses) {
		this.totalLenses = totalLenses;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<FramesDto> getFrames() {
		return frames;
	}
	public void setFrames(List<FramesDto> frames) {
		this.frames = frames;
	}
	public List<LensesDto> getLenses() {
		return lenses;
	}
	public void setLenses(List<LensesDto> lenses) {
		this.lenses = lenses;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

	
	
}
