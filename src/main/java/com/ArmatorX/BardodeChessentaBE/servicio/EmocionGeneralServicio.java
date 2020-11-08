package com.ArmatorX.BardodeChessentaBE.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ArmatorX.BardodeChessentaBE.entidad.EmocionGeneral;
import com.ArmatorX.BardodeChessentaBE.repositorio.EmocionGeneralRepositorio;


@Service
public class EmocionGeneralServicio {
	@Autowired
	private EmocionGeneralRepositorio repositorio;
	
	public List<EmocionGeneral> listarTodas() {
		return repositorio.findAll();
	}
}
