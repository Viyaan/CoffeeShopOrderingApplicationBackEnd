package com.coffee.orderingapp.service;

import java.util.List;

import com.coffee.orderingapp.entity.Order;
import com.coffee.orderingapp.model.OrderPlaced;

public interface OrderService {
	public List<Order> fetchAllOrders();

	public void saveOrder(OrderPlaced order);

}
