package com.ArmatorX.BardodeChessentaBE.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ArmatorX.BardodeChessentaBE.entidad.Lugar;
import com.ArmatorX.BardodeChessentaBE.repositorio.LugarRepositorio;

@Service
public class LugarServicio {
	@Autowired
	private LugarRepositorio repositorio;
	
	public Page<Lugar> listarTodos(Pageable pagina) {
		return repositorio.findAll(pagina);
	}
}
