package com.ucan.bicrud.backend.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ucan.bicrud.backend.entities.Localidade;
import com.ucan.bicrud.backend.services.interfaces.ILocalidadeService;

@RestController
@RequestMapping("localidade")
public class LocalidadeController {
		
	@Autowired
	private ILocalidadeService service;
	
	@GetMapping
	public List<Localidade> index()
	{
		return this.service.findAll();
	}
	
	
	@GetMapping(path = "findByLocalidade/{fkLocalidade}")
	public List<Localidade> findByLocalidade( @PathVariable String fkLocalidade )
	{
		Localidade localidade = this.service.findById( Integer.parseInt(fkLocalidade) );
		return this.service.findByFkLocalidade( localidade );
	}
}
