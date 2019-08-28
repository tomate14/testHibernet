package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Establecimiento;
import com.example.demo.entity.Persona;
import com.example.demo.service.establecimiento.IEstablecimientoService;
import com.example.demo.service.persona.IPersonaService;

@RestController
public class EstablecimientoController {

	
	@Autowired
	private IEstablecimientoService serviceEstablecimiento;
		
	@RequestMapping(value="/establecimiento",method=RequestMethod.GET)
	public List<Establecimiento> getAllPersonas(@RequestParam(name = "id") int id) {
		if(id != 0) {			
			return this.serviceEstablecimiento.getEstablecimiento(id);
		}else {
			return this.serviceEstablecimiento.getAll();			
		}
	}
	
	@RequestMapping(value="/establecimiento",method=RequestMethod.POST)
	public Establecimiento savePersona(@Valid @RequestBody Establecimiento establecimiento) {
		return this.serviceEstablecimiento.save(establecimiento);
	}
}
