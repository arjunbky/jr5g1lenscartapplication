package com.cg.lenscartappln.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscartappln.dao.ICartDao;
import com.cg.lenscartappln.dao.ICustomerDao;
import com.cg.lenscartappln.dao.IOrdersDao;
import com.cg.lenscartappln.dto.OrdersDto;
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
	public void addOrders(OrdersDto ordersDto) {
		Orders order=new Orders();
		order.setOrderId(ordersDto.getOrderId());
		order.setDateOfOrder(ordersDto.getDateOfOrder());
		order.setExpectedDateOfArrival(ordersDto.getExpectedDateOfArrival());
		order.setCart(ordersDto.getCart());
		order.setCustomer(ordersDto.getCustomer());
		order.setTotalCost(ordersDto.getTotalCost());
		ordersDao.save(order);
		
	}
	
//	** method to get all the details of Order**
	public List<Orders> getAllOrders(){
		List<Orders> orderslist=ordersDao.findAll();
		return orderslist;
	}
	
//	**method to update the existing order in the table**
	public String modifyOrder(int orderId, Orders orders) throws OrdersNotFoundException {
		if(ordersDao.existsById(orderId)) {
			Orders order=ordersDao.findById(orderId).get();
			order.setDateOfOrder(orders.getDateOfOrder());
			order.setCustomer(orders.getCustomer());
			order.setExpectedDateOfArrival(orders.getExpectedDateOfArrival());
			order.setCart(orders.getCart());
			order.setTotalCost(orders.getTotalCost());
			ordersDao.save(orders);
		return "order updated";
	}
		else 
			throw new OrdersNotFoundException();
	}
	
//	*method to delete the order based on order_id**
	public String deleteOrder(int orderId) throws OrdersNotFoundException {
		List<Orders> ordersList=ordersDao.findAll();
		for(Orders order:ordersList) {
		if(order.getOrderId()==orderId) {
			ordersDao.deleteById(orderId);
			return "order deleted";
		}
		}
			throw new OrdersNotFoundException();
	}

	
	
}
