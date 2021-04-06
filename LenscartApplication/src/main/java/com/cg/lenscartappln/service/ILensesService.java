package com.cg.lenscartappln.service;

import java.util.List;


import com.cg.lenscartappln.entity.Lenses;
//lens service
public interface ILensesService {
	public void addLenses(Lenses lenses);
	public List<Lenses> getAllLenses();
	public String deleteLenses(int lens_id);
	public String modifyLenses(int lens_id,Lenses lens);

}
