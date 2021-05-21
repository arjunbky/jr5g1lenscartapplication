package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.lenscartappln.entity.Customer;
@Repository
public interface ICustomerDao extends JpaRepository<Customer, Integer> {
	@Query(value = "from Customer customer where customer.emailId=?1 and customer.password=?2")
	public Customer validate(String emailId, String password);
	
}
