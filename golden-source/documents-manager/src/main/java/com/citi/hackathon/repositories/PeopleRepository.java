package com.citi.hackathon.repositories;

import com.citi.hackathon.domain.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;

public interface PeopleRepository extends ElasticsearchRepository<Person, String> {
  Page<Person> findByNombre(@Param("nombre") String nombre, Pageable page);
}
