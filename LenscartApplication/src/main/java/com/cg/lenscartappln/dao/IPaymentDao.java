package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.lenscartappln.entity.Payment;
@Repository
public interface IPaymentDao extends JpaRepository<Payment, Integer>{

}
