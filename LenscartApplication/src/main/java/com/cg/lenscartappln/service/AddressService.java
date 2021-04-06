package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IAddressDao;
import com.cg.lenscartappln.entity.Address;
@Service
public class AddressService implements IAddressService{
	@Autowired
	IAddressDao addressDao;
	public void addAddress(Address address) {
		addressDao.save(address);
	}
	public List<Address> getAllAddress(){
		List<Address> addressList=addressDao.findAll();
		return addressList;
		
	}
	
	
	

}
