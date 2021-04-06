package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.entity.Address;
import com.cg.lenscartappln.utils.AddressNotFoundException;

public interface IAddressService {
	public void addAddress(Address address) throws AddressNotFoundException;
	public List<Address> getAllAddress()throws AddressNotFoundException ;
	public String deleteAddress(int house_number)throws AddressNotFoundException;
	public String modifyAddress(int house_number,Address address)throws AddressNotFoundException;
}
