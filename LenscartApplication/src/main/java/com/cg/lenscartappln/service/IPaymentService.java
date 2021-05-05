package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.dto.PaymentDto;
import com.cg.lenscartappln.entity.Payment;
import com.cg.lenscartappln.utils.PaymentNotFoundException;

public interface IPaymentService {
	public void addPayment(PaymentDto paymentDto) throws PaymentNotFoundException;
	public List<Payment> getAllPayment() throws PaymentNotFoundException;
}
