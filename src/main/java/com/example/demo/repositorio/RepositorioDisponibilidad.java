package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Disponibilidad;

@Repository
public interface RepositorioDisponibilidad extends JpaRepository <Disponibilidad, Long>{

}
