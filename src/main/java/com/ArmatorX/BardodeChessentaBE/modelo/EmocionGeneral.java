package com.ArmatorX.BardodeChessentaBE.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class EmocionGeneral {
	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	@OneToMany
	private Set<EmocionEspecifica> emociones;
}
