package com.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventosapp.model.ConvidadoModel;
import com.eventosapp.model.EventoModel;

public interface ConvidadoRepository extends CrudRepository<ConvidadoModel, Long>{

	Iterable<ConvidadoModel> findByEvento(EventoModel evento);
	
}
