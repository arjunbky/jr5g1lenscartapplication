package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.IAddressDao;
import com.cg.lenscartappln.entity.Address;
import com.cg.lenscartappln.utils.AddressNotFoundException;
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
	public String deleteAddress(int house_number) throws AddressNotFoundException {
		if(addressDao.existsById(house_number)) {
			addressDao.deleteById(house_number);
			return "Address deleted";
		}
		else 
			throw new AddressNotFoundException();
	}
	public String modifyAddress(int house_number,Address address) {
		if(addressDao.existsById(house_number)) {
			Address addressList=addressDao.findById(house_number).get();
			addressList.setPincode(address.getPincode());
			addressList.setCity(address.getCity());;
			addressList.setStreet_name(address.getStreet_name());
			addressList.setState(address.getState());
			addressDao.save(address);
			return "Frame updated";
		}
		return "Frame not found";
	}
	
	

}
