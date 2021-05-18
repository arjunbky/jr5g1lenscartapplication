package com.cg.lenscartappln.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import com.cg.lenscartappln.dto.FramesDto;
//import com.cg.lenscartappln.dto.LensesDto;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Customer;
@Repository
public interface ICartDao extends JpaRepository<Cart, Integer>{

	@Query(value = "from Cart cart where customer.customer_id=?1")
	public Cart getCartByCustomer(int customer_id);

}
