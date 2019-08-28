package com.example.demo.service.autor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DTOAutor;
import com.example.demo.dto.DTODireccion;
import com.example.demo.dto.DTOLibro;
import com.example.demo.dto.DTOPersona;
import com.example.demo.entity.Autor;
import com.example.demo.entity.Establecimiento;
import com.example.demo.entity.Libro;
import com.example.demo.entity.Persona;
import com.example.demo.repository.IAutorRepository;

@Service
public class AutorServiceImpl implements IAutorService{

	@Autowired
	private IAutorRepository daoAutor;
	
	@Override
	public List<DTOAutor> getAutor(Integer id) {
		// TODO Auto-generated method stub
		Optional<Autor> autorOptional = Optional.empty();
		autorOptional = this.daoAutor.findById(id);
		List<DTOAutor> autores = new ArrayList<DTOAutor>();
		List<DTOLibro> libros = new ArrayList<DTOLibro>();
		if(autorOptional.isPresent()) {
			for(Libro lib: autorOptional.get().getLibros()) {
				DTOLibro libro = new DTOLibro(lib.getIdLibro(), lib.getNombre());
				libros.add(libro);
			}
			DTOAutor autorDTO = new DTOAutor(autorOptional.get().getIdAutor(), autorOptional.get().getNombre(), autorOptional.get().getNacionalidad(), libros);
			autores.add(autorDTO);
			return autores;
		}
		return autores;
	}

	@Override
	public List<DTOAutor> getAll() {
		List<Autor> autorResult = this.daoAutor.findAll();
		List<DTOAutor> autores = new ArrayList<DTOAutor>();
		for(Autor p:autorResult) {
			List<DTOLibro> libros = new ArrayList<DTOLibro>();
			for(Libro lib: p.getLibros()) {
				DTOLibro libro = new DTOLibro(lib.getIdLibro(), lib.getNombre());
				libros.add(libro);
			}
			DTOAutor autorDTO = new DTOAutor(p.getIdAutor(), p.getNombre(), p.getNacionalidad(), libros);
			autores.add(autorDTO);
		}
		return autores;
	}


	@Override
	public DTOAutor save(Autor autor) {
		for(Libro lib: autor.getLibros()) {
			lib.setAutor(autor);
		}
		Autor a = this.daoAutor.save(autor);
		List<DTOLibro> libros = new ArrayList<DTOLibro>();
		for(Libro lib: a.getLibros()) {
			libros.add(new DTOLibro(lib.getIdLibro(), lib.getNombre()));
		}
		return new DTOAutor(a.getIdAutor(), a.getNombre(), a.getNacionalidad(), libros);
	}

}
