package com.telusko.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.demo.entity.Students;

import jakarta.persistence.Entity;
@Entity
public interface StudentRepo extends JpaRepository<Students, Long>{

}
