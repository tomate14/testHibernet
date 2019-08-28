package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Autor;

@Repository
public interface IAutorRepository extends CrudRepository<Autor, Integer> {

	public Optional<Autor> findById(Integer id);
	
	public List<Autor> findAll();
	
	public Autor save(Autor establecimiento);
}

