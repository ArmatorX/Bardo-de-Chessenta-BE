package com.ArmatorX.BardodeChessentaBE.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArmatorX.BardodeChessentaBE.entidad.EmocionEspecifica;

@Repository
public interface EmocionEspecificaRepositorio extends JpaRepository<EmocionEspecifica, Integer>{

}
