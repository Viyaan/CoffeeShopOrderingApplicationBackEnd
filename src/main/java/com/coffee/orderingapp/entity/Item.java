package com.coffee.orderingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
@ApiModel(description = "Class representing a Item.")
@Entity
@Table(name="items")

public class Item {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Item_Id")
	private int itemId;
	
	@Column(name="Item name")
	private String itemName;
	
	@Column(name="Price")
	private double price;
	
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

}
