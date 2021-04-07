package com.cg.lenscartappln.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IFramesDao;
import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.utils.FrameNotFoundException;

@Service
public class FramesService implements IFramesService {
	@Autowired
	IFramesDao framesDao;
//** method to add the frame details to the Frames table**
	public void addFrames(Frames frames) {
	framesDao.save(frames);
	}
	
		
//**method to get all the frame details from the table**
	public List<Frames> getAllFrames(){
		List<Frames> framesList=framesDao.findAll();
		return framesList;
	}
//**method to delete the frame details based on frame_id**
	public String deleteFrames(int frame_id) throws FrameNotFoundException {
		if(framesDao.existsById(frame_id)) {
			framesDao.deleteById(frame_id);
			return "Frame deleted";
		}
		else 
			throw new FrameNotFoundException();
	}
//** method to update the existing frame based on frame_id**
	public String modifyFrames(int frame_id,Frames frames) {
		if(framesDao.existsById(frame_id)) {
			Frames frame=framesDao.findById(frame_id).get();
			frame.setFrame_shape(frames.getFrame_shape());
			frame.setFrame_colour(frames.getFrame_colour());
			frame.setFrame_brand(frames.getFrame_brand());
			framesDao.save(frames);
			return "Frame updated";
		}
		return "Frame not found";
	}
//**method to get the frame by ID**
public Frames getFrameById(int frame_id) {
	return framesDao.getFrameById(frame_id);
}



}
