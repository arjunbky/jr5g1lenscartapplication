package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.lenscartappln.entity.Lenses;

public interface ILensesDao extends JpaRepository<Lenses, Integer> {



}
