 package com.cg.lenscartappln.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


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

@OneToMany(mappedBy = "cart",targetEntity =Frames.class, fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JsonManagedReference
private List<Frames> frames;

@OneToMany(mappedBy="cart")
private List<Lenses> lenses;




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
public void setPrice(double price) {
	this.price = price;
}


public List<Frames> getFrames() {
	return frames;
}
public void setFrames(List<Frames> frames) {
	this.frames = frames;
}

public List<Lenses> getLenses() {
	return lenses;
}
public void setLenses(List<Lenses> lenses) {
	this.lenses = lenses;
}
@Override
public String toString() {
	return "Cart [cart_id=" + cart_id + ", quantity=" + quantity + ", price=" + price + ", frames=" + frames
			+ ", lenses=" + lenses + "]";
}



}