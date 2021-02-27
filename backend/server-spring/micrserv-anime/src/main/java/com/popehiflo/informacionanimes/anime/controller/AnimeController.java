package com.popehiflo.informacionanimes.anime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.popehiflo.informacionanimes.anime.entity.Anime;
import com.popehiflo.informacionanimes.anime.service.AnimeService;

/**
 * @author popehiflo
 * @version 1.0
 * Controlador que manipula el flujo de los servicios rest del microservicio de anime
 */
@CrossOrigin
@RestController
@RequestMapping("/anime")
public class AnimeController {

	@Autowired
	private AnimeService animeServiceImpl;
	
	// http://localhost:8080/anime/consultarAnimes
	@GetMapping
	@RequestMapping(value = "consultarAnimes", method = RequestMethod.GET)
	public ResponseEntity<?> consultarAnimes() {
		
		List<Anime> animesConsultados = animeServiceImpl.consultarAnimes();
		
		return ResponseEntity.ok(animesConsultados);
	}
	
	// http://localhost:8080/anime/guardarAnime
	@PostMapping
	@RequestMapping(value = "guardarAnime", method = RequestMethod.POST)
	public ResponseEntity<?> guardarAnime(@RequestBody Anime anime) {
		
		Anime animeGuardado = this.animeServiceImpl.guardarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeGuardado);
	}
	
	// http://localhost:8080/anime/actualizarAnime
	@PutMapping
	@RequestMapping(value = "actualizarAnime", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarAnime(@RequestBody Anime anime) {
		
		Anime animeActualizado = this.animeServiceImpl.actualizarAnime(anime);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(animeActualizado);
	}
	
	// http://localhost:8080/anime/eliminarAnime/5
	@DeleteMapping
	@RequestMapping(value = "eliminarAnime/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarAnime(@PathVariable Integer id) {
		
		this.animeServiceImpl.eliminarAnime(id);
		
		return ResponseEntity.ok().build();
	}
	
}
