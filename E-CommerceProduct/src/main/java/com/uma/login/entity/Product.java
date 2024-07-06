package com.uma.login.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_Table")
public class Product {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(unique = true)
	    private Long productId;

	    @Column(name = "name", nullable = false, length = 255)
	    private String name;

	    @Column(name = "description", nullable = false, length = 255)
	    private String description;

	    @Column(name = "price", nullable = false)
	    private Double price;
	    
	    private Long orderId;

	    @ManyToOne
	    @JoinColumn(name = "userId")
	    private User user;
	    
//constructor
	    public Product() {
			super();
		}

//parameterized constructor
		public Product(Long productId, String name, String description, Double price, Long userId,Long orderId) {
			super();
			this.productId = productId;
			this.name = name;
			this.description = description;
			this.price = price;
			this.user = new User(userId,"","","",null);
			this.orderId=orderId;
		}
		
//Getters and Setters
		
	
		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
	    public Long getProductId() {
	        return productId;
	    }

		public void setProductId(Long productId) {
	        this.productId = productId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public Double getPrice() {
	        return price;
	    }

	    public void setPrice(Double price) {
	        this.price = price;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
					+ price + ", user=" + user + "]";
		}
	    
	    
}
