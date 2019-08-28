package com.example.demo.dto;

import com.example.demo.entity.Libro;

public class DTOLibro extends Libro{


	public DTOLibro(int idLibro, String nombre) {
		super();
		this.idLibro = idLibro;
		this.nombre = nombre;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	
}
