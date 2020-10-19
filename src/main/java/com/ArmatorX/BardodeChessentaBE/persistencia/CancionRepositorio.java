package com.ArmatorX.BardodeChessentaBE.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArmatorX.BardodeChessentaBE.modelo.Cancion;

@Repository
public interface CancionRepositorio extends JpaRepository<Cancion, Integer>{

}
