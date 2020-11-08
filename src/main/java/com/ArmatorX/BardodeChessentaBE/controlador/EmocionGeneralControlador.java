package com.ArmatorX.BardodeChessentaBE.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArmatorX.BardodeChessentaBE.entidad.EmocionGeneral;
import com.ArmatorX.BardodeChessentaBE.servicio.EmocionGeneralServicio;

@RestController
@RequestMapping("/emociones/")
@CrossOrigin(origins = "*")
public class EmocionGeneralControlador {
	@Autowired
	private EmocionGeneralServicio servicio;
	
	@GetMapping
	public List<EmocionGeneral> listarTodas() {
		return servicio.listarTodas();
	}
}
