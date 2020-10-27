package com.citi.hackathon.repositories;

import com.citi.hackathon.domain.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;

public interface EventRepository extends ElasticsearchRepository<Event, String> {
	Page<Event> findByNombre(@Param("nombre") String nombre, Pageable page);
}
