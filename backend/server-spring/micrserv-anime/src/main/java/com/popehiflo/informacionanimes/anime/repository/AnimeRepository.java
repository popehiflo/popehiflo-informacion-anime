/**
 * 
 */
package com.popehiflo.informacionanimes.anime.repository;

import org.springframework.data.repository.CrudRepository;

import com.popehiflo.informacionanimes.anime.entity.Anime;

/**
 * @author popehiflo
 * @version 1.0
 * Interface que contiene el CRUD con Spring JPA para la tabla anime
 */

public interface AnimeRepository extends CrudRepository<Anime, Integer>{

}
