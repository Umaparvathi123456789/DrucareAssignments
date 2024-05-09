package com.uma.linkdlen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uma.linkdlen.model.Event;
import com.uma.linkdlen.repository.EventRepository;

@Service
public class EventService {
	@Autowired
	private EventRepository eventRepository;

	public Event saveEvent(Event event) {	
		return eventRepository.save(event);
	}

	public List<Event> allEvents() {
		return eventRepository.findAll();
	}

}
