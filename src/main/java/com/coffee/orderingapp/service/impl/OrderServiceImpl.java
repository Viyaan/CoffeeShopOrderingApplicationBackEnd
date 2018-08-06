package com.coffee.orderingapp.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffee.orderingapp.entity.Item;
import com.coffee.orderingapp.entity.Order;
import com.coffee.orderingapp.model.CustomerOrder;
import com.coffee.orderingapp.model.OrderPlaced;
import com.coffee.orderingapp.repository.OrderRepository;
import com.coffee.orderingapp.service.OrderService;
import com.coffee.orderingapp.util.TokenGenerator;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order fetchAllOrders() {
		return null;
	}

	@Override
	public void saveOrder(OrderPlaced orderPlaced) {
		
		Order order = new Order();
		order = TokenGenerator.getToken(order);
		Set<Item> items = new HashSet<Item>();
		
		for(CustomerOrder cust_order: orderPlaced.getOrders()) {
			Item item = new Item();
			item.setQuantity(cust_order.getQuantity());
			item.setItemName(cust_order.getItem());
			item.setPrice(cust_order.getPrice());
			items.add(item);
		}
		
		order.setItems(items);
		orderRepository.save(order);
	}

}