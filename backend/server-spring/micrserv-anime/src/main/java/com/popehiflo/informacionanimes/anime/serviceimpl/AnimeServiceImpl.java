/**
 * 
 */
package com.popehiflo.informacionanimes.anime.serviceimpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.popehiflo.informacionanimes.anime.entity.Anime;
import com.popehiflo.informacionanimes.anime.repository.AnimeRepository;
import com.popehiflo.informacionanimes.anime.service.AnimeService;

/**
 * @author popehiflo
 * @version 1.0
 * Clase que implementa los metodos de logica de negocio de la
 * interface de AnimeService
 */

@Service
public class AnimeServiceImpl implements AnimeService {
	/**
	 * Bean Repository de Spring inyectado para ejecutar el CRUD
	 */
	@Autowired
	private AnimeRepository animeRespository;

	@Override
	public List<Anime> consultarAnimes() {
		// Convertir de Iterable a List
		List<Anime> animesDataSource = StreamSupport.stream(
										animeRespository.findAll().spliterator(), false)
										.collect(Collectors.toList());
		return animesDataSource;
	}

	@Override
	public Anime guardarAnime(Anime anime) {
		// Asignar fecha de creacion
		anime.setFechaCreacion(LocalDateTime.now());
		
		return animeRespository.save(anime);
	}

	@Override
	public Anime actualizarAnime(Anime anime) {
		// TODO Auto-generated method stub
		return animeRespository.save(anime);
	}

	@Override
	public void eliminarAnime(Integer id) {
		// TODO Auto-generated method stub
		animeRespository.deleteById(id);
	}
	
	
}
