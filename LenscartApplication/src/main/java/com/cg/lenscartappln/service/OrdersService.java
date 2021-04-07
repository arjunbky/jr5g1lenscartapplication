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
  
//	** method to add the order details to Orders table **
	public void addOrders(Orders orders) {
		ordersDao.save(orders);
		
	}
//	** method to get all the details of Order**
	public List<Orders> getAllOrders(){
		List<Orders> orderslist=ordersDao.findAll();
		return orderslist;
	}
//	**method to get orders by cart Id**
	public Orders getOrdersByCartId(int cart_id) {
		return ordersDao.getOrdersByCartId(cart_id);
		
	}
//	**method to get customer details based on customer_id in the order table**
	public List<Orders> getCustomerDetails(int customer_id) {
		List<Orders> orderList=ordersDao.findAll();
		return orderList;
	}
//	**method to update the existing order in the table**
	public String modifyOrder(int order_id, Orders orders) {
		if(ordersDao.existsById(order_id)) {
			Orders order=ordersDao.findById(order_id).get();
			order.setDate_of_order(orders.getDate_of_order());
			order.setCustomer(orders.getCustomer());
			order.setExpected_date_of_arrival(orders.getExpected_date_of_arrival());
			
			
		
		}
		return null;
	}
//	*method to delete the order based on order_id**
	public String deleteOrder(int order_id) throws OrdersNotFoundException {
		if(ordersDao.existsById(order_id)) {
			ordersDao.deleteById(order_id);
			return "order deleted";
		}
		else
			throw new OrdersNotFoundException();
	}
	
	
}
