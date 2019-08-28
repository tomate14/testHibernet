package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DTOAutor;
import com.example.demo.entity.Autor;
import com.example.demo.entity.Establecimiento;
import com.example.demo.service.autor.IAutorService;

@RestController
public class AutorController {

	@Autowired
	private IAutorService serviceAutor;
	
	@RequestMapping(value="/autor",method=RequestMethod.GET)
	public List<DTOAutor> getAllPersonas(@RequestParam(name = "id") int id) {
		if(id != 0) {			
			return this.serviceAutor.getAutor(id);
		}else {
			return this.serviceAutor.getAll();			
		}
	}
	
	
	@RequestMapping(value="/autor",method=RequestMethod.POST)
	public DTOAutor savePersona(@Valid @RequestBody Autor autor) {
		return this.serviceAutor.save(autor);
	}
	
	
	
}
