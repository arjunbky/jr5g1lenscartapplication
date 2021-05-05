package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.ILensesDao;
import com.cg.lenscartappln.dto.LensesDto;
import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.utils.LensesNotFoundException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
//lenses services
@Service
public class LensesServices implements ILensesService{
	@Autowired
	ILensesDao lensesDao;
//**method to add the lenses details to the lenses table**
	@Override
	public void addLenses(LensesDto lensesdto) {
		Lenses lens=new Lenses();
		ObjectMapper mapper=new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		lens=mapper.convertValue(lensesdto, Lenses.class);
		lensesDao.save(lens);
	}
//**method to get the details of all the lenses in the table**
	@Override
	public List<Lenses> getAllLenses() {
		List<Lenses> lensList=lensesDao.findAll();
		return lensList;
	}
//** method to delete lenses based on their ID**
	@Override
	public String deleteLenses(int lens_id) throws LensesNotFoundException {
		if(lensesDao.existsById(lens_id)) {
			lensesDao.deleteById(lens_id);
			return "Lens removed";
		}
		else 
			throw new LensesNotFoundException();
	}
//** method to update the lenses based on their ID**
	@Override
	public String modifyLenses(int lens_id, Lenses lens) throws LensesNotFoundException {
		if(lensesDao.existsById(lens_id)) {
			Lenses lenses =lensesDao.findById(lens_id).get();
			lenses.setLens_power(lens.getLens_power());
			lenses.setLens_brand(lens.getLens_brand());
			lenses.setLens_type(lens.getLens_type());
			lensesDao.save(lens);
			return "Lenses updated";
		}
		else 
			throw new LensesNotFoundException();
		
	}
}
	