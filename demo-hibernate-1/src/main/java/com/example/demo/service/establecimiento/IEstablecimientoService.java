package com.example.demo.service.establecimiento;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Establecimiento;

public interface IEstablecimientoService {

	public List<Establecimiento> getEstablecimiento(Integer id);
	public List<Establecimiento> getAll();
	public Establecimiento save(Establecimiento establecimiento);
	
}
