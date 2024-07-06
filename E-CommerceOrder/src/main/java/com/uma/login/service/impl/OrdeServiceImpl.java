package com.uma.login.service.impl;

import java.util.List;
import java.util.Optional;

import com.uma.login.entity.Order;
import com.uma.login.entity.OrderTable;

public interface OrdeServiceImpl {

	//OrderEntity
	List<Order> findAllOrders();
	
	Order saveOrder(Order order);
	
	
	Optional<Order> getOrder(Long orderId);

	Optional<Order> updateOrder(Order order, Long orderId);
	
	String deleteOrder(Long orderId);
	
	List<Order> getUserOrder(String userId);
	
	//OrderTableEntity
	OrderTable getOrderByUserId(Long userId);
	
	OrderTable saveOrderTable(OrderTable order);
}
