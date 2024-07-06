package com.uma.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class OrderTable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long orderId;

	    private Long userId;
	    private String orderDetails;
	    
		public OrderTable(Long orderId, Long userId, String orderDetails) {
			super();
			this.orderId = orderId;
			this.userId = userId;
			this.orderDetails = orderDetails;
		}
		public Long getOrderId() {
			return orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getOrderDetails() {
			return orderDetails;
		}
		public void setOrderDetails(String orderDetails) {
			this.orderDetails = orderDetails;
		}
		public OrderTable() {
			super();
		}
	    
	
}
