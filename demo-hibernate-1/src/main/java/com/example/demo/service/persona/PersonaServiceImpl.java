package com.example.demo.service.persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DTODireccion;
import com.example.demo.dto.DTOEstablecimiento;
import com.example.demo.dto.DTOPersona;
import com.example.demo.entity.Establecimiento;
import com.example.demo.entity.Persona;
import com.example.demo.repository.IPersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepository daoPersona;
	
	@Override
	public List<DTOPersona> getPersona(Integer id) {
		// TODO Auto-generated method stub
		Optional<Persona> personaOptional = Optional.empty();
		personaOptional = this.daoPersona.findById(id);
		List<DTOPersona> personas = new ArrayList<DTOPersona>();
		if(personaOptional.isPresent()) {			
			DTODireccion direccion = new DTODireccion(personaOptional.get().getDireccion().getIdDireccion(), personaOptional.get().getDireccion().getNombrecalle(), personaOptional.get().getDireccion().getNumero());
			DTOPersona personDTO = new DTOPersona(personaOptional.get().getIdPersona(), personaOptional.get().getNombre(), personaOptional.get().getApellido(), personaOptional.get().getFecha_nacimiento(), direccion, this.generateDTOEstablecimientos(personaOptional.get()));
			personas.add(personDTO);
			return personas;
		}
		return personas;
	}

	@Override
	public List<DTOPersona> getAll() {
		List<Persona> personasResult = this.daoPersona.findAll();
		List<DTOPersona> personas = new ArrayList<DTOPersona>();
		for(Persona p:personasResult) {			
			DTODireccion direccionPersona = new DTODireccion(p.getDireccion().getIdDireccion(), p.getDireccion().getNombrecalle(),p.getDireccion().getNumero()  );
			DTOPersona persona = new DTOPersona(p.getIdPersona(),p.getNombre(),p.getApellido(),p.getFecha_nacimiento(), direccionPersona, this.generateDTOEstablecimientos(p));
			personas.add(persona);
		}
		// TODO Auto-generated method stub
		return personas;
	}
	
	private List<DTOEstablecimiento> generateDTOEstablecimientos(Persona persona){
		List<DTOEstablecimiento> establecimientos = new ArrayList<DTOEstablecimiento>();
		for(Iterator it = persona.getEstablecimientos().iterator(); it.hasNext();) {
			Establecimiento establecimiento = (Establecimiento)it.next();
			DTOEstablecimiento establecimientoDto = new DTOEstablecimiento(establecimiento.getIdEstablecimiento(), establecimiento.getNombre(), establecimiento.getDescripcion(), establecimiento.getFecha_inicio());
			establecimientos.add(establecimientoDto);
		}	
		return establecimientos;
	}

	@Override
	public Persona save(Persona persona) {
		return this.daoPersona.save(persona);
	}


	
}
