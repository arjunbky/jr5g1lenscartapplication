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
		private int paymentId;
		@Column(name="cardName",length=30)
		private String cardName;
		@Column(name="cvv",length=3)
		private int cvv;
		@Column(name="expiryDate")
		private Date expiryDate;
		@Column(name="cardNumber",length=16)
		private long cardNumber;
		
		@OneToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "orderId")
		private Orders orders;
		
		@Column(name="paymentStatus")
		private boolean paymentStatus;
		public Payment() {
			
		}
		public int getPaymentId() {
			return paymentId;
		}
		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}
		public String getCardName() {
			return cardName;
		}
		public void setCardName(String cardName) {
			this.cardName = cardName;
		}
		public int getCvv() {
			return cvv;
		}
		public void setCvv(int cvv) {
			this.cvv = cvv;
		}
		public Date getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
		}
		public long getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(long cardNumber) {
			this.cardNumber = cardNumber;
		}
		public Orders getOrders() {
			return orders;
		}
		public void setOrders(Orders orders) {
			this.orders = orders;
		}
		public boolean isPaymentStatus() {
			return paymentStatus;
		}
		public void setPaymentStatus(boolean paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
		
	

}