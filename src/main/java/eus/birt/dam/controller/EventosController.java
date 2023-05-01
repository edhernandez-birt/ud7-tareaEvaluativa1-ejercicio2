package eus.birt.dam.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eus.birt.dam.domain.Evento;
import eus.birt.dam.repository.EventoRepository;

//@CrossOrigin (origins= {"http://localhost:4200"})
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class EventosController {

	
	@Autowired
	EventoRepository eventoRepository;
	
	/**
	 * Endpoint principal de hoteles.
	 * @return
	 */
	@GetMapping("/eventos")
	public ResponseEntity<List<Evento>> index() {
	    try {
	        List<Evento> eventos = eventoRepository.findAll();
	        return new ResponseEntity<List<Evento>>(eventos, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<Evento>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@GetMapping("/provincias")
	public ResponseEntity<List<String>> getAllTerritories() {
	    try {
	        List<Evento> eventos = eventoRepository.findAll();
	        Set<String> uniqueTerritories = new HashSet<>();
	        for (Evento evento : eventos) {
	        	//Hay que controlar que no sea null
	        	if (evento.getProperties().getTerritory() !=null) {
	        		uniqueTerritories.add(evento.getProperties().getTerritory());
	        	}
	        }
	        List<String> sortedTerritories = new ArrayList<>(uniqueTerritories);
	        Collections.sort(sortedTerritories);
	        return new ResponseEntity<List<String>>(sortedTerritories, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
		
}