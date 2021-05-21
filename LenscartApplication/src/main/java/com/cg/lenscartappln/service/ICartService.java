  package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.dto.CartDto;
import com.cg.lenscartappln.entity.Cart;

//import com.cg.lenscart.dto.FramesDto;
//import com.cg.lenscart.dto.LensesDto;

import com.cg.lenscartappln.utils.CartNotFoundException;

public interface ICartService {
	
	public String deleteCart(int cartId) throws CartNotFoundException ;
	public void addCart(Cart cart)throws CartNotFoundException;
    public List<CartDto> getAllCarts()throws CartNotFoundException;


}
