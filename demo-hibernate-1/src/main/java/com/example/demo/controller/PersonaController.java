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

import com.example.demo.dto.DTOPersona;
import com.example.demo.entity.Persona;
import com.example.demo.service.persona.IPersonaService;

@RestController
public class PersonaController {

	@Autowired
	private IPersonaService servicePersona;
	
//	@RequestMapping(value="/test",method=RequestMethod.GET)
//	public DTOPersona getDemo() {
//		DTOPersona person = this.servicePersona.getPersona(2); 
//		return person;
//	}
	
	@RequestMapping(value="/persona",method=RequestMethod.GET)
	public List<DTOPersona> getAllPersonas(@RequestParam(name = "id") int id) {
		if(id != 0) {		
			return this.servicePersona.getPersona(id);
		}else {
			return this.servicePersona.getAll();			
		}
		
	}
	
	@RequestMapping(value="/persona",method=RequestMethod.POST)
	public Persona savePersona(@Valid @RequestBody Persona persona) {
		return this.servicePersona.save(persona);
	}
}
