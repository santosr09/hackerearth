package com.citi.hackathon.web;

import com.citi.hackathon.domain.Event;
import com.citi.hackathon.repositories.EventRepository;
import com.citi.hackathon.utils.EventsMock;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RequestMapping("/events")
@RestController
public class EventController {
	
	private final EventRepository eventRepository;
	
	public EventController(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	@PostMapping
	public HttpEntity index(@RequestBody Event event) {
		return ok(eventRepository.index(event));
	}
	
	@GetMapping
	public HttpEntity get(@RequestParam("nombre") String nombre, Pageable page) {
		this.initList();
		return ok(eventRepository.findByNombre(nombre, page).getContent());
	}
	
	private void initList(){
		EventsMock mock = new EventsMock();
		mock.intiEvents();
		for (Event item : mock.eventsMock ) {
			eventRepository.index(item);
		}
	}
	
}
