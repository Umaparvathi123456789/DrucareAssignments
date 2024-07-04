package com.uma.login.service.impl;

import java.util.List;
import java.util.Optional;

import com.uma.login.entity.Order;

public interface OrdeServiceImpl {

	List<Order> findAllOrders();
	
	Order saveOrder(Order order);
	
	
	Optional<Order> getOrder(Long orderId);

	Optional<Order> updateOrder(Order order, Long orderId);
	
	String deleteOrder(Long orderId);
	
	List<Order> getUserOrder(String userId);
}
