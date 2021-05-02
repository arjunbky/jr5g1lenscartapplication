package com.cg.lenscartappln.dto;

import java.util.List;

public class CartDto {
	private int cart_id;
	private int totalFrames;
	private int totalLenses;
	private int quantity;
	private List<FramesDto> frames;
	private List<LensesDto> lenses;

	
	
	
	
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
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
	
	

	
	
}
