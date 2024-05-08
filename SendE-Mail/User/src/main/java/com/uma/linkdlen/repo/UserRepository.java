package com.uma.linkdlen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.linkdlen.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
