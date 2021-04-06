package com.cg.lenscartappln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.cg.lenscart.dto.LensesDto;
import com.cg.lenscartappln.entity.Lenses;
import com.cg.lenscartappln.service.LensesServices;
import com.cg.lenscartappln.utils.LensesNotFoundException;

@RestController
@RequestMapping("/lenses")
public class LensesController {
	@Autowired
	LensesServices service;
	
	@PostMapping("/insertlenses")
	public ResponseEntity<String> addLenses(@RequestBody Lenses lenses){
		service.addLenses(lenses);
		return new ResponseEntity<String>("Lenses Added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Lenses>> getAllLenses(){
		List<Lenses> lensesList=service.getAllLenses();
		return new ResponseEntity<List<Lenses>>(lensesList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletelenses")
	public ResponseEntity<String> deleteLenses(@RequestBody int lens_id) throws LensesNotFoundException{
		String str=service.deleteLenses(lens_id);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updatelenses/{code}")
	public ResponseEntity<String> modifyLenses(@PathVariable int lens_id,@RequestBody Lenses lens ){
		String str=service.modifyLenses(lens_id, lens);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}



