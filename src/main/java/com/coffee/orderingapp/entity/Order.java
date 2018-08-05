package com.coffee.orderingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Class representing a Order placed by custormer.")
@Entity
@Table(name = "Order")
public class Order {

	@Column(name = "quantity")
	private int quantity;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_Id")
	private String orderId;

	@Column(name = "token_No")
	private int tokenNo;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
