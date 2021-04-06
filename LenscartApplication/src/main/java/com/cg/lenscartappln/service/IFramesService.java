package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.entity.Frames;

public interface IFramesService {
	public void addFrames(Frames frames);
	public List<Frames> getAllFrames();
	public String deleteFrames(int frame_id);
	public String modifyFrames(int frame_id,Frames frames);
	}
