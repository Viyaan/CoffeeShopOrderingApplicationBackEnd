package com.coffee.orderingapp.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.coffee.orderingapp.enums.OrderStatus;
import com.coffee.orderingapp.service.OrderService;


	
	
	@Component
	public class OrderStatusUpdateScheduler  {
		
		
		@Autowired
		private OrderService orderService;
		
		
		@Scheduled(fixedRate = 30000, initialDelay = 30000)
		public void scheduleInKitchenTask() {
			System.out.println("inside scheduleFixedRateTask");
			orderService.findandUpdateByStatus(OrderStatus.ORDER_PLACED, OrderStatus.IN_KITCHEN);
		}
	 
		@Scheduled(fixedRate = 60000)
		public void scheduleDeliveredTask() {
			System.out.println("inside scheduleFixedRateTask");
			orderService.findandUpdateByStatus(OrderStatus.IN_KITCHEN, OrderStatus.DELIVERED);
		}
	    
	   
	}


