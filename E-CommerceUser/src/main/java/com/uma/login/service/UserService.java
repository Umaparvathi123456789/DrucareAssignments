package com.uma.login.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.uma.login.entity.Product;
import com.uma.login.entity.User;
import com.uma.login.entity.UserOrders;
import com.uma.login.repo.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository;
	 
	   @Autowired
	    private RestTemplate restTemplate;
// Rest template Logic
//	   public List<User> getUser1(Long userId) {
//		     UserOrders userOrders = restTemplate.getForObject("http://localhost:8081/orders/data/users/"+userId, UserOrders.class);
//		        if (userOrders == null || userOrders.getUserOrders() == null) {
//		            return null;
//		        }
//		        return userOrders.getUserOrders().stream().map(orderData -> {
//		            Product product = restTemplate.getForObject("http://localhost:8082/products/" + orderData.getProductId(), Product.class);
//		            return new User(
//		                userId, // assuming the same userId for all orders
//		                "", 
//		                "parvathi@123", 
//		                "umaparvathi@gmail.com.com",    
//		                product.getName(), 
//		                product.getDescription(), 
//		                product.getPrice(),
//		               orderData.getDate(),
//		                orderData.getTotal()
//		            );
//		        }).collect(Collectors.toList());
//		    }
	   
	   // code for rest template to handle HttpClientErrorException
	   public List<User> getUser1(Long userId) {
		   UserOrders  userOrders;
	        try {
	        userOrders = restTemplate.getForObject("http://E-CommerceOrder/orders/data/users/" + userId, UserOrders.class);
	        } catch (HttpClientErrorException e) {
	            if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
	                System.err.println("User orders not found for userId " + userId + " at URL: " + "http://E-CommerceOrder/orders/data/users/" + userId);
	                return null;
	            } else {
	                System.err.println("Error while fetching user orders for userId " + userId + ": " + e.getMessage());
	                throw e;
	                }   }
	        if (userOrders == null || userOrders.getUserOrders() == null) {
	            System.err.println("No orders found for userId " + userId);
	            return null;
	            }
	        return userOrders.getUserOrders().stream().map(orderData -> {
	        	 Product product;
	          try {
	              product = restTemplate.getForObject("http://E-CommerceProduct/products/" + orderData.getProductId(), Product.class);
	            } catch (HttpClientErrorException e) {
	                if (e.getStatusCode() == HttpStatus.NOT_FOUND) {
	                    System.err.println("Product not found for productId " + orderData.getProductId() + " at URL: " + "http://E-CommerceProduct/products/" + orderData.getProductId());
	                    return null;
	                } else {
	                    System.err.println("Error while fetching product for productId " + orderData.getProductId() + ": " + e.getMessage());
	                    throw e;
	                }}
	            if (product == null) {
	                System.err.println("Product is null for productId " + orderData.getProductId());
	                return null;
	            }
	            return new User(
	                userId, // assuming the same userId for all orders
	                "uma parvathi", // username 
	                "parvathi@123", // password 
	                "umaparvathiu@gmail.com", // email
	                orderData.getDate(), //dare from order 
	                orderData.getTotal(), // total amount from the order
	                orderData.getProductId(), // product ID from the order
	                product.getName(), // product name
	                product.getDescription(), // product description
	                product.getPrice() // product price
	            );
	        }).filter(user -> user != null).collect(Collectors.toList());
	    }
//@PostMapping
		public User newUser(User user) {
			return userRepository.save(user);
		}
//@GetMapping
		public List<User> allUsers() {
			return userRepository.findAll();
			}
//@GetMapping
		public Optional<User> getUsers(Long userId) {
			return userRepository.findById(userId);
		}
//PutMapping
		public Optional<User> updateUser(User user, Long userId) {
			User existingUser = userRepository.findById(userId)
			            .orElseThrow(() -> new RuntimeException("user not found with id: " + userId));
			    existingUser.setUsername(user.getUsername());
			    existingUser.setPassword(user.getPassword());
			    existingUser.setEmail(user.getEmail());
			    userRepository.save(existingUser);
		        return Optional.of(existingUser);
		}
//@DeleteMapping
		public String deleteUser(Long userId) {
			userRepository.deleteById(userId);
			return "Deleted Sucessfully";
		}
		}
