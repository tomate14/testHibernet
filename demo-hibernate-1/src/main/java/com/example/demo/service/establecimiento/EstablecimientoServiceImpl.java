package com.example.demo.service.establecimiento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Establecimiento;
import com.example.demo.repository.IEstablecimientoRepository;

@Service
public class EstablecimientoServiceImpl implements IEstablecimientoService{

	@Autowired
	private IEstablecimientoRepository daoEstablecimiento;
	
	@Override
	public List<Establecimiento> getEstablecimiento(Integer id) {
		// TODO Auto-generated method stub
		Optional<Establecimiento> establecimiento = Optional.empty();
		establecimiento = this.daoEstablecimiento.findById(id);
		List<Establecimiento> establecimientos = new ArrayList<Establecimiento>();
		if(establecimiento.isPresent()) {
			establecimientos.add(establecimiento.get());			
		}
		return establecimientos;
	}

	@Override
	public List<Establecimiento> getAll() {
		// TODO Auto-generated method stub
		return this.daoEstablecimiento.findAll();
	}

	@Override
	public Establecimiento save(Establecimiento establecimiento) {
		// TODO Auto-generated method stub
		return this.daoEstablecimiento.save(establecimiento);
	}

}
