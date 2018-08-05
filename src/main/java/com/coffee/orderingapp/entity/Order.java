package com.coffee.orderingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Class representing a Order.")
@Entity
@Table(name = "Order")

public class Order {
	
	@Column(name = "Qty")
	private int qty;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Order_Id")
	private String orderId;
	
	@Column(name = "Token_No")
	private int tokenNo;
	
	
	
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	
	
 }
