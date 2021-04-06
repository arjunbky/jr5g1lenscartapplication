package com.cg.lenscartappln.entity;
import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;
@Entity
@Table(name="Address")
public class Address  implements Serializable    { 



	private static final long serialVersionUID = 1L;

@Id

@Column(name=" House_number",length=5)
private String House_number;
@Column (name=" Street_name",length=20)
private String Street_name;
@Column (name="City ",length=20)
private String City;
@Column(name="State",length=20)
private String State;
@Column(name="Pincode",length=6)
private int Pincode;

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