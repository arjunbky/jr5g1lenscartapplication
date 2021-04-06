package com.cg.lenscartappln.dto;

import com.cg.lenscartappln.entity.Address;

public class CustomerDto {
	private int customer_id;
	private String first_name;
	private String last_name;
	private long phone_number;
	private String email_id;
	private String password;
	private int House_number ; 
	
	public CustomerDto(int customer_id, String first_name, String last_name, long phone_number, String email_id,
			String password, int house_number) {
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.email_id = email_id;
		this.password = password;
		this.House_number = house_number;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getHouse_number() {
		return House_number;
	}
	public void setHouse_number(int house_number) {
		House_number = house_number;
	}
}
