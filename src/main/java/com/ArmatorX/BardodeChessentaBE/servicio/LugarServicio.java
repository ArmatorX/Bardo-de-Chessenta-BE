package com.ArmatorX.BardodeChessentaBE.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ArmatorX.BardodeChessentaBE.entidad.Lugar;
import com.ArmatorX.BardodeChessentaBE.repositorio.LugarRepositorio;

@Service
public class LugarServicio {
	@Autowired
	private LugarRepositorio repositorio;
	
	public List<Lugar> listarTodos() {
		return repositorio.findAll();
	}
}
