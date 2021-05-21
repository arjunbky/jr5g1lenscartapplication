package com.cg.lenscartappln.dto;


public class LensesDto {
	private int lensId;
	private float lensPower;
	private String lensBrand;
	private String lensType;
	private double lensPrice;
	private CartDto cart;
	
	
	public CartDto getCart() {
		return cart;
	}
	public void setCart(CartDto cart) {
		this.cart = cart;
	}
	public int getLensId() {
		return lensId;
	}
	public void setLensId(int lensId) {
		this.lensId = lensId;
	}
	public float getLensPower() {
		return lensPower;
	}
	public void setLensPower(float lensPower) {
		this.lensPower = lensPower;
	}
	public String getLensBrand() {
		return lensBrand;
	}
	public void setLensBrand(String lensBrand) {
		this.lensBrand = lensBrand;
	}
	public String getLensType() {
		return lensType;
	}
	public void setLensType(String lensType) {
		this.lensType = lensType;
	}
	public double getLensPrice() {
		return lensPrice;
	}
	public void setLensPrice(double lensPrice) {
		this.lensPrice = lensPrice;
	}


	
}
