package com.uma.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.login.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
