package com.modelo.servidor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.servidor.entity.Programador;
import com.modelo.servidor.repository.ProgramadorRepository;

@Service
public class ProgramadorServices {
	@Autowired
	private ProgramadorRepository repo;
	
	public void registrar(Programador bean) {
		repo.save(bean);
	}
	public List<Programador> listAll(){
		return repo.findAll();
	}
	public List<Programador> listAllBySueldo(double sue){
		return repo.listAllBySueldo(sue);
	}
	
}
