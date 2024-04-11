package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="administradores")
public class Administrador {
	
	@Id
	@Column(name="user")
	private String user;
	
	@Column(name="password", length = 20,nullable = false)
	private String password;
	
	
	
	

	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public Administrador(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
