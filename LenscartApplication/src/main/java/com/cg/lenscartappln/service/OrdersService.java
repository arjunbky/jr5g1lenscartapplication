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
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

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
		order.setOrder_id(ordersDto.getOrder_id());
		order.setDate_of_order(ordersDto.getDate_of_order());
		order.setExpected_date_of_arrival(ordersDto.getExpected_date_of_arrival());
		order.setCart(ordersDto.getCart());;
		order.setCustomer(ordersDto.getCustomer());
		order.setTotal_cost(ordersDto.getTotal_cost());
////		
//		ObjectMapper mapper=new ObjectMapper();
//		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		
//		order=mapper.convertValue(ordersDto, Orders.class);
		ordersDao.save(order);
		
	}
	
//	** method to get all the details of Order**
	public List<Orders> getAllOrders(){
		List<Orders> orderslist=ordersDao.findAll();
		return orderslist;
	}
	
//	**method to update the existing order in the table**
	public String modifyOrder(int order_id, Orders orders) throws OrdersNotFoundException {
		if(ordersDao.existsById(order_id)) {
			Orders order=ordersDao.findById(order_id).get();
			order.setDate_of_order(orders.getDate_of_order());
			order.setCustomer(orders.getCustomer());
			order.setExpected_date_of_arrival(orders.getExpected_date_of_arrival());
			order.setCart(orders.getCart());
			order.setTotal_cost(orders.getTotal_cost());
			ordersDao.save(orders);
		return "order updated";
	}
		else 
			throw new OrdersNotFoundException();
	}
	
//	*method to delete the order based on order_id**
	public String deleteOrder(int order_id) throws OrdersNotFoundException {
		List<Orders> ordersList=ordersDao.findAll();
		for(Orders order:ordersList) {
		if(order.getOrder_id()==order_id) {
			ordersDao.deleteById(order_id);
			return "order deleted";
		}
		}
			throw new OrdersNotFoundException();
	}

	
	
}
