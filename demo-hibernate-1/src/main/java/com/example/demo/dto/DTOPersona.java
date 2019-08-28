package com.example.demo.dto;

import java.sql.Date;
import java.util.List;

import com.example.demo.entity.Direccion;

public class DTOPersona {

	private int idPersona;
	
	private String nombre;
	
	private String apellido;
	
	private Date fecha_nacimiento;
	
	private DTODireccion direccion;
	
	private List<DTOEstablecimiento> establecimientos;

	
	public DTOPersona(int idPersona, String nombre, String apellido, Date fecha_nacimiento, DTODireccion direccion, List<DTOEstablecimiento> establecimientos) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion = direccion;
		this.establecimientos = establecimientos;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public DTODireccion getDireccion() {
		return direccion;
	}

	public void setDireccion(DTODireccion direccion) {
		this.direccion = direccion;
	}

	public List<DTOEstablecimiento> getEstablecimientos() {
		return establecimientos;
	}

	public void setEstablecimientos(List<DTOEstablecimiento> establecimientos) {
		this.establecimientos = establecimientos;
	}
	
	
	
	
}
