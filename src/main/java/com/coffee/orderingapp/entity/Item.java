package com.coffee.orderingapp.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Class representing all coffee varieties in our Restaurant")
@Entity
@Table(name="items")
public class Item {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	private int itemId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="price")
	private double price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id")
	public Order orders;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Order getOrders() {
		return orders;
	}
	public void setOrders(Order orders) {
		this.orders = orders;
	}

	
	

}
