package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Establecimiento implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_establecimiento")
	private int idEstablecimiento;
	
	@NotBlank
	@Column(name="nombre")
	private String nombre;
	
	@NotBlank
	@Column(name="descripcion")
	private String descripcion;
	
	
	@Column(nullable = true,name="fecha_inicio" )
	private Date fecha_inicio;

	@ManyToMany(mappedBy = "establecimientos")
    private Set<Persona> personas = new HashSet<>();

	public int getIdEstablecimiento() {
		return idEstablecimiento;
	}


	public void setIdEstablecimiento(int idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}


	public Date getFecha_inicio() {
		return fecha_inicio;
	}


	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	
	
	
	
	
}
