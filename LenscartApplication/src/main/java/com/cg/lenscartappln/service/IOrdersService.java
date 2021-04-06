package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.entity.Orders;
import com.cg.lenscartappln.utils.OrdersNotFoundException;

public interface IOrdersService {
	public void addOrders(Orders orders) throws OrdersNotFoundException;
	public List<Orders> getAllOrders() throws OrdersNotFoundException;
	public Orders getOrdersByCartId(int cart_id) throws OrdersNotFoundException;
	public List<Orders> getCustomerDetails(int customer_id) throws OrdersNotFoundException;

}
