package com.uma.login.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.login.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); 

}
