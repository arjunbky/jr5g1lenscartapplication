package com.cg.lenscartappln.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.lenscartappln.entity.Orders;
@Repository
public interface IOrdersDao extends JpaRepository<Orders, Integer>{




}
