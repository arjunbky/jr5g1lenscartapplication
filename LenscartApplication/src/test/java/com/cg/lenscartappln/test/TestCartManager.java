package com.cg.lenscartappln.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.cg.lenscartappln.dao.ICartDao;
import com.cg.lenscartappln.dto.CartDto;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.service.CartService;

@RunWith(MockitoJUnitRunner.class)
public class TestCartManager {
	@InjectMocks
	CartService cartService;
	@Mock
	ICartDao cartDao;
	
	@Test
	public void testaddCart() {
		List<Frames> framesList=new ArrayList<Frames>();
		Frames frames=new Frames();
		frames.setFrame_id(1);
		frames.setFrame_shape("circle");
		frames.setFrame_brand("TH");
		frames.setFrame_price(3564.66);
		frames.setCart(null);
	    framesList.add(frames);
	    
	    List<Lenses> lensesList=new ArrayList<Lenses>();
		Lenses lenses=new Lenses();
		lenses.setLens_id(1);
		lenses.setLens_power(1.56f);
		lenses.setLens_price(600.22);
		lenses.setLens_type("progressive");
		lenses.setCart(null);
		 lensesList.add(lenses);
		 
		 Cart cart=new Cart();
		 cart.setCart_id(1);
		 cart.setFrames(framesList);
		 cart.setLenses(lensesList);
		 cart.setQuantity(2);
		 cart.setPrice(5643.5);
		
		 cartDao.save(cart);
		 
		 Assert.assertNotNull(cart.getCart_id());
		 Mockito.verify(cartDao,Mockito.times(1)).save(cart);
		 
		
	}
	
	@Test
	public void testgetCart() {
		List<Cart> cartList=new ArrayList<>();
		List<Frames> framesList=new ArrayList<Frames>();
		Frames frames=new Frames();
		frames.setFrame_id(1);
		frames.setFrame_shape("circle");
		frames.setFrame_brand("TH");
		frames.setFrame_price(3564.66);
		frames.setCart(null);
	    framesList.add(frames);
	    
	    List<Lenses> lensesList=new ArrayList<Lenses>();
		Lenses lenses=new Lenses();
		lenses.setLens_id(1);
		lenses.setLens_power(1.56f);
		lenses.setLens_price(600.22);
		lenses.setLens_type("progressive");
		lenses.setCart(null);
		 lensesList.add(lenses);
		 
		
		 cartList.add(new Cart(1,23,456.32,framesList,lensesList));
		cartList.add(new Cart(2,23,456.32,framesList,lensesList));
		
		Mockito.when(cartDao.findAll()).thenReturn(cartList);
		 List<CartDto> list=cartService.getAllCarts();
		 Assertions.assertEquals(2,list.size());
		 Mockito.verify(cartDao,Mockito.times(1)).findAll();
	
		 
	}
	

}
