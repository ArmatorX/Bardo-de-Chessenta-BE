package com.ArmatorX.BardodeChessentaBE.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArmatorX.BardodeChessentaBE.logica.CancionServicio;
import com.ArmatorX.BardodeChessentaBE.modelo.Cancion;

@RestController
@RequestMapping("/canciones/")
@CrossOrigin(origins = "*")
public class CancionControlador {
	@Autowired
	private CancionServicio servicio;
	
	@GetMapping
	/**
	 * Devuelve una lista con todas las canciones 
	 * cargadas en la base de datos.
	 * @return Lista de canciones.
	 */
	public List<Cancion> listarTodas() {
		return servicio.listarTodas();
	}
	
	@GetMapping
	/**
	 * Devuelve una lista con todas las canciones
	 * cargadas en la base de datos, paginada.
	 * @param pagina Parámetros de la página.
	 * @return Lista de canciones paginada.
	 */
	public Page<Cancion> listarPaginadas(Pageable pagina) {
		return servicio.listarPaginadas(pagina);
	}
}
