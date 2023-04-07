package com.modelo.servidor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelo.servidor.entity.Programador;
import com.modelo.servidor.services.ProgramadorServices;

@RestController
@RequestMapping("/programador")
public class ProgramdorController {
	@Autowired
	private ProgramadorServices servicio;
	
	@GetMapping("/listar")
	public List<Programador> listar(){
		return servicio.listAll();
	}
	@GetMapping("/consulta/{sueldo}")
	public List<Programador> consulta(@PathVariable("sueldo") double sue){
		return servicio.listAllBySueldo(sue);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Programador bean) {
		servicio.registrar(bean);
	}
}
