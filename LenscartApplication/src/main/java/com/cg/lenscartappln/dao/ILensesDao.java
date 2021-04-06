package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.lenscartappln.entity.Frames;
import com.cg.lenscartappln.entity.Lenses;

public interface ILensesDao extends JpaRepository<Lenses, Integer> {
	@Query(value = "from Lenses lens where lens.lens_id=?1")
	public Lenses getLensById(int lens_id);


}
