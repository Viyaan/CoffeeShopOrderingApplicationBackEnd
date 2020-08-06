package com.coffee.orderingapp.service;

import com.coffee.orderingapp.entity.User;

public interface UserService {
	public User findUserByEmail(String email);

	public void saveUser(User user);
}
