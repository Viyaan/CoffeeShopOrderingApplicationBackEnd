package com.coffee.orderingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.orderingapp.entity.Order;



@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}