package com.citi.hackathon.web;

import com.citi.hackathon.domain.Person;
import com.citi.hackathon.repositories.PeopleRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RequestMapping("/people")
@RestController
public class PeopleController {
  private final PeopleRepository peopleRepository;

  public PeopleController(PeopleRepository peopleRepository) {
    this.peopleRepository = peopleRepository;
  }

  @PostMapping
  public HttpEntity index(@RequestBody Person person) {
    return ok(peopleRepository.index(person));
  }

  @GetMapping
  public HttpEntity get(@RequestParam("nombre") String nombre, Pageable page) {
    return ok(peopleRepository.findByNombre(nombre, page).getContent());
  }
}
