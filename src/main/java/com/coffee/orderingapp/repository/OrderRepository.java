package com.coffee.orderingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.coffee.orderingapp.entity.Order;
import com.coffee.orderingapp.enums.OrderStatus;



@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	@Query("from Order u where u.status = ?1")
	List<Order> findByOrderStatus(OrderStatus status);
	
	
}