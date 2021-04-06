package com.cg.lenscartappln.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Lenses")
public class Lenses {
	public Lenses() {
	// TODO Auto-generated constructor stub
}
	public Lenses(int lens_id, float lens_power, String lens_brand, String lens_type, double lens_price) {
		this.lens_id = lens_id;
		this.lens_power = lens_power;
		this.lens_brand = lens_brand;
		this.lens_type = lens_type;
		this.lens_price = lens_price;
	}
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lens_id;
	
	@Column(name="lens_power",length=30,nullable=false)
	private float lens_power;
	
	@Column(name="lens_brand",length=50)
	private String lens_brand;
	
	@Column(name="lens_type",length=100)
	private String lens_type;
	
	@Column(name="lens_price")
	private double lens_price;

	public int getLens_id() {
		return lens_id;
	}

	public void setLens_id(int lens_id) {
		this.lens_id = lens_id;
	}

	public float getLens_power() {
		return lens_power;
	}

	public void setLens_power(float lens_power) {
		this.lens_power = lens_power;
	}

	public String getLens_brand() {
		return lens_brand;
	}

	public void setLens_brand(String lens_brand) {
		this.lens_brand = lens_brand;
	}

	public String getLens_type() {
		return lens_type;
	}

	public void setLens_type(String lens_type) {
		this.lens_type = lens_type;
	}

	public double getLens_price() {
		return lens_price;
	}

	public void setLens_price(double lens_price) {
		this.lens_price = lens_price;
	}
	

}
