package com.uma.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uma.login.entity.UserTable;


public interface UserRepo extends JpaRepository<UserTable, Long> {

}
