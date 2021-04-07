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

import com.cg.lenscartappln.entity.Address;
import com.cg.lenscartappln.service.AddressService;
import com.cg.lenscartappln.utils.AddressNotFoundException;
@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressService addressService;
	
	@PostMapping("/insertaddress")
	public ResponseEntity<String> addAddress(@RequestBody Address address){
		addressService.addAddress(address);
		return new ResponseEntity<String>("Address added",HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Address>> getAllAddress(){
		List<Address> addressList=addressService.getAllAddress();
		return new ResponseEntity<List<Address>>(addressList,HttpStatus.OK);
	}
	@DeleteMapping("/deleteaddress")
	public ResponseEntity<String> deleteAddress(@RequestBody int house_number) throws AddressNotFoundException{
		String str=addressService.deleteAddress(house_number);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}
	@PutMapping("/updateaddress/{code}")
	public ResponseEntity<String> modifyAddress(@PathVariable int house_number,@RequestBody Address address) throws AddressNotFoundException{
		String str=addressService.modifyAddress(house_number, address);
		return new ResponseEntity<String>(str,HttpStatus.OK);
	}

}
