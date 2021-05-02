  package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.dto.CartDto;

//import com.cg.lenscart.dto.FramesDto;
//import com.cg.lenscart.dto.LensesDto;

import com.cg.lenscartappln.utils.CartNotFoundException;

public interface ICartService {
	
	public String deleteCart(int cart_id) throws CartNotFoundException ;
	public void addCart(CartDto cartdto)throws CartNotFoundException;
    public List<CartDto> getAllCarts()throws CartNotFoundException;


}
