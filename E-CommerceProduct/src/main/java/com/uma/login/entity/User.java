package com.uma.login.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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
    
    @Column(name = "date", nullable = false, unique = true, length = 255) 
    private String date;
    
    @Column(name = "total", nullable = true, updatable=false,unique = true)
    private Double total;
    
    private Long productId;
    
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

//Parameterized Constructor
	public User(Long userId, String username, String password, String email, String date, Double total,
			Long productId, String name, String description, Double price) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.date = date;
		this.total = total;
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
	}
//Constructor
	public User() {
		super();
	}
//Getters and Setters
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", date=" + date + ", total=" + total + ", productId=" + productId + ", name=" + name
				+ ", description=" + description + ", price=" + price + "]";
	}
    
	  
		
}
	    

