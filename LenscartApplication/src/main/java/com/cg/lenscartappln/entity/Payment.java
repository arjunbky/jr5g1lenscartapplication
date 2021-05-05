package com.cg.lenscartappln.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Payment")
public class Payment implements Serializable {

		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int payment_id;
		@Column(name="card_name",length=30)
		private String card_name;
		@Column(name="cvv",length=3)
		private int cvv;
		@Column(name="expiry_date")
		private Date expiry_date;
		@Column(name="card_number",length=16)
		private long card_number;
		
		@OneToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "order_id")
		private Orders orders;
		
		@Column(name="payment_status")
		private boolean payment_status;
		public Payment() {
			
		}
		
		public Payment(int payment_id, String card_name, int cvv, Date expiry_date, long card_number,Orders orders,boolean payment_status) {
			super();
			this.payment_id = payment_id;
			this.card_name = card_name;
			this.cvv = cvv;
			this.expiry_date = expiry_date;
			this.card_number = card_number;
			this.orders=orders;
			this.payment_status= payment_status;
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
		public Orders getOrders() {
			return orders;
		}
		public void setOrders(Orders orders) {
			this.orders = orders;
		}
		public boolean isPayment_status() {
			return payment_status;
		}
		public void setPayment_status(boolean payment_status) {
			this.payment_status = payment_status;
		}
		
	

}