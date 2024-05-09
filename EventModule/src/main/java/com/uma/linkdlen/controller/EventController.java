package com.uma.linkdlen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uma.linkdlen.model.Event;
import com.uma.linkdlen.service.EventService;

@RestController
@RequestMapping("/api")
public class EventController {
	@Autowired
	private EventService eventService;
	
	//Build REST API to create an event
	@PostMapping("/create/event")
public ResponseEntity<Event> createEvent(@RequestBody Event event) {
	return new ResponseEntity<Event>(eventService.saveEvent(event),HttpStatus.CREATED);
	}
	
	//Build REST API to get all events
	@GetMapping("/events")
	public List<Event> savedEventS(){
		return eventService.allEvents();
	}
}