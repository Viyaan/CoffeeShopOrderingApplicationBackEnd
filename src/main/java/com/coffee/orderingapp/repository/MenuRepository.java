package com.coffee.orderingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffee.orderingapp.entity.Menu;



@Repository("menuRepository")
public interface MenuRepository extends JpaRepository<Menu, Long> {
	
}