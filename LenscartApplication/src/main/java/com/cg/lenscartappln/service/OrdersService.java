package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.ICartDao;
import com.cg.lenscartappln.dao.ICustomerDao;
import com.cg.lenscartappln.dao.IOrdersDao;
import com.cg.lenscartappln.entity.Orders;
import com.cg.lenscartappln.utils.OrdersNotFoundException;

@Service
public class OrdersService implements IOrdersService {
	@Autowired
	IOrdersDao ordersDao;
	
	@Autowired
	ICartDao cartDao;
	
	@Autowired
	ICustomerDao customerDao;
  
	
	public void addOrders(Orders orders) {
		ordersDao.save(orders);
		
	}
	public List<Orders> getAllOrders(){
		List<Orders> orderslist=ordersDao.findAll();
		return orderslist;
	}
	public Orders getOrdersByCartId(int cart_id) {
		return ordersDao.getOrdersByCartId(cart_id);
		
	}
	public List<Orders> getCustomerDetails(int customer_id) {
		List<Orders> orderList=ordersDao.findAll();
		return orderList;
	}
	public String modifyOrder(int order_id, Orders order) {
		// TODO Auto-generated method stub
		return null;
	}
	public String deleteOrder(int order_id) throws OrdersNotFoundException {
		if(ordersDao.existsById(order_id)) {
			ordersDao.deleteById(order_id);
			return "order deleted";
		}
		else
			throw new OrdersNotFoundException();
	}
	
	
}
