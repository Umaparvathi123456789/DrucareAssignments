package com.uma.login.service.impl;

import java.util.List;
import java.util.Optional;

import com.uma.login.entity.User;

public interface UserServiceImpl {

	List<User> getUser(String userId);
	
	User newUser(User user);
	
	List<User> allUsers();
	
	Optional<User> getUser(Long userId);
	
	Optional<User> updateUser(User user, Long userId);
	
	String deleteUser(Long userId);
	
	 List<User> getUser1(Long userId);
	 
	 Optional<User> getUsers(Long userId);
}
