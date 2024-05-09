package com.uma.linkdlen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uma.linkdlen.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

}
