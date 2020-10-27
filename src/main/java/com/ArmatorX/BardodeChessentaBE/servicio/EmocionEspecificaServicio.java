package com.ArmatorX.BardodeChessentaBE.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ArmatorX.BardodeChessentaBE.entidad.EmocionEspecifica;
import com.ArmatorX.BardodeChessentaBE.repositorio.EmocionEspecificaRepositorio;

@Service
public class EmocionEspecificaServicio {
	@Autowired
	private EmocionEspecificaRepositorio repositorio;
	
	public Page<EmocionEspecifica> listarTodas(Pageable pagina) {
		return repositorio.findAll(pagina);
	}
}
