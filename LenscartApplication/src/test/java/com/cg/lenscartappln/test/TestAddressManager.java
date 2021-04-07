package com.cg.lenscartappln.test;
import java.util.ArrayList;
import java.util.List;


import org.junit.Assert;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;

import com.cg.lenscartappln.dao.IAddressDao;

import com.cg.lenscartappln.entity.Address;

import com.cg.lenscartappln.service.AddressService;


@RunWith(MockitoJUnitRunner.class)
public class TestAddressManager {
	@InjectMocks
	AddressService addressService;
	@Mock
	IAddressDao addressDao;
	
	@Test
	public void testgetAllAddress() {
		List<Address> addressList=new ArrayList<Address>();
		addressList.add(new Address("A12","MG Raod","Hyderbad","Andra Pradesh",540012));
		addressList.add(new Address("B63","Jaynagar","Banglore","Karnataka",560045));
		addressList.add(new Address("C23","Kottara","Mangalore","Karnataka",560037));
		
		Mockito.when(addressDao.findAll()).thenReturn(addressList);
		List<Address> list = addressService.getAllAddress();
		Assertions.assertEquals(3,list.size());
		Mockito.verify(addressDao,Mockito.times(1)).findAll();
	}
	@Test
	public void testAddAddress() {
		Address address=new Address();
		address.setHouse_number("Q32");
		address.setStreet_name("Jaynagar");
		address.setCity("Banglore");
		address.setState("karnataka");
		address.setPincode(560037);
//		frameService.addAddress(address);
		addressDao.save(address);
		Assert.assertNotNull(address.getHouse_number());
		Mockito.verify(addressDao, Mockito.times(1)).save(address);
		
	}

}
