package com.cg.lenscartappln.service;


import java.util.ArrayList;
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
import com.cg.lenscartappln.utils.CartNotFoundException;



@Service
public class CartService implements ICartService {
	@Autowired
	ICartDao cartDao;
	
	@Autowired
	IFramesDao framesdao;
	
	@Autowired 
	ILensesDao lensesdao;
//** method to delete the items present in  the cart**
	public String deleteCart(int cart_id) throws CartNotFoundException {
		
		 List<Cart> cartList=cartDao.findAll();
		for(Cart carts:cartList) {
		if(carts.getCart_id()==cart_id) {
			cartDao.deleteById(cart_id);
			return "cart deleted";
		}
		}
		 	throw new CartNotFoundException();
	}

	
//**method to add the frames and lenses by their ID to the cart**
	public void addCart(CartDto cartdto) {
		Cart cart=new Cart();
		cart.setQuantity(cartdto.getQuantity());
		cart.setPrice(cartdto.getPrice());
       List<Frames> frameList=new ArrayList<Frames>();
		Frames frame=framesdao.getFrameById(cartdto.getFrame_id());
		System.out.println(frame);
		frameList.add(frame);
		cart.setFrames(frameList);
		List<Lenses> lenseList=new ArrayList<Lenses>();
		Lenses lens=lensesdao.getLensById(cartdto.getLens_id());
		lenseList.add(lens);
		cart.setLenses(lenseList);
		System.out.println(cart);
		cartDao.save(cart);
		System.out.println(cart);
	
	}
//**method to get all the items present in the cart**
	public List<Cart> getAllCarts(){
		List<Cart> cartList=cartDao.findAll();
		return cartList;
	}


//	public String deleteByCartId(int cart_id) {
//		
//		return cartDao.deleteByCartId(cart_id);
//	}

}
	

