package com.coffee.orderingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.orderingapp.entity.User;
import com.coffee.orderingapp.service.UserService;

@RestController
public class OrderingAppController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/registration",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public ResponseEntity<String> createNewUser(@RequestBody User user) {
		System.out.println(user.getEmail());
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {

			return ResponseEntity.status(HttpStatus.OK)
					.body("There is already a user registered with the email provided");
		} else {
			userService.saveUser(user);

		}
		return ResponseEntity.status(HttpStatus.OK).body("User has been registered successfully");
	}

}
