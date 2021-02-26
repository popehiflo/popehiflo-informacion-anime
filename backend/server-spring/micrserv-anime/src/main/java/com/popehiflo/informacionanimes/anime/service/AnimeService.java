/**
 * 
 */
package com.popehiflo.informacionanimes.anime.service;

import java.util.List;

import com.popehiflo.informacionanimes.anime.entity.Anime;

/**
 * @author popehiflo
 * @version 1.0
 * Interface que contiene los metodos de logica de negocios para el anime
 */

public interface AnimeService {

	/**
	 * Metodo que permite consultar un listado de animes
	 * @return listado de animes
	 */
	List<Anime> consultarAnimes();
}
