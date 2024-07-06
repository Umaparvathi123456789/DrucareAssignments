package com.uma.login.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.uma.login.entity.Product;
import com.uma.login.entity.ProductTable;

public interface ProductServiceImpl {
//Product Entity	
	List<Product> findAll();
	
	Product saveProduct(Product product);
	
	 Optional<Product> getProduct(Long productId);
	 
	 Optional<Product> updateEmployee(Product product, Long productId);
	 
	 String deleteProduct1(Long productId);
	 
	 Page<Product> getProductByPage(Optional<Integer> pageNo, Optional<String> sortBy);
	 
	 List<Product> searchProduts(String query);
	 
	 List<Product> getFilteredProducts(String name, String description, Double price);
	 
	 Page<Product> getProductsSorted(int pageNo, int pageSize, String sortBy);
	 
	 Product saveProduct(Product product, Long userId);
	 
	 List<Product> getAllProducts();
	 
	 Optional<Product> getProductById(Long userId,Long productId);
	 
	 Optional<Product> updateProduct(Product product, Long productId,Long userId);
	 
	 String deleteProduct(Long productId);
	 
//ProductTabel Entity
	 Optional<ProductTable> getProductById(Long productId);
	 
	 ProductTable savedProducts(ProductTable product);
}
