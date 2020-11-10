package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.model.EventoModel;
																	//PQ É STRING?????
public interface EventoRepository extends CrudRepository<EventoModel, Long>{

	EventoModel findByCodigo(Long codigo);
	
}
