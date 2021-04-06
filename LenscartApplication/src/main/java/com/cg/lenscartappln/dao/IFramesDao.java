package com.cg.lenscartappln.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.lenscartappln.entity.Frames;
@Repository
public interface IFramesDao extends JpaRepository<Frames, Integer> {
	@Query(value = "from Frames frame where frame.frame_id=?1")
	public Frames getFrameById(int frame_id);
	

}
