package com.ArmatorX.BardodeChessentaBE.repositorio;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ArmatorX.BardodeChessentaBE.entidad.Cancion;
import com.ArmatorX.BardodeChessentaBE.entidad.EmocionEspecifica;
import com.ArmatorX.BardodeChessentaBE.entidad.EmocionGeneral;

@Repository
public interface CancionRepositorio extends JpaRepository<Cancion, Integer>{
	Page<Cancion> findByNombreContainingOrOrigenContainingOrExtrasContainingAllIgnoreCase(String nombre, String origen, String extras, Pageable pagina);
	
	Page<Cancion> findByEmocion_id(Integer emocion, Pageable pagina);
	
	@Query("select c from EmocionGeneral eg "
			+ "join eg.emociones ee "
			+ "join Cancion c on c.emocion = ee "
			+ "where eg.id = ?1")
	Page<Cancion> findByEmocionGeneral_id(Integer emocionGeneral, Pageable pagina);
	
	@Query("select c from Cancion c "
			+ "join c.emocion ee "
			+ "where (upper(c.nombre) like upper(concat('%', ?1, '%')) or "
			+ "upper(c.origen) like upper(concat('%', ?1, '%')) or "
			+ "upper(c.extras) like upper(concat('%', ?1, '%'))) and "
			+ "c.emocion.id = ?2")
	Page<Cancion> findByBusquedaContainingIgnoreCaseAndEmocionEspecifica_id(String busqueda, Integer emocionEspecifica, Pageable pagina);
	
	@Query("select c from EmocionGeneral eg "
			+ "join eg.emociones ee "
			+ "join Cancion c on c.emocion = ee "
			+ "where (upper(c.nombre) like upper(concat('%', ?1, '%')) or "
			+ "upper(c.origen) like upper(concat('%', ?1, '%')) or "
			+ "upper(c.extras) like upper(concat('%', ?1, '%'))) and "
			+ "eg.id = ?2")
	Page<Cancion> findByBusquedaContainingIgnoreCaseAndEmocionGeneral_id(String busqueda, Integer emocionGeneral, Pageable pagina);
}
