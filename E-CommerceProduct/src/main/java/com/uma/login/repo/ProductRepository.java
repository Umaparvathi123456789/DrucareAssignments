package com.uma.login.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uma.login.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
//Filtering
	  @Query("SELECT p FROM Product p WHERE " +
	           "(:name IS NULL OR LOWER(p.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
	           "(:description IS NULL OR LOWER(p.description) LIKE LOWER(CONCAT('%', :description, '%'))) AND " +
	           "(:price IS NULL OR p.price = :price)")
	    List<Product> findByCriteria(@Param("name") String name, 
	                                 @Param("description") String description, 
	                                 @Param("price") Double price);
	 //Searching
	  @Query("SELECT p FROM Product p WHERE p.name LIKE %:name%")
	    List<Product> searchProduct1(@Param("name") String name);
//ProductTable 
	    Product findByProductId(Long productId);

	 
}