package com.example.demo.modelo;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name= "reservas")
public class Reserva {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_reservas;
	
	@ManyToOne()
	@JoinColumn(name ="cedula", referencedColumnName="cedula")
	private Usuario usuarios;
	
	@ManyToOne()
	@JoinColumn(name ="id_disponibilidad", referencedColumnName="id_disponibilidad")
	private Disponibilidad disponibilidades;
	
	@Column(name="puestoAsignado",length=2, nullable = false)
	private Long puestoAsignado;
	
	@Column(name="precio",length=10, nullable = false)
	private Long precio;
	
	@Column(name="estadoReserva",length=10, nullable = false)
	private String estadoReserva;
	
	
	

	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(Long id_reservas, Usuario usuarios, Disponibilidad disponibilidades, Long puestoAsignado,
			Long precio, String estadoReserva) {
		super();
		this.id_reservas = id_reservas;
		this.usuarios = usuarios;
		this.disponibilidades = disponibilidades;
		this.puestoAsignado = puestoAsignado;
		this.precio = precio;
		this.estadoReserva = estadoReserva;
	}

	public Long getId_reservas() {
		return id_reservas;
	}

	public void setId_reservas(Long id_reservas) {
		this.id_reservas = id_reservas;
	}

	public Usuario getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public Disponibilidad getDisponibilidades() {
		return disponibilidades;
	}

	public void setDisponibilidades(Disponibilidad disponibilidades) {
		this.disponibilidades = disponibilidades;
	}

	public Long getPuestoAsignado() {
		return puestoAsignado;
	}

	public void setPuestoAsignado(Long puestoAsignado) {
		this.puestoAsignado = puestoAsignado;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
