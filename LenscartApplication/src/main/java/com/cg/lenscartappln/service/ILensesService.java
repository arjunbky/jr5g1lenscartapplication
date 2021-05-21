package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.dto.LensesDto;
import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.utils.LensesNotFoundException;
//lens service
public interface ILensesService {
	public void addLenses(LensesDto lensesDto) throws LensesNotFoundException;
	public List<Lenses> getAllLenses() throws LensesNotFoundException;
	public String deleteLenses(int lensId) throws LensesNotFoundException;
	public String modifyLenses(int lensId,Lenses lens) throws LensesNotFoundException;

}
