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
	
	/**
	 * Metodo que permite guardar un anime
	 * @param anime {@link Anime} objeto anime a guardar
	 * @return anime guardado
	 */
	Anime guardarAnime(Anime anime);
	
	/**
	 * Metodo que permite actualizar un anime.
	 * @param anime {@link Anime} objeto anime a actualizar.
	 * @return anime actualizado.
	 */
	Anime actualizarAnime(Anime anime);
	
	/**
	 * Metodo que permite eliminar un anime.
	 * @param id {@link Integer} objeto anime a eliminar.
	 * @return anime eliminado.
	 */
	void eliminarAnime(Integer id);
}
