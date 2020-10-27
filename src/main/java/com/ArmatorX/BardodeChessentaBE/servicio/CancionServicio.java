package com.ArmatorX.BardodeChessentaBE.servicio;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ArmatorX.BardodeChessentaBE.bot.MusicBot;
import com.ArmatorX.BardodeChessentaBE.entidad.Cancion;
import com.ArmatorX.BardodeChessentaBE.repositorio.CancionRepositorio;

import net.dv8tion.jda.api.exceptions.RateLimitedException;

@Service
public class CancionServicio {
	@Autowired
	private CancionRepositorio repositorio;
	private MusicBot bot;
	
	@PostConstruct
    public void init() {
		// Inicialización del bot.
		String token = "NjAxMTcyNTg2MzkwMzU1OTY4.XS-bmQ.X-d80c8td7Vj-g45OVXbp614v5o";
		
		this.bot = new MusicBot(token);
		
		System.out.println("[Bardo de Chessenta] INFO El bot se inicializó correctamente.");
    }
		
	/**
	 * Devuelve una lista con todas las canciones
	 * cargadas en la base de datos, paginada.
	 * @param pagina Parámetros de la página.
	 * @return Lista de canciones paginada.
	 */
	public Page<Cancion> listarTodas(Pageable pagina) {
		return repositorio.findAll(pagina);
	}
	
	public Optional<Cancion> buscarPorId(Integer id) {
		return repositorio.findById(id);
	}
	
	public Cancion crear(Cancion cancion) {
		if (cancion.getId() != null) {
			throw new RuntimeException("Error: El objeto tiene asignado un id o ya está guardado en la base de datos.");
		}
		
		return repositorio.save(cancion);
	}
	
	public Cancion actualizar(Cancion cancion) {
		if (cancion.getId() == null) {
			throw new RuntimeException("Error: El objeto no tiene asignado un id o no está guardado en la base de datos.");
		}
		
		return repositorio.save(cancion);
	}
	
	public void eliminar(Integer id) {
		repositorio.deleteById(id);
	}

	public void reproducir(Integer id) {		
		Optional<Cancion> cancion = buscarPorId(id);
		
		if (cancion.isPresent()) {
			if (this.bot.getGuild() != null) {
				this.bot.setUrlCancion(cancion.get().getLink());
				this.bot.reproducir();
			} else {
				System.out.println("[Bardo de Chessenta] ERROR El bot no está conectado a ningún canal.");
			}
		} else {
			System.out.println("[Bardo de Chessenta] ERROR No se encontró la canción solicitada.");
		}
	}
}
