package com.ArmatorX.BardodeChessentaBE.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArmatorX.BardodeChessentaBE.entidad.Cancion;

@Repository
public interface CancionRepositorio extends JpaRepository<Cancion, Integer>{

}
