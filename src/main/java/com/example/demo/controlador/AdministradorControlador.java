package com.example.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Reserva;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.RepositorioAdministrador;
import com.example.demo.repositorio.RepositorioReserva;
import com.example.demo.repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/ver/admin/")
public class AdministradorControlador {
	
	
	@Autowired
	private RepositorioAdministrador repositorio;
	private RepositorioReserva repositorioReserva;
	private RepositorioUsuario repositorioUsuario;
	
@GetMapping("/listarReservas")
public List<Reserva> listarReserva(){
	return this.repositorioReserva.findAll();
}



	
	
	
	
}
