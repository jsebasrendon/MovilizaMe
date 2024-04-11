package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="automoviles")
public class Automovil {
	
	@Id
	@Column(name = "placa")
	private String placa;
	
	@Column(name = "puestos", length = 2, nullable = false)
	private Long puestos;
	
	@Column(name = "descripcion", length = 60)
	private String descripcion;

	
	
	

	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovil(String placa, Long puestos, String descripcion) {
		super();
		this.placa = placa;
		this.puestos = puestos;
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Long getPuestos() {
		return puestos;
	}

	public void setPuestos(Long puestos) {
		this.puestos = puestos;
	}
	
	
	
	

}
