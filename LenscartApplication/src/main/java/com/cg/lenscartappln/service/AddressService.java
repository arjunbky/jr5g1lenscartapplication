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
//**method to add the address of a customer to the address table**
	public void addAddress(Address address) {
		addressDao.save(address);
	}
//**method to get all the added address details of all customers**
	public List<Address> getAllAddress(){
		List<Address> addressList=addressDao.findAll();
		return addressList;
		
	}
//**method to delete all the addresses related to all the customers**
	public String deleteAddress(int house_number) throws AddressNotFoundException {
		if(addressDao.existsById(house_number)) {
			addressDao.deleteById(house_number);
			return "Address deleted";
		}
		else 
			throw new AddressNotFoundException();
	}
//**method to update the existing data of address for a given house _number**
	public String modifyAddress(int house_number,Address address) throws AddressNotFoundException {
		if(addressDao.existsById(house_number)) {
			Address addressList=addressDao.findById(house_number).get();
			addressList.setPincode(address.getPincode());
			addressList.setCity(address.getCity());;
			addressList.setStreet_name(address.getStreet_name());
			addressList.setState(address.getState());
			addressDao.save(address);
			return "Frame updated";
		} 
		else 
			throw new AddressNotFoundException();
	}
	
	

}
