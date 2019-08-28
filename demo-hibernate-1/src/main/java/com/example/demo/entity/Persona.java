package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Persona implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_persona")
	private int idPersona;
	
	@NotBlank
	@Column(name="nombre")
	private String nombre;
	
	@NotBlank
	@Column(name="apellido")
	private String apellido;
	
	@Column(nullable = true,name="fecha_nacimiento" )
	private Date fecha_nacimiento;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "id_direccion")
	@JsonBackReference
	private Direccion direccion;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
		name = "persona_establecimiento",
		joinColumns = { @JoinColumn(name = "id_persona") }, 
		inverseJoinColumns = { @JoinColumn(name = "id_establecimiento") }
	)
	private Set<Establecimiento> establecimientos = new HashSet<Establecimiento>();
	
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
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Set<Establecimiento> getEstablecimientos() {
		return establecimientos;
	}

	public void setEstablecimientos(Set<Establecimiento> establecimientos) {
		this.establecimientos = establecimientos;
	}
	
	
	
	
}
