package com.ArmatorX.BardodeChessentaBE.controlador;

import java.util.Optional;

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
import com.ArmatorX.BardodeChessentaBE.entidad.EmocionEspecifica;
import com.ArmatorX.BardodeChessentaBE.entidad.EmocionGeneral;
import com.ArmatorX.BardodeChessentaBE.servicio.CancionServicio;


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
	
	@RequestMapping(params = {"busqueda"})
	public Page<Cancion> buscarPorNombreUOrigenOExtras(String busqueda, Pageable pagina) {
		return servicio.buscarPorNombreUOrigenOExtras(busqueda, pagina);
	}
	
	@RequestMapping(params = {"emocionEspecifica"}) 
	public Page<Cancion> buscarPorEmocionEspecifica(Integer emocionEspecifica, Pageable pagina) {
		return servicio.buscarPorEmocionEspecifica(emocionEspecifica, pagina);
	}
	
	@RequestMapping(params = {"emocionGeneral"})
	public Page<Cancion> buscarPorEmocionGeneral(Integer emocionGeneral, Pageable pagina) {
		return servicio.buscarPorEmocionGeneral(emocionGeneral, pagina);
	}
	
	@RequestMapping(params = {"busqueda", "emocionEspecifica"})
	public Page<Cancion> buscarPorNombreUOrigenOExtrasYEmocionEspecifica(String busqueda, Integer emocionEspecifica, Pageable pagina) {
		return servicio.buscarPorNombreUOrigenOExtrasYEmocionEspecifica(busqueda, emocionEspecifica, pagina);
	}
	
	@RequestMapping(params = {"busqueda", "emocionGeneral"})
	public Page<Cancion> buscarPorNombreUOrigenOExtrasYEmocionGeneral(String busqueda, Integer emocionGeneral, Pageable pagina) {
		return servicio.buscarPorNombreUOrigenOExtrasYEmocionGeneral(busqueda, emocionGeneral, pagina);
	}
}
