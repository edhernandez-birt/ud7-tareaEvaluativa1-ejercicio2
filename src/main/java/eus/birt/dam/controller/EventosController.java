package eus.birt.dam.controller;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
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
	 * Endpoint principal de eventos culturales en Euskadi y Nafarroa.
	 * 
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
				// Hay que controlar que no sea null
				if (evento.getProperties().getTerritory() != null) {
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

	@GetMapping("/tipos")
	public ResponseEntity<List<String>> getAllEventtypes() {
		try {
			List<Evento> eventos = eventoRepository.findAll();
			Set<String> uniqueEventtypes = new HashSet<>();
			for (Evento evento : eventos) {
				uniqueEventtypes.add(evento.getProperties().getEventtype());
			}
			List<String> listedEventtypeStrings = new ArrayList<>(uniqueEventtypes);
			// Collections.sort(sortedEventtypes);
			return new ResponseEntity<List<String>>(listedEventtypeStrings, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/amurrio")
	public ResponseEntity<List<Evento>> getAmurrioEvent() {
		try {
			List<Evento> eventos = eventoRepository.findAll();
			List<Evento> eventosAmurrio = new ArrayList<Evento>();
			for (Evento evento : eventos) {
				if (evento.getProperties().getMunicipality().equals("Amurrio")) {
					System.out.println("##########################################");
					System.out.println(evento.getProperties().getDocumentname());
					System.out.println(evento.getProperties().getEventtype());
					System.out.println(evento.getProperties().getEventwhere());
					System.out.println(evento.getProperties().getEventstartdate());
					System.out.println("##########################################");
					eventosAmurrio.add(evento);
				}
			}
			return new ResponseEntity<List<Evento>>(eventosAmurrio, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Evento>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/random")
	public ResponseEntity<Evento> getRandomEvent() {
		try {
			List<Evento> eventos = eventoRepository.findAll();

			// Generar un número aleatorio entre 0 y la cantidad de eventos menos uno
			Random random = new Random();
			int indiceAleatorio = random.nextInt(eventos.size());

			// Acceder al elemento correspondiente a ese indice
			Evento eventoAleatorio = eventos.get(indiceAleatorio);
			// Devolver evento aleatorio
			return new ResponseEntity<Evento>(eventoAleatorio, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Evento>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/randomfree")
	public ResponseEntity<Evento> getRandomFreeEvent() {
		try {
			List<Evento> eventos = eventoRepository.findAll();
			//Lista para añadir eventos que sean Gratis
			List<Evento> eventosGratis = new ArrayList<Evento>();

			for (Evento evento : eventos) {
				if (evento.getProperties().getEventprice() != null
						&& evento.getProperties().getEventprice().equals("Gratis")) 
				{
					eventosGratis.add(evento);
				}
			}

			// Generar un número aleatorio entre 0 y la cantidad de eventos menos uno
			Random random = new Random();
			int indiceAleatorio = random.nextInt(eventosGratis.size());

			// Acceder al elemento correspondiente a ese indice
			Evento eventoAleatorio = eventosGratis.get(indiceAleatorio);
			// Devolver evento aleatorio
			return new ResponseEntity<Evento>(eventoAleatorio, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Evento>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}