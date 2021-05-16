package com.cg.lenscartappln.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.ICartDao;
import com.cg.lenscartappln.dao.IFramesDao;
import com.cg.lenscartappln.dao.ILensesDao;
import com.cg.lenscartappln.dto.CartDto;

import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Customer;
import com.cg.lenscartappln.utils.CartNotFoundException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;



@Service

public class CartService implements ICartService {
	@Autowired
	ICartDao cartDao;
	
	@Autowired
	IFramesDao framesdao;
	
	@Autowired 
	ILensesDao lensesdao;
	
//**method to add the frames and lenses by their ID to the cart**
		public void addCart(Cart cart) {	
				cartDao.save(cart);
		
			
		}
  
//**method to get all the items present in the cart**
		public List<CartDto> getAllCarts(){
			List<Cart> cartList=cartDao.findAll();
			List<CartDto> cartDtoList=new ArrayList<CartDto>();
		
			for(Cart cart:cartList ) {
				CartDto cartDto=new CartDto();
				ObjectMapper mapper = new ObjectMapper();
				mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			
				
				cartDto=mapper.convertValue(cart, CartDto.class);
			
				int frameCount=0;
				int lenseCount=0;
				if(cartDto.getFrames() != null && !cartDto.getFrames().isEmpty()) {
				
					frameCount=cartDto.getFrames().size();
				
				
				}
				if(cartDto.getLenses() != null && !cartDto.getLenses().isEmpty()) {
				
				lenseCount=cartDto.getLenses().size();
				
				}
			
				cartDto.setTotalFrames(frameCount);
				cartDto.setTotalLenses(lenseCount);
				cartDto.setQuantity(frameCount+lenseCount);
				cartDtoList.add(cartDto);
			
			}
		
		return cartDtoList;
	}
	
	public Optional<Cart> getCartById(int cart_id) throws CartNotFoundException{
		List<Cart> cartList=cartDao.findAll();
		 for(Cart carts:cartList) {
			 if(carts.getCart_id()==cart_id) {
				 Optional<Cart> cartlist=cartDao.findById(cart_id);
				 return cartlist;
			 }
			 
		 }
		 throw new CartNotFoundException();
	
	}
	
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

	public Cart getCartByCustomer(int customer_id) {
		return cartDao.getCartByCustomer(customer_id);
		
	}


}
	

