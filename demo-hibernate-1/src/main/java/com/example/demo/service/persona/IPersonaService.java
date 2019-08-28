package com.example.demo.service.persona;
import java.util.List;
import java.util.Optional;

import com.example.demo.dto.DTOPersona;
import com.example.demo.entity.Persona;

public interface IPersonaService {
	
	public List<DTOPersona> getPersona(Integer id);
	public List<DTOPersona> getAll();
	public Persona save(Persona persona);
	
}
