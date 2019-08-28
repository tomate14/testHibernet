package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Establecimiento;

@Repository
public interface IEstablecimientoRepository extends CrudRepository<Establecimiento, Integer> {

	public Optional<Establecimiento> findById(Integer id);
	
	public List<Establecimiento> findAll();
	
	public Establecimiento save(Establecimiento establecimiento);
}
