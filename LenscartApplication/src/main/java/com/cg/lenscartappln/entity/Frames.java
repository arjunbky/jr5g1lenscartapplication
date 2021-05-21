package com.cg.lenscartappln.entity;
import java.io.Serializable;

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
@Table(name="Frames")
public class Frames  implements Serializable {
public Frames() {
	
}




	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int frameId;
	
	@Column(name="frameShape",length=50,nullable=false)
	private String frameShape;
	
	@Column(name="frameColour",length=50)
	private String frameColour;
	
	@Column(name="frameBrand",length=50)
	private String frameBrand;
	
	@Column(name="framePrice")
	private double framePrice;
	
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

	

	

	
	

}
