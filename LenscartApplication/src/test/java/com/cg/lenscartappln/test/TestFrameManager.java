package com.cg.lenscartappln.test;
import java.util.ArrayList;
import java.util.List;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import com.cg.lenscartappln.dao.IFramesDao;
import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.service.FramesService;

@RunWith(MockitoJUnitRunner.class)
public class TestFrameManager {
	@InjectMocks
	FramesService frameService;
	@Mock
	IFramesDao framesDao;
	
//	@Before
//	public void init() {
//		System.out.println("** before method ***");
//		MockitoAnnotations.initMocks(this); 
//	}
	@Test
	public void testgetAllFrames() {
		List<Frames> framesList=new ArrayList<Frames>();
		framesList.add(new Frames(1,"circle","red","rayban",45732.32));
		framesList.add(new Frames(2,"square","blue","TH",7292.90));
		framesList.add(new Frames(3,"oval","green","rayban",6719.43));
		
		Mockito.when(framesDao.findAll()).thenReturn(framesList);
		List<Frames> list = frameService.getAllFrames();
		Assertions.assertEquals(3,list.size());
		Mockito.verify(framesDao,Mockito.times(1)).findAll();
	}
	@Test
	public void testAddFrames() {
		Frames frames=new Frames();
		frames.setFrame_id(1);
		frames.setFrame_brand("TH");
		frames.setFrame_colour("red");
		frames.setFrame_shape("circle");
		frames.setFrame_price(4593.78);
//		frameService.addFrames(frames);
		framesDao.save(frames);
		Assert.assertNotNull(frames.getFrame_id());
		Mockito.verify(framesDao, Mockito.times(1)).save(frames);
		
	}

}
