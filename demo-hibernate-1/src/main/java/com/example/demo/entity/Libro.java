package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_libro")
	protected int idLibro;
	
	
	@Column(name="nombre")
	protected String nombre;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_autor")
	private Autor autor;

	public Libro() {
		super();
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


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	
}
