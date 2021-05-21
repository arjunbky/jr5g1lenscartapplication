 package com.cg.lenscartappln.entity;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="Cart")
public class Cart  implements Serializable    { 
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cartId;



@OneToMany(mappedBy = "cart")
@JsonManagedReference
private List<Frames> frames;

@OneToMany(mappedBy="cart")
@JsonManagedReference
private List<Lenses> lenses;

@OneToOne(targetEntity = Customer.class)
@JoinColumn(name = "customerId",unique = true)
private Customer customer;

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

public Cart() {
	
}


public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
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
	return "Cart [cartId=" + cartId + " frames=" + frames
			+ ", lenses=" + lenses + "]";
}



}