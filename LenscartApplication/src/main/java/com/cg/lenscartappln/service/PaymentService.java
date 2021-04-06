package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IOrdersDao;
import com.cg.lenscartappln.dao.IPaymentDao;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.entity.Payment;

@Service
public class PaymentService implements IPaymentService {
	@Autowired
	IPaymentDao paymentDao;
	@Autowired
	IOrdersDao ordersDao;
	public void addPayment(Payment payment) {
		paymentDao.save(payment);  
	}
	public List<Payment> getAllPayment() {
		List<Payment> paymentList=paymentDao.findAll();
		return paymentList;
	}
	public String cancelAllPayment(int  payment_id) {
		if(paymentDao.existsById(payment_id)) {
			paymentDao.deleteById(payment_id);
			return "payment cancelled";
			}
		return "no payment with this id found";
	}
	
	
}
	

