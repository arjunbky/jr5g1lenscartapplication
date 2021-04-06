package com.cg.lenscartappln.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Frames")
public class Frames  implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int frame_id;
	
	@Column(name="frame_shape",length=50,nullable=false)
	private String frame_shape;
	
	@Column(name="frame_colour",length=50)
	private String frame_colour;
	
	@Column(name="frame_brand",length=50)
	private String frame_brand;
	
	@Column(name="frame_price")
	private double frame_price;
	
	public Frames() {
		// TODO Auto-generated constructor stub
	}

	public int getFrame_id() {
		return frame_id;
	}

	public void setFrame_id(int frame_id) {
		this.frame_id = frame_id;
	}

	public String getFrame_shape() {
		return frame_shape;
	}

	public void setFrame_shape(String frame_shape) {
		this.frame_shape = frame_shape;
	}

	public String getFrame_colour() {
		return frame_colour;
	}

	public void setFrame_colour(String frame_colour) {
		this.frame_colour = frame_colour;
	}

	public String getFrame_brand() {
		return frame_brand;
	}

	public void setFrame_brand(String frame_brand) {
		this.frame_brand = frame_brand;
	}

	public double getFrame_price() {
		return frame_price;
	}

	public void setFrame_price(double frame_price) {
		this.frame_price = frame_price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Frames [frame_id=" + frame_id + ", frame_shape=" + frame_shape + ", frame_colour=" + frame_colour
				+ ", frame_brand=" + frame_brand + ", frame_price=" + frame_price + "]";
	}

	

	
	

}
