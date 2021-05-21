package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.lenscartappln.entity.Lenses;
@Repository
public interface ILensesDao extends JpaRepository<Lenses, Integer> {
	@Query(value = "from Lenses lens where lens.lensId=?1")
	public Lenses getLensById(int lensId);


}
