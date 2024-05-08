package com.telusko.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.demo.entity.Players;

@Repository
public interface PlayerRepo extends JpaRepository<Players, Long>{

}
