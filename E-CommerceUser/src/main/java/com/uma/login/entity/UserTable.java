package com.uma.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="Users")
public class UserTable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;

	    @Column(name = "username", nullable = false, length = 100)
	    private String username;

	    @Column(name = "password", nullable = false, length = 255)
	    private String password;

	    @Column(name = "email", nullable = false, unique = true, length = 100)
	    private String email;

	    @Column(name = "date", nullable = false, length = 255)
	    private String date;

	    @Column(name = "total", nullable = true, updatable=false)
	    private Double total;

	    private Long productId;

	    @Transient
	    private ProductTable product;

	    @Transient
	    private OrderTable order;

		public UserTable(Long userId, String username, String password, String email, String date, Double total,
				Long productId) {
			super();
			this.userId = userId;
			this.username = username;
			this.password = password;
			this.email = email;
			this.date = date;
			this.total = total;
			this.productId = productId;
		
		}

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

		public ProductTable getProduct() {
			return product;
		}

		public void setProduct(ProductTable product) {
			this.product = product;
		}

		public OrderTable getOrder() {
			return order;
		}

		public void setOrder(OrderTable order) {
			this.order = order;
		}

		public UserTable() {
			super();
		}

		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		