package com.ArmatorX.BardodeChessentaBE.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
/**
 * Esta clase representa a las canciones cargadas en el programa.
 * Cada canción tiene un nombre, una url o link, y una emoción asociada.
 * Además puede estar asociada a un lugar, y tener información extra (como 
 * un personaje o momento al que está asociada).
 * @author ArmatorX
 *
 */
public class Cancion {
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	private String link;
	@ManyToOne
	private EmocionEspecifica emocion;
	@ManyToOne
	private Lugar lugar;
	private String extras;
}
