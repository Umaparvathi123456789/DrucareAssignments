package com.telusko.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.demo.entity.Teachers;

import jakarta.persistence.Entity;
@Entity
public interface TeacherRepo extends JpaRepository<Teachers, Long> {

}
