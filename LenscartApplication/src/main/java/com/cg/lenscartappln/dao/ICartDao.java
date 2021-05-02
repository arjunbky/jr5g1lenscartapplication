package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.cg.lenscartappln.dto.FramesDto;
//import com.cg.lenscartappln.dto.LensesDto;
import com.cg.lenscartappln.entity.Cart;
@Repository
public interface ICartDao extends JpaRepository<Cart, Integer>{

}
