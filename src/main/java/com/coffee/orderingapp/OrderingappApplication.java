package com.coffee.orderingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@EnableEurekaClient
public class OrderingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderingappApplication.class, args);
	}
}
