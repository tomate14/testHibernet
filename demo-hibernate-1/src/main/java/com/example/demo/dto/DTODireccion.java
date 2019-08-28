package com.example.demo.dto;

public class DTODireccion {

	private int idDireccion;
	
	private String nombre_calle;
	
	private int numero;
	
	public DTODireccion(int idDireccion, String nombre_calle, int numero) {
		super();
		this.idDireccion = idDireccion;
		this.nombre_calle = nombre_calle;
		this.numero = numero;
	}

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getNombre_calle() {
		return nombre_calle;
	}

	public void setNombre_calle(String nombre_calle) {
		this.nombre_calle = nombre_calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	

}
