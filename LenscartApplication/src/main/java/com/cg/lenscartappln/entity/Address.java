package com.cg.lenscartappln.entity;
import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
@Entity
@Table(name="Address")
public class Address  implements Serializable    { 



	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="House_number")
private String House_number;
@Column (name=" Street_name",length=20)
private String Street_name;
@Column (name="City ",length=20)
private String City;
@Column(name="State",length=20)
private String State;
@Column(name="Pincode",length=6)
private int Pincode;

public String getHouse_number() {
	return House_number;
}
public void setHouse_number(String house_number) {
	House_number = house_number;
}
public String getStreet_name() {
	return Street_name;
}
public void setStreet_name(String street_name) {
	Street_name = street_name;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public int getPincode() {
	return Pincode;
}
public void setPincode(int pincode) {
	Pincode = pincode;
}
public Address () {
		
	}
public  Address(String House_number, String Street_name, String City, String State, int Pincode)  {
 super();
this. House_number=House_number;
this. Street_name= Street_name;
this .City =  City;
this.State = State;
this.Pincode=Pincode ;
}
}