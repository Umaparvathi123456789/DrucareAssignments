package com.uma.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.login.entity.OrderTable;

public interface OrderRepo extends JpaRepository<OrderTable, Long> {

	OrderTable findByUserId(Long userId);
 

}
