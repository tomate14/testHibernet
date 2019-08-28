package com.example.demo.dto;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

import com.example.demo.entity.Persona;

public class DTOEstablecimiento {

	private int idEstablecimiento;
	private String nombre;
	private String descripcion;	
	private Date fecha_inicio;	
	
	public DTOEstablecimiento(int idEstablecimiento, String nombre, String descripcion, Date fecha_inicio) {
		super();
		this.idEstablecimiento = idEstablecimiento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha_inicio = fecha_inicio;
	}
	
	public int getIdEstablecimiento() {
		return idEstablecimiento;
	}
	public void setIdEstablecimiento(int idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
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
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	
	
}
