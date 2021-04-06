package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.lenscartappln.entity.Customer;
@Repository
public interface ICustomerDao extends JpaRepository<Customer, Integer> {

}
