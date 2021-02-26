/**
 * 
 */
package com.popehiflo.informacionanimes.anime.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author popehiflo
 * @version 1.0
 * Clase que representa entidades de animes
 */

@Data
@Entity
@Table(name = "anime")
public class Anime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "anio")
	private int anio;
	
	@Column(name = "fecha_creacion")
	private LocalDateTime fechaCreacion;
}
