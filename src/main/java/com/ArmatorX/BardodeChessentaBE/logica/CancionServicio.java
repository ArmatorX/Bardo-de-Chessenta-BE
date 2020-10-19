package com.ArmatorX.BardodeChessentaBE.logica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ArmatorX.BardodeChessentaBE.modelo.Cancion;
import com.ArmatorX.BardodeChessentaBE.persistencia.CancionRepositorio;

@Service
public class CancionServicio {
	@Autowired
	private CancionRepositorio repositorio;
	
	/**
	 * Devuelve una lista con todas las canciones 
	 * cargadas en la base de datos.
	 * @return Lista de canciones.
	 */
	public List<Cancion> listarTodas() {
		return repositorio.findAll();
	}
	
	/**
	 * Devuelve una lista con todas las canciones
	 * cargadas en la base de datos, paginada.
	 * @param pagina Parámetros de la página.
	 * @return Lista de canciones paginada.
	 */
	public Page<Cancion> listarPaginadas(Pageable pagina) {
		return repositorio.findAll(pagina);
	}
}
