package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscartappln.entity.Payment;

public interface IPaymentDao extends JpaRepository<Payment, Integer>{

}
