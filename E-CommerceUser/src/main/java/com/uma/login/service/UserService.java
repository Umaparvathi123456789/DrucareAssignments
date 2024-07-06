package com.uma.login.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.uma.login.entity.Order;
import com.uma.login.entity.OrderTable;
import com.uma.login.entity.Product;
import com.uma.login.entity.ProductTable;
import com.uma.login.entity.User;
import com.uma.login.entity.UserTable;
import com.uma.login.repo.UserRepo;
import com.uma.login.repo.UserRepository;

@Service
public class UserService {
	 @Autowired
	    private UserRepository userRepository;
	 @Autowired
	 private UserRepo repo;
	 
	   @Autowired
	    private RestTemplate restTemplate;
// Rest template Logic
	   //new table rest template
	   public Optional<UserTable> getUserWithDetails(Long userId) {
	        Optional<UserTable> userOptional = repo.findById(userId);

	        if (userOptional.isPresent()) {
	        	UserTable user = userOptional.get();
	            OrderTable order = restTemplate.getForObject("http://E-CommerceOrder/orders/data/users/rest/" + userId, OrderTable.class);
	            user.setOrder(order);

	            ProductTable product = restTemplate.getForObject("http://E-CommerceProduct/products/rest/" + user.getProductId(), ProductTable.class);
	            user.setProduct(product);

	            return Optional.of(user);
	        }

	        return Optional.empty();
	    }
	   
//normal rest
 public User getUser1(Long userId) {
	 
	 Optional<User> userOptional = userRepository.findById(userId);
	    
	    if (userOptional.isPresent()) {
	        User user = userOptional.get();
	        
	        try {
	            Order order = restTemplate.getForObject("http://E-CommerceOrder/orders/data/users/" + userId, Order.class);
	            user.setOrder(order);
	        } catch (HttpClientErrorException e) {
	            // Handle the error, maybe log it or set an error state in the user object
	            e.printStackTrace();
	        }
	        
	        try {
	            Product product = restTemplate.getForObject("http://E-CommerceProduct/products/" + user.getProductId(), Product.class);
	            user.setProduct(product);
	        } catch (HttpClientErrorException e) {
	            // Handle the error, maybe log it or set an error state in the user object
	            e.printStackTrace();
	        }
	        
	        return user;
	    }
	    
	    return null; // or throw an exception if user is not found
 }
 

	public UserTable newUserss(UserTable user) {
		// TODO Auto-generated method stub
		return repo.save(user);
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
