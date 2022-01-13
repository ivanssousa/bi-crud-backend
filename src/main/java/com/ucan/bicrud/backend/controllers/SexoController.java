package com.ucan.bicrud.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucan.bicrud.backend.entities.Sexo;
import com.ucan.bicrud.backend.services.interfaces.ISexoService;

import java.util.List;

@RestController
@RequestMapping("/sexo")
public class SexoController {

	@Autowired
	private ISexoService service;
	
	
	@GetMapping
	public List<Sexo> index()
	{
		return this.service.findAll();
	}
}
