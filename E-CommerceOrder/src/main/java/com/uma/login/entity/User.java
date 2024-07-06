package com.uma.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="User_Table")
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;
	 
	    @Column(name = "username", nullable = false,unique = false, length = 100)
	    private String username;
	    
	    @Column(name = "password", nullable = false,unique = false, length = 255)
	    private String password;

	    @Column(name = "email", nullable = false,unique = true, length = 100)
	    private String email;
	    
	    private Long productId;
	   
	    @Transient
	    private Product product;
	    @Transient
	    private Order order;

//Parameterized constructor
	    public User(Long userId, String username, String password, String email, Long productId) {
	    	super();
	    	this.userId = userId;
	    	this.username = username;
	    	this.password = password;
	    	this.email = email;
	    	this.productId = productId;
	    }
//Constructor
		public User() {
			super();
		}



//Getter and Setters		
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public Long getUserId() {
			return userId;
		}

		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public Order getOrder() {
			return order;
		}
		public void setOrder(Order order) {
			this.order = order;
		}
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getProductId() {
			return productId;
		}
		public void setProductId(Long productId) {
			this.productId = productId;
		}
	
		
	    
}