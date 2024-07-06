package com.uma.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="products")
public class ProductTable {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long productId;
	 
	    private String name;
	    private String description;
	    private Double price;
	    
		public ProductTable(Long productId, String name, String description, Double price) {
			super();
			this.productId = productId;
			this.name = name;
			this.description = description;
			this.price = price;
		}
		public ProductTable() {
			super();
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
	    
	 
}
