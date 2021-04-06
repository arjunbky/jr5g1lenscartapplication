package com.cg.lenscartappln.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
		
		@OneToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "order_id")
		private Orders orders;
		public Payment() {
			
		}
		public Payment(int payment_id, String card_name, int cvv, Date expiry_date, long card_number,Orders orders) {
			super();
			this.payment_id = payment_id;
			this.card_name = card_name;
			this.cvv = cvv;
			this.expiry_date = expiry_date;
			this.card_number = card_number;
			this.orders=orders;
		}
		
	

}