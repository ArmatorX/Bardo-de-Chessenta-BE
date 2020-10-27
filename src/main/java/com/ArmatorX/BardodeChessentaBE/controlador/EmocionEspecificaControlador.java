package com.ArmatorX.BardodeChessentaBE.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ArmatorX.BardodeChessentaBE.entidad.EmocionEspecifica;
import com.ArmatorX.BardodeChessentaBE.servicio.EmocionEspecificaServicio;

@RestController
@RequestMapping("/emociones-especificas/")
@CrossOrigin(origins = "*")
public class EmocionEspecificaControlador {
	@Autowired
	private EmocionEspecificaServicio servicio;
	
	@GetMapping
	public Page<EmocionEspecifica> listarTodas(Pageable pagina) {
		return servicio.listarTodas(pagina);
	}
}
