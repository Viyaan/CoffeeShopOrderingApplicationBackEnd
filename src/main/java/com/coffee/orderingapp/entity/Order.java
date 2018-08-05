package com.coffee.orderingapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Class representing a Order placed by custormer")
@Entity
@Table(name = "order_taken")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "quantity")
	private int quantity;
	
	
	@ManyToMany (fetch = FetchType.LAZY)
	@JoinTable(name ="order_item",  joinColumns ={
	@JoinColumn(name ="order_id", nullable =false, updatable =false)
	},
	inverseJoinColumns ={
	@JoinColumn(name ="item_id",nullable =false, updatable =false)})
	private Set<Item> items;

	@Column(name = "token_no")
	private int tokenNo;


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getTokenNo() {
		return tokenNo;
	}


	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}


	public Set<Item> getItems() {
		return items;
	}


	public void setItems(Set<Item> items) {
		this.items = items;
	}


	

}
