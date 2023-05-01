package eus.birt.dam.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import eus.birt.dam.domain.Evento;

public interface EventoRepository extends MongoRepository<Evento, String>{
	
}
