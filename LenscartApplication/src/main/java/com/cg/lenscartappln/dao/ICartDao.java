package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import com.cg.lenscartappln.dto.FramesDto;
//import com.cg.lenscartappln.dto.LensesDto;
import com.cg.lenscartappln.entity.Cart;

public interface ICartDao extends JpaRepository<Cart, Integer>{
//	@Query(value = "delete from Cart cart where cart_id=?1")
//	String deleteByCartId(int cart_id);
//	
//	@Query(value = "delete from Cart cart where cart.lenses.lens_id=?1")
//	String deletecartLenses(int lens_id);

}
