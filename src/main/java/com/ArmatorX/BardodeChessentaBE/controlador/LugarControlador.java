package com.ArmatorX.BardodeChessentaBE.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArmatorX.BardodeChessentaBE.entidad.Lugar;
import com.ArmatorX.BardodeChessentaBE.servicio.LugarServicio;

@RestController
@RequestMapping("/lugares/")
@CrossOrigin(origins = "*")
public class LugarControlador {
	@Autowired
	private LugarServicio servicio;
	
	@GetMapping
	public List<Lugar> listarTodos() {
		return servicio.listarTodos();
	}
}
