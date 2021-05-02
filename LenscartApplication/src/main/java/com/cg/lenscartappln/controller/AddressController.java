package com.cg.lenscartappln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.lenscartappln.dto.CustomerDto;
import com.cg.lenscartappln.entity.Address;

import com.cg.lenscartappln.service.AddressService;


@RestController
@RequestMapping("/address")
public class AddressController {
@Autowired
AddressService addressService;

@PostMapping
public ResponseEntity<String> addAddress(@RequestBody CustomerDto address){
	addressService.addAddress(address);
	return new ResponseEntity<String>("address added",HttpStatus.OK);
	
}
@GetMapping
public ResponseEntity<List<Address>> getAllAddress(){
	List<Address> addressList=addressService.getAddress();
	return new ResponseEntity<List<Address>>(addressList,HttpStatus.OK);
}
@DeleteMapping("/deleteaddress")
public ResponseEntity<String> deleteFrames(@RequestParam int address_id) {
	addressService.deleteAddress(address_id);
	return new ResponseEntity<String>("address deleted",HttpStatus.OK);
}

}
