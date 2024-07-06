package com.uma.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.login.entity.ProductTable;

public interface ProductRepo extends JpaRepository<ProductTable, Long> {
	
}
