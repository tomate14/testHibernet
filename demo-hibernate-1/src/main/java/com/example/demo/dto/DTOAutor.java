package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Libro;

public class DTOAutor {


	private int idAutor;
	private String nombre;
	private String nacionalidad;	
	private List<DTOLibro> libros = new ArrayList<DTOLibro>();
	

	public DTOAutor(int idAutor, String nombre, String nacionalidad, List<DTOLibro> libros) {
		super();
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}
	


	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public List<DTOLibro> getLibros() {
		return libros;
	}
	public void setLibros(List<DTOLibro> libros) {
		this.libros = libros;
	}
	
	
}
