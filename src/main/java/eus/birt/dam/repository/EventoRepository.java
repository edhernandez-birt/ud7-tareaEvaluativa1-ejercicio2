package eus.birt.dam.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import eus.birt.dam.domain.Evento;

public interface EventoRepository extends MongoRepository<Evento, String>{
    
	//@Query("{ 'properties.eventtownname' : ?0 }") //Con esta query tiene que coincidir la cadena completa
	
	//Query personalizada que busque en enttownname el nombre de string que pasemos sin importar mayus-minus
	@Query("{ 'properties.eventtownname' : { $regex: ?0, $options: 'i' } }")
	List<Evento> findByEventtownname(String eventtownname);
	
}
