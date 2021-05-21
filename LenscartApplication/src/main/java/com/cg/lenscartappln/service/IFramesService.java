package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.dto.FramesDto;
import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.utils.FrameNotFoundException;

public interface IFramesService {
	public void addFrames(FramesDto framesDto) throws FrameNotFoundException;
	public List<Frames> getAllFrames() throws FrameNotFoundException;
	public String deleteFrames(int frameId) throws FrameNotFoundException;
	public String modifyFrames(int frameId,Frames frames) throws FrameNotFoundException;
	}
