package com.coffee.orderingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.orderingapp.entity.Login;
import com.coffee.orderingapp.entity.User;
import com.coffee.orderingapp.service.UserService;

@RestController
public class OrderingAppController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@RequestMapping(value = "/registration",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public ResponseEntity<String> createNewUser(@RequestBody User user) {
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {

			return ResponseEntity.status(HttpStatus.OK)
					.body("There is already a user registered with the email provided");
		} else {
			userService.saveUser(user);

		}
		return ResponseEntity.status(HttpStatus.OK).body("User has been registered successfully");
	}
	
	
	
	@RequestMapping(value = "/login",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public ResponseEntity<String> login(@RequestBody Login login) {
		
		User userExists = userService.findUserByEmail(login.getEmail());
		if (userExists == null) {

			return ResponseEntity.status(HttpStatus.OK)
					.body("User does not Exist, Please register yourself");
		}
		else {
			if(bcrypt.matches(login.getPassword(), userExists.getPassword())) {
				return ResponseEntity.status(HttpStatus.OK)
						.body("Authenticated");
			}
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN)
				.body("Password Mismatch");
		
	}

}
