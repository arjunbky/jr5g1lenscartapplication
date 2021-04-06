package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.entity.Payment;
import com.cg.lenscartappln.utils.PaymentNotFoundException;

public interface IPaymentService {
	public void addPayment(Payment payment) throws PaymentNotFoundException;
	public List<Payment> getAllPayment() throws PaymentNotFoundException;
}
