package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositorio.RepositorioReserva;

@RestController
@RequestMapping("/ver/rese/")
public class ReservaControlador {
	
	@Autowired
	private RepositorioReserva repositorio;

}
