package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositorio.RepositorioAutomovil;

@RestController
@RequestMapping("/ver/auto/")
public class AutomovilControlador {
	
	@Autowired
	private RepositorioAutomovil repositorio;

}
