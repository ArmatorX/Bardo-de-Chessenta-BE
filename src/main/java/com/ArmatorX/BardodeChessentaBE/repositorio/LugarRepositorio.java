package com.ArmatorX.BardodeChessentaBE.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArmatorX.BardodeChessentaBE.entidad.Lugar;

@Repository
public interface LugarRepositorio extends JpaRepository<Lugar, Integer>{

}
