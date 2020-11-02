package com.ArmatorX.BardodeChessentaBE.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArmatorX.BardodeChessentaBE.entidad.EmocionEspecifica;
import com.ArmatorX.BardodeChessentaBE.entidad.EmocionGeneral;
import com.ArmatorX.BardodeChessentaBE.servicio.EmocionGeneralServicio;

@RestController
@RequestMapping("/emociones/")
@CrossOrigin(origins = "*")
public class EmocionGeneralControlador {
	@Autowired
	private EmocionGeneralServicio servicio;
	
	@GetMapping
	public Page<EmocionGeneral> listarTodas(Pageable pagina) {
		return servicio.listarTodas(pagina);
	}
}
