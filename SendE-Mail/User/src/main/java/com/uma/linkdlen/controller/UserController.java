package com.uma.linkdlen.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uma.linkdlen.entity.User;
import com.uma.linkdlen.repo.UserRepository;

@RestController
@RequestMapping("/edit/job/preference")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	public User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping("/user/{id}")
	
	 public Optional<User> getUserByjobTitles(@PathVariable Long id) {
		return userRepository.findById(id);
	}
	@PutMapping("/user/{id}")
	String updateUser(@RequestBody User newUser, @PathVariable Long id) {
		User user =userRepository.findById(id).get();
			user.setLocationTypes(newUser.getLocationTypes());
			user.setLocationTypes(newUser.getLocationTypes());
			user.setStartDate(newUser.getStartDate());
			user.setEmployementType(newUser.getEmployementType());
			user.setVisibility(newUser.getVisibility());
			 userRepository.save(user);
		return "updated..";
	}

	@DeleteMapping("/user/delete/{id}")
	String deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return "User with id " + id + " has been deleted success.";
	}
	@GetMapping("/user")
public String getPage() {
		return "Welcome...";
}
	
}

