package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Time;
import java.util.Date;

@Entity(name= "disponibilidades")
public class Disponibilidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_disponibilidad;
	
	@ManyToOne()
	@JoinColumn(name ="placa", referencedColumnName="placa")
	private Automovil automoviles;
	
	@Column(name="fecha", nullable = false)
	private Date fecha;
	
	@Column(name="puestosDisponi",length= 2, nullable = false)
	private Long puestosDisponi;
	
	@Column(name="horaSalida", nullable = false)
	private Time horaSalida;
	
	
	

	public Disponibilidad() {
		// TODO Auto-generated constructor stub
	}

	public Disponibilidad(Long id_disponibilidad, Automovil automoviles, Date fecha, Long puestosDisponi,
			Time horaSalida) {
		super();
		this.id_disponibilidad = id_disponibilidad;
		this.automoviles = automoviles;
		this.fecha = fecha;
		this.puestosDisponi = puestosDisponi;
		this.horaSalida = horaSalida;
	}

	public Long getId_disponibilidad() {
		return id_disponibilidad;
	}

	public void setId_disponibilidad(Long id_disponibilidad) {
		this.id_disponibilidad = id_disponibilidad;
	}

	public Automovil getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(Automovil automoviles) {
		this.automoviles = automoviles;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getPuestosDisponi() {
		return puestosDisponi;
	}

	public void setPuestosDisponi(Long puestosDisponi) {
		this.puestosDisponi = puestosDisponi;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}

	
	
	

}
