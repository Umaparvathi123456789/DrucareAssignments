package com.telusko.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.demo.entity.Workers;
@Repository
public interface WorkerRepo extends JpaRepository<Workers, Long> {

}
