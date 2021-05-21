package com.cg.lenscartappln.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="Lenses")
public class Lenses {
	public Lenses() {
	
}
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lensId;
	
	@Column(name="lensPower",length=30,nullable=false)
	private float lensPower;
	
	@Column(name="lensBrand",length=50)
	private String lensBrand;
	
	@Column(name="lensType",length=100)
	private String lensType;
	
	@Column(name="lensPrice")
	private double lensPrice;
	
	@ManyToOne
	@JoinColumn(name="cartId")
	@JsonBackReference
	private Cart cart;

	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
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
