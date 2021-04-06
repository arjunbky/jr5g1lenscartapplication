package com.cg.lenscartappln.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IFramesDao;
import com.cg.lenscartappln.entity.Frames;

@Service
public class FramesService implements IFramesService {
	@Autowired
	IFramesDao framesDao;
	public void addFrames(Frames frames) {
	framesDao.save(frames);
	}
//	public void addFrames(FramesDto dto) {
//		Frames frames=new Frames();
//		frames.setFrame_id(dto.getFrame_id());
//		frames.setFrame_colour(dto.getFrame_colour());
//		frames.setFrame_brand(dto.getFrame_brand());
//		frames.setFrame_shape(dto.getFrame_shape());
//		frames.setFrame_price(dto.getFrame_price());
//		framesDao.save(frames);
//		
		
	
	public List<Frames> getAllFrames(){
		List<Frames> framesList=framesDao.findAll();
		return framesList;
	}
	
	public String deleteFrames(int frame_id) {
		if(framesDao.existsById(frame_id)) {
			framesDao.deleteById(frame_id);
			return "Frame deleted";
		}
		return "Frame not found";
	}
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
public Frames getFrameById(int frame_id) {
	return framesDao.getFrameById(frame_id);
}



}
