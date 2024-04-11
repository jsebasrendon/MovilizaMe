package com.example.demo.modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column(name="cedula")
	private Long cedula;
	
	@Column(name="nombres", length = 35,nullable = false)
	private String nombres;
	
	@Column(name="apelllidos", length = 35,nullable = false)
	private String apellidos;
	
	@ManyToOne()
	@JoinColumn(name ="user", referencedColumnName="user")
	private Administrador adminitrador;

	@Column(name="telefono", length = 15,nullable = false)
	private Long telefono;
	
	@Column(name="fecha_nacimiento",nullable = false)
	private Date fecha_nacimiento;

	
	
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long cedula, String nombres, String apellidos, Administrador adminitrador, Long telefono,
			Date fecha_nacimiento) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.adminitrador = adminitrador;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Administrador getAdminitrador() {
		return adminitrador;
	}

	public void setAdminitrador(Administrador adminitrador) {
		this.adminitrador = adminitrador;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	
	
}