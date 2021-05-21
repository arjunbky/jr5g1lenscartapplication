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
		frames.setFrameId(1);
		frames.setFrameShape("circle");
		frames.setFrameBrand("TH");
		frames.setFramePrice(3564.66);
		frames.setCart(null);
	    framesList.add(frames);
	    
	    List<Lenses> lensesList=new ArrayList<Lenses>();
		Lenses lenses=new Lenses();
		lenses.setLensId(1);
		lenses.setLensPower(1.56f);
		lenses.setLensPrice(600.22);
		lenses.setLensType("progressive");
		lenses.setCart(null);
		 lensesList.add(lenses);
		 
		 Cart cart=new Cart();
		 cart.setCartId(1);
		 cart.setFrames(framesList);
		 cart.setLenses(lensesList);

		 
		 cartDao.save(cart);
		 
		 Assert.assertNotNull(cart.getCartId());
		 Mockito.verify(cartDao,Mockito.times(1)).save(cart);
		 
		
	}
	
	@Test
	public void testgetCart() {
		List<Cart> cartList=new ArrayList<>();
		List<Frames> framesList=new ArrayList<Frames>();
		Frames frames=new Frames();
		frames.setFrameId(1);
		frames.setFrameShape("circle");
		frames.setFrameBrand("TH");
		frames.setFramePrice(3564.66);
		frames.setCart(null);
	    framesList.add(frames);
	    
	    List<Lenses> lensesList=new ArrayList<Lenses>();
		Lenses lenses=new Lenses();
		lenses.setLensId(1);
		lenses.setLensPower(1.56f);
		lenses.setLensPrice(600.22);
		lenses.setLensType("progressive");
		lenses.setCart(null);
		 lensesList.add(lenses);
		 
		
		 
		
		Mockito.when(cartDao.findAll()).thenReturn(cartList);
		 List<CartDto> list=cartService.getAllCarts();
		 Assertions.assertEquals(2,list.size());
		 Mockito.verify(cartDao,Mockito.times(1)).findAll();
	
		 
	}
	

}
