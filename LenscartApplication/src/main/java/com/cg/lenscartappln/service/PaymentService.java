package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IOrdersDao;
import com.cg.lenscartappln.dao.IPaymentDao;
import com.cg.lenscartappln.dto.PaymentDto;
import com.cg.lenscartappln.entity.Payment;
import com.cg.lenscartappln.utils.PaymentNotFoundException;

@Service
public class PaymentService implements IPaymentService {
	@Autowired
	IPaymentDao paymentDao;
	@Autowired
	IOrdersDao ordersDao;
	
//** method to add payment details**
	public void addPayment(PaymentDto paymentDto) {
		Payment payment =new Payment();
		payment.setPayment_id(paymentDto.getPayment_id());
		payment.setCard_name(paymentDto.getCard_name());
        payment.setCard_number(paymentDto.getCard_number());
        payment.setCvv(paymentDto.getCvv());
        payment.setExpiry_date(paymentDto.getExpiry_date());
        payment.setOrders(paymentDto.getOrder());
		paymentDao.save(payment);  
	}
	
//** method to get all Payment details**
	public List<Payment> getAllPayment() {
		List<Payment> paymentList=paymentDao.findAll();
		return paymentList;
	}
	
//** method to delete payment based on ID**
	public String cancelAllPayment(int  payment_id) throws PaymentNotFoundException {
		List<Payment> paymentList=paymentDao.findAll();
		for(Payment payment:paymentList) {
		if(payment.getPayment_id()==payment_id) {
			paymentDao.deleteById(payment_id);
			return "payment cancelled";
			}
		}
		 
			throw new PaymentNotFoundException();
	}
	
	
}
	

