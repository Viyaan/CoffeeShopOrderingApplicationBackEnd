package com.coffee.orderingapp.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "Class representing a Order placed by custormer")
@Entity
@Table(name = "menu")
public class Menu {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "menu_id")
	private int menuId;
	
	@Column(name = "item")
	private String item;
	
	@Column(name = "price")
	private int price;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	

}
