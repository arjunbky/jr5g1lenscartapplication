package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IAddressDao;
import com.cg.lenscartappln.dto.CustomerDto;
import com.cg.lenscartappln.entity.Address;


@Service
public class AddressService {
	@Autowired IAddressDao addressDao;
	
	public void addAddress(CustomerDto customerdto) {
//		addressDao.save(address);
		Address address=new Address();
		address.setHouse_number(customerdto.getHouse_number());
		address.setCity(customerdto.getCity());
		address.setState(customerdto.getState());
		address.setStreet_name(customerdto.getStreet_name());
		address.setPincode(customerdto.getPincode());
		addressDao.save(address);
		}
	
	public List<Address> getAddress(){
		List<Address>addressList=addressDao.findAll();
		return addressList;
	}
	public String deleteAddress(int address_id) {
		if(addressDao.existsById(address_id)) {
			addressDao.deleteById(address_id);
			return "address Deleted";
		}
		else
		return "no address found with that id";
	}

}
