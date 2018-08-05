package com.coffee.orderingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;


@ApiModel(description = "Class representing a Order status of each order placed by custormer.")
@Entity
@Table(name = "status")
public class OrderStatus {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "status_id")
	private String statusId;
	
	
	@Column(name = "order_id")
	private String orderId;
	
	@Column(name = "track_status")
	private OrderStatus trackingStatus;

}
