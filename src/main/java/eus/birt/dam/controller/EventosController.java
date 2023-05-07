package eus.birt.dam.controller;

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
import org.springframework.web.bind.annotation.PathVariable;
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
	 * Endpoint de todos los eventos culturales en Euskadi y Nafarroa.
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

	/**
	 * Endpoint que nos proprciona las provincias en las que hay eventos
	 * 
	 * @return
	 */
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

	/**
	 * Endpoint que nos proporciona todos los tipos de eventos que hay
	 * 
	 * @return
	 */
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

	/**
	 * Endpoint que nos proporciona la lista de evento que hay en Ermua
	 * 
	 * @return
	 */
	@GetMapping("/ermua")
	public ResponseEntity<List<Evento>> getErmuaEvent() {
		try {
			List<Evento> eventos = eventoRepository.findAll();
			List<Evento> eventosAmurrio = new ArrayList<Evento>();
			for (Evento evento : eventos) {
				if (evento.getProperties().getMunicipality().equals("Ermua")) {
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
	
	/**
	 * Endpoint que nos devuelve todos los eventos que hay en la localidad que pasemos como parámetro
	 * (Recorremos con findAll() todos los eventos y añadimos los que cumplen la condición)
	 * @param eventtownname
	 * @return * 
	 */
	@GetMapping("/city/{eventtownname}")
	public ResponseEntity<List<Evento>> getTownEvent(@PathVariable String eventtownname) {
		try {
			List<Evento> eventos = eventoRepository.findAll();
			List<Evento> eventosTown = new ArrayList<Evento>();
			for (Evento evento : eventos) {
				if (evento.getProperties().getMunicipality().equals(eventtownname)) {
					eventosTown.add(evento);
				}
			}
			return new ResponseEntity<List<Evento>>(eventosTown, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Evento>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	/**
	 * Lo mismo que el punto anterior pero usando una Query personalizada en el repositorio (findByEventtownname)
	 * 
	 * @param eventtownname
	 * @return
	 */
	@GetMapping("/town/{eventtownname}")
	public ResponseEntity<List<Evento>> showByEventTownName(@PathVariable("eventtownname") String eventtownname) {
		try {
			List<Evento> eventosTown = eventoRepository.findByEventtownname(eventtownname);
			return new ResponseEntity<List<Evento>>(eventosTown,HttpStatus.OK);
		}catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Evento>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Endpoint que nos devuelve un evento aleatorio entre el total de eventos
	 * 
	 * @return
	 */
	@GetMapping("/random") 
	public ResponseEntity<Evento> getRandomEvent() {
		try {
			List<Evento> eventos = eventoRepository.findAll();
			// Generamos un número aleatorio entre 0 y la cantidad de eventos menos uno
			Random random = new Random();
			int indiceAleatorio = random.nextInt(eventos.size());
			// Accedemos al elemento correspondiente a ese indice
			Evento eventoAleatorio = eventos.get(indiceAleatorio);
			// Devolvemos un evento aleatorio
			return new ResponseEntity<Evento>(eventoAleatorio, HttpStatus.OK);
			
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Evento>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Endpoint que nos devuelve un evento aleatorio gratuito cualquiera
	 * 
	 * @return
	 */
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
			Random random = new Random();
			int indiceAleatorio = random.nextInt(eventosGratis.size());
			Evento eventoAleatorio = eventosGratis.get(indiceAleatorio);
			return new ResponseEntity<Evento>(eventoAleatorio, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Evento>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}