package com.uma.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Order_Table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true)
    private Long orderId;
    
    @Column(name = "date", nullable = false, unique = true, length = 255) 
    private String date;
    
    @Column(name = "total", nullable = true, updatable=false,unique = true)
    private Double total;
    
    private Long productId;

//parameterized constructor
    public Order(Long orderId, String date, Double total, Long productId) {
    	super();
    	this.orderId = orderId;
    	this.date = date;
    	this.total = total;
    	this.productId = productId;
    }
	
//constructor
	public Order() {
		super();
	}

//Getters and Setters
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", date=" + date + ", total=" + total + ", productId=" + productId + "]";
	}
	   
    
	
    
}