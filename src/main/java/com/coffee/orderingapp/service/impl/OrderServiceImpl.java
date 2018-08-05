package com.coffee.orderingapp.service.impl;

import java.util.Random;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.orderingapp.entity.Order;
import com.coffee.orderingapp.repository.OrderRepository;
import com.coffee.orderingapp.service.OrderService;
import com.coffee.orderingapp.util.TokenGenerator;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order fetchAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		order = TokenGenerator.getToken(order);

		order.setOrderId("");
		order.setQuantity(5);

		// orderRepository.save(order);
	}

}