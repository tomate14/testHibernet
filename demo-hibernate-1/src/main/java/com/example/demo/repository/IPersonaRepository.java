package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Persona;

@Repository
public interface IPersonaRepository extends CrudRepository<Persona, Integer>{
	
	public Optional<Persona> findById(Integer id);
	
	public List<Persona> findAll();
	
	public Persona save(Persona persona);
}
