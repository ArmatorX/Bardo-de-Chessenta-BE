package com.ArmatorX.BardodeChessentaBE.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	public Page<Lugar> listarTodos(Pageable pagina) {
		return servicio.listarTodos(pagina);
	}
}
