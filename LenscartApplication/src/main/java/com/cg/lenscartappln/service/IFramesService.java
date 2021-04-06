package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.utils.FrameNotFoundException;

public interface IFramesService {
	public void addFrames(Frames frames) throws FrameNotFoundException;
	public List<Frames> getAllFrames() throws FrameNotFoundException;
	public String deleteFrames(int frame_id) throws FrameNotFoundException;
	public String modifyFrames(int frame_id,Frames frames) throws FrameNotFoundException;
	}
