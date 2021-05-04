package com.cg.lenscartappln.service;

import java.util.List;

import com.cg.lenscartappln.dto.OrdersDto;
import com.cg.lenscartappln.entity.Orders;
import com.cg.lenscartappln.utils.OrdersNotFoundException;

public interface IOrdersService {
	public void addOrders(OrdersDto ordersDto) throws OrdersNotFoundException;
	public List<Orders> getAllOrders() throws OrdersNotFoundException;
	public String modifyOrder(int order_id, Orders orders) throws OrdersNotFoundException;
	public String deleteOrder(int order_id) throws OrdersNotFoundException;
}
