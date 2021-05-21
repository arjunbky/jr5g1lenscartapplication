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

import com.cg.lenscartappln.dao.ILensesDao;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.service.LensesServices;


@RunWith(MockitoJUnitRunner.class)
public class TestLensesManager {
	@InjectMocks
	LensesServices lensesService;
	@Mock
	ILensesDao lensesDao;
	
	@Test
	public void testgetAllLenses() {
		List<Lenses> lensesList=new ArrayList<Lenses>();
		Cart cart=new Cart();
//		lensesList.add(new Lenses(1,2.5f,"rayban","bifocal",45732.32,cart));
//		lensesList.add(new Lenses(2,1.5f,"TH","progressive",7292.90,cart));
//		lensesList.add(new Lenses(3,4.0f,"Boss","cryzal",6719.43,cart));
//		
		Mockito.when(lensesDao.findAll()).thenReturn(lensesList);
		List<Lenses> list = lensesService.getAllLenses();
		Assertions.assertEquals(3,list.size());
		Mockito.verify(lensesDao,Mockito.times(1)).findAll();
	}
	@Test
	public void testAddLenses() {
//		Lenses lens=new Lenses();
//		lens.setLens_id(1);
//		lens.setLens_power(2.5f);
//		lens.setLens_brand("Boot");
//		lens.setLens_type("cryzal");
//		lens.setLens_price(4593.78);
////		frameService.addLenses(lens);
//		lensesDao.save(lens);
//		Assert.assertNotNull(lens.getLens_id());
//		Mockito.verify(lensesDao, Mockito.times(1)).save(lens);
//		
//	}

}
}