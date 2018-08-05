package com.coffee.orderingapp.service;

import com.coffee.orderingapp.entity.Order;
import com.coffee.orderingapp.model.OrderPlaced;

public interface OrderService {
	public Order fetchAllOrders();

	public void saveOrder(OrderPlaced order);
}
