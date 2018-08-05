package com.coffee.orderingapp.service;

import com.coffee.orderingapp.entity.Order;

public interface OrderService {
	public Order fetchAllOrders();

	public void saveOrder(Order order);
}
