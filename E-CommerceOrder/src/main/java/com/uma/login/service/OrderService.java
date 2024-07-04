package com.uma.login.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uma.login.entity.Order;
import com.uma.login.repo.OrderRepository;
import com.uma.login.service.impl.OrdeServiceImpl;
@Service
public class OrderService implements OrdeServiceImpl {
	@Autowired
	 private OrderRepository orderRepository;
	
//GetMapping
    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }
//PostMapping
    public Order saveOrder(Order order) {
        return Stream.of(order)  
                     .map(orderRepository::save) 
                     .findFirst()  
                     .orElseThrow(); 
    }
//GetMapping
    public Optional<Order> getOrder(Long orderId) {
        return Stream.of(orderRepository.findById(orderId))  
                .flatMap(Optional::stream)  
                .findFirst();  
    }
//PutMapping
	public Optional<Order> updateOrder(Order order, Long orderId) {
	return 	orderRepository.findById(orderId);
	}
	
//DeleteMapping
	 public String deleteOrder(Long orderId) {
	        return Stream.of(orderId).peek(existingId -> orderRepository.deleteById(existingId))  
	                     .map(existingId -> "Deleted successfully")  
	                     .findFirst()  
	                     .orElse("Failed to delete order"); 
	    }
	 
//Rest Template service
	public List<Order> getUserOrder(String userId) {
	return orderRepository.findAll();
	}
}
