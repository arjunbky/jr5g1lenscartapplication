package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.ILensesDao;


import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.utils.LensesNotFoundException;
//lenses services
@Service
public class LensesServices implements ILensesService{
	@Autowired
	ILensesDao dao;

	@Override
	public void addLenses(Lenses lenses) {
		Lenses lens=new Lenses();
		lens.setLens_id( lenses.getLens_id());
		lens.setLens_power( lenses.getLens_power());
		lens.setLens_brand( lenses.getLens_brand());
		lens.setLens_type( lenses.getLens_type());
		lens.setLens_price( lenses.getLens_price());
		dao.save(lens);
	}

	@Override
	public List<Lenses> getAllLenses() {
		List<Lenses> lensList=dao.findAll();
		return lensList;
	}

	@Override
	public String deleteLenses(int lens_id) throws LensesNotFoundException {
		if(dao.existsById(lens_id)) {
			dao.deleteById(lens_id);
			return "Lens removed";
		}
		else 
			throw new LensesNotFoundException();
	}

	@Override
	public String modifyLenses(int lens_id, Lenses lens) {
		if(dao.existsById(lens_id)) {
			Lenses lenses =dao.findById(lens_id).get();
			lenses.setLens_power(lens.getLens_power());
			lenses.setLens_brand(lens.getLens_brand());
			lenses.setLens_type(lens.getLens_type());
			dao.save(lens);
			return "Lenses updated";
		}
		return "Lens not found";
	}
}
	