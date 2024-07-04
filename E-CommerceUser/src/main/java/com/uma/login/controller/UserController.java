package com.uma.login.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uma.login.entity.User;
import com.uma.login.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    
 //RestTemplate API
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<User>> getUser1(@PathVariable Long userId) {
    	List<User> users=userService.getUser1(userId);
    	
        return new ResponseEntity<>(users,HttpStatus.OK);
    }
 //API operations   
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<>(userService.newUser(user),HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<List<User>> allUsers(){
		return new ResponseEntity<>(userService.allUsers(),HttpStatus.OK);
	}
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId) {
	Optional<User> users=userService.getUsers(userId);
		return users.map(details -> new ResponseEntity<>(details, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	@PutMapping("/update/{userId}")
	public  ResponseEntity<User>  updateUser(@RequestBody User user, @PathVariable Long userId) {
		Optional<User> userDetails= userService.updateUser(user,userId);
		return userDetails.map(details->new ResponseEntity<>(details, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
	@DeleteMapping("delete/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
		return new ResponseEntity<>(userService.deleteUser(userId),HttpStatus.OK);
	}

}
