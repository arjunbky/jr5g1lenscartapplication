package com.cg.lenscartappln.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.lenscartappln.entity.Address;
@Repository
public interface IAddressDao extends JpaRepository<Address, Integer> {

}
