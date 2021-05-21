package com.cg.lenscartappln.dto;


public class FramesDto {

	private int frameId;
	private String frameShape;
	private String frameColour;
	private String frameBrand;
	private double framePrice;
	private CartDto cart;
	
	
	
	public int getFrameId() {
		return frameId;
	}
	public void setFrameId(int frameId) {
		this.frameId = frameId;
	}
	public String getFrameShape() {
		return frameShape;
	}
	public void setFrameShape(String frameShape) {
		this.frameShape = frameShape;
	}
	public String getFrameColour() {
		return frameColour;
	}
	public void setFrameColour(String frameColour) {
		this.frameColour = frameColour;
	}
	public String getFrameBrand() {
		return frameBrand;
	}
	public void setFrameBrand(String frameBrand) {
		this.frameBrand = frameBrand;
	}
	public double getFramePrice() {
		return framePrice;
	}
	public void setFramePrice(double framePrice) {
		this.framePrice = framePrice;
	}
	public CartDto getCart() {
		return cart;
	}
	public void setCart(CartDto cart) {
		this.cart = cart;
	}
	}

