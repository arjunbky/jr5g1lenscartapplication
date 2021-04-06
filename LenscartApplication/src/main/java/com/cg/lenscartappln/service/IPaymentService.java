package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.entity.Payment;

public interface IPaymentService {
	public void addPayment(Payment payment);
	public List<Payment> getAllPayment();
}
