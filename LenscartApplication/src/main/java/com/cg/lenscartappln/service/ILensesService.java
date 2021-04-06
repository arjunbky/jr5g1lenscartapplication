package com.cg.lenscartappln.service;

import java.util.List;


import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.utils.LensesNotFoundException;
//lens service
public interface ILensesService {
	public void addLenses(Lenses lenses) throws LensesNotFoundException;
	public List<Lenses> getAllLenses() throws LensesNotFoundException;
	public String deleteLenses(int lens_id) throws LensesNotFoundException;
	public String modifyLenses(int lens_id,Lenses lens) throws LensesNotFoundException;

}
