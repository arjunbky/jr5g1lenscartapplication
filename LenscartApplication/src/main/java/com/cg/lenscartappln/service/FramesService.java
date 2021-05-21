package com.cg.lenscartappln.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IFramesDao;
import com.cg.lenscartappln.dto.FramesDto;
import com.cg.lenscartappln.entity.Cart;
import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.utils.FrameNotFoundException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FramesService implements IFramesService {
	@Autowired
	IFramesDao framesDao;
//** method to add the frame details to the Frames table**
	public void addFrames(FramesDto framesDto) {
		ObjectMapper mapper=new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Frames frameObj=new Frames();
		frameObj=mapper.convertValue(framesDto, Frames.class);
		Cart cart=new Cart();
		cart.setCartId(1);
		frameObj.setCart(cart);
		framesDao.save(frameObj);
	}
	
		
//**method to get all the frame details from the table**
	public List<Frames> getAllFrames(){
		List<Frames> framesList=framesDao.findAll();
		return framesList;
	}
//**method to delete the frame details based on frame_id**
	public String deleteFrames(int frameId) throws FrameNotFoundException {
		List<Frames> frameList=framesDao.findAll();
		for (Frames frame:frameList) {
		if(frame.getFrameId()==frameId) {
			framesDao.deleteById(frameId);
			return "Frame deleted";
		}
		}
			throw new FrameNotFoundException();
	
	}
//** method to update the existing frame based on frame_id**
	public String modifyFrames(int frameId,Frames frames) throws FrameNotFoundException {
		if(framesDao.existsById(frameId)) {
			Frames frame=framesDao.findById(frameId).get();
			frame.setFrameShape(frames.getFrameShape());
			frame.setFrameColour(frames.getFrameColour());
			frame.setFrameBrand(frames.getFrameBrand());
			framesDao.save(frames);
			return "Frame updated";
		}
		else
			throw new FrameNotFoundException();
	}
//**method to get the frame by ID**
public Frames getFrameById(int frameId) {
	return framesDao.getFrameById(frameId);
}



}
