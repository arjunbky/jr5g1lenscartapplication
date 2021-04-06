package com.cg.lenscartappln.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.lenscartappln.entity.Orders;

public interface IOrdersDao extends JpaRepository<Orders, Integer>{
@Query(value= "from Orders orders where cart.cart_id=?1 ")
	Orders getOrdersByCartId(int cart_id);





}
