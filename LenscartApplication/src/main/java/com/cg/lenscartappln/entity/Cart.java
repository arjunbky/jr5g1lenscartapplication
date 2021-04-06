 package com.cg.lenscartappln.entity;
import java.io.Serializable;

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
@Table(name="Cart")
public class Cart  implements Serializable    { 
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cart_id;
@Column
private int quantity;
@Column
private double price;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "frame_id")
private Frames frames;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "lens_id")
private Lenses lenses;




//public Cart(CartDto cartDto,int cart_id, int quantity, double price, Frames frames, Lenses lenses) {
//	this.cart_id = cart_id;
//	this.quantity = quantity;
//	this.price = price;
//	this.frames = frames;
//	this.lenses = lenses;
//}

public int getCart_id() {
	return cart_id;
}
public void setCart_id(int cart_id) {
	this.cart_id = cart_id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int number_of_products) {
	this.quantity = number_of_products;
}
public double getPrice() {
	return price;
}
public void setPrice(double d) {
	this.price = d;
}

public Frames getFrames() {
	return frames;
}
public void setFrames(Frames frames) {
	this.frames = frames;
}
public Lenses getLenses() {
	return lenses;
}
public void setLenses(Lenses lenses) {
	this.lenses = lenses;
}


}