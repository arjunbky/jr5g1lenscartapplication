package com.cg.lenscartappln.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.ICartDao;
import com.cg.lenscartappln.dao.IFramesDao;
import com.cg.lenscartappln.dao.ILensesDao;
import com.cg.lenscartappln.dto.CartDto;
//import com.cg.lenscart.dto.FramesDto;
//import com.cg.lenscart.dto.LensesDto;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.entity.Lenses;



@Service
public class CartService implements ICartService {
	@Autowired

	ICartDao cartDao;

	ICartDao dao;
	@Autowired
	IFramesDao framesdao;
	@Autowired 
	ILensesDao lensesdao;

	


	public String deleteCart(int cart_id) {
		if(cartDao.existsById(cart_id)) {
			cartDao.deleteById(cart_id);
			return "cart deleted";
		}
		return "cart not found";
	}
//	public void addCart(Cart cart) {
//		// TODO Auto-generated method stub
//		cartDao.save(cart);
//	}
	public void addCart(CartDto cartdto) {
		Cart cart=new Cart();
//		cart.setCart_id(cartdto.getCart_id());
		cart.setQuantity(cartdto.getQuantity());
		cart.setPrice(cartdto.getPrice());
		Frames frame=framesdao.getFrameById(cartdto.getFrame_id());
		System.out.println(frame);
		cart.setFrames(frame);
		Lenses lens=lensesdao.getLensById(cartdto.getLens_id());
		cart.setLenses(lens);
		//cartDao.save(cart);
		
		
		
	}
	
	public List<Cart> getAllCarts(){
		List<Cart> cartList=cartDao.findAll();
		return cartList;
	}

}
	

