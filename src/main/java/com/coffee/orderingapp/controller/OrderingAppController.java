package com.coffee.orderingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.orderingapp.entity.Login;
import com.coffee.orderingapp.entity.Order;
import com.coffee.orderingapp.entity.User;
import com.coffee.orderingapp.service.OrderService;
import com.coffee.orderingapp.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class OrderingAppController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderService orderService;

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@ApiOperation("Creates a new User.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = User.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/registration", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
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

	@ApiOperation("Login API.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = User.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	@PostMapping
	public ResponseEntity<String> login(@RequestBody Login login) {

		User userExists = userService.findUserByEmail(login.getEmail());
		if (userExists == null) {

			return ResponseEntity.status(HttpStatus.OK).body("User does not Exist, Please register yourself");
		} else {
			if (bcrypt.matches(login.getPassword(), userExists.getPassword())) {
				return ResponseEntity.status(HttpStatus.OK).body("Authenticated");
			}
		}
		return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Password Mismatch");

	}
	
	@ApiOperation("Take Order API.")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Order.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/takeOrder", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	@PostMapping
	public ResponseEntity<String> takeOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		return ResponseEntity.status(HttpStatus.OK).body("Order has been taken successfully");

	}

}
