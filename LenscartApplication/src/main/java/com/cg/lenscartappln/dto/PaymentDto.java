package com.cg.lenscartappln.dto;

import java.util.Date;

public class PaymentDto {
	private int payment_id;
	private String card_name;
	private int cvv;
	private Date expiry_date;
	private long card_number;
	private int  order_id;
	private boolean payment_status;
	public PaymentDto(int payment_id, String card_name, int cvv, Date expiry_date, long card_number, int order_id,boolean payment_status) {
		this.payment_id = payment_id;
		this.card_name = card_name;
		this.cvv = cvv;
		this.expiry_date = expiry_date;
		this.card_number = card_number;
		this.order_id = order_id;
		this.payment_status= payment_status;
	}
	public boolean isPayment_status() {
		return payment_status;
	}
	public void setPayment_status(boolean payment_status) {
		this.payment_status = payment_status;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	public long getCard_number() {
		return card_number;
	}
	public void setCard_number(long card_number) {
		this.card_number = card_number;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
}
