package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

@Repository
public interface RepositorioAutomovil extends JpaRepository <Automovil, String> {

}
