package com.ArmatorX.BardodeChessentaBE.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArmatorX.BardodeChessentaBE.entidad.EmocionEspecifica;
import com.ArmatorX.BardodeChessentaBE.entidad.EmocionGeneral;

@Repository
public interface EmocionGeneralRepositorio extends JpaRepository<EmocionGeneral, Integer>{

}
