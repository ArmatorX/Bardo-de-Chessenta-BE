package com.ArmatorX.BardodeChessentaBE.controlador;

import java.util.Optional;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ArmatorX.BardodeChessentaBE.entidad.Cancion;
import com.ArmatorX.BardodeChessentaBE.servicio.CancionServicio;

import net.dv8tion.jda.api.exceptions.RateLimitedException;

@RestController
@RequestMapping("/canciones/")
@CrossOrigin(origins = "*")
public class CancionControlador {
	@Autowired
	private CancionServicio servicio;
		
	@GetMapping
	/**
	 * Devuelve una lista con todas las canciones
	 * cargadas en la base de datos, paginada.
	 * @param pagina Parámetros de la página.
	 * @return Lista de canciones paginada.
	 */
	public Page<Cancion> listarTodas(Pageable pagina) {
		return servicio.listarTodas(pagina);
	}
	
	@GetMapping(params =  {"id"})
	public Optional<Cancion> buscarPorId(Integer id) {
		return servicio.buscarPorId(id);
	}
	
	@PostMapping
	public Cancion crear(@RequestBody Cancion cancion) {
		return servicio.crear(cancion);
	}
	
	@PutMapping
	public Cancion actualizar(@RequestBody Cancion cancion) {
		return servicio.actualizar(cancion);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void eliminar(@PathVariable(name = "id") Integer id) {
		servicio.eliminar(id);
	}
	
	@RequestMapping(value = "/reproducir/{id}", method = RequestMethod.GET)
	public void reproducir(@PathVariable(name = "id") Integer id) {
		servicio.reproducir(id);
	}
}
