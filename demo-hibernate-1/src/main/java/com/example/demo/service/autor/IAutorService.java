package com.example.demo.service.autor;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.DTOAutor;
import com.example.demo.entity.Autor;

@Repository
public interface IAutorService {

	public List<DTOAutor> getAutor(Integer id);
	public List<DTOAutor> getAll();
	public DTOAutor save(Autor establecimiento);
}
