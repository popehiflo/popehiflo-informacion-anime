package com.popehiflo.informacionanimes.anime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
