package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Direccion implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_direccion")
	private int idDireccion;
	
	@Column(name = "nombre")
	private String nombre_calle;
	
	@Column(name = "altura")
	private int numero;
	
//	//Tomamos la persona pero es una referencia al objeto persona
//	//que contiene a direccion. Direccion no es dueño
	
	@OneToOne(mappedBy="direccion")
    @JsonManagedReference
	private Persona persona;

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getNombrecalle() {
		return nombre_calle;
	}

	public void setNombrecalle(String nombre_calle) {
		this.nombre_calle = nombre_calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
        this.persona = persona;
	}

	
	
	
}
