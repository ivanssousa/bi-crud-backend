package com.ucan.bicrud.backend.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ucan.bicrud.backend.entities.Pessoa;
import com.ucan.bicrud.backend.services.interfaces.IPessoaService;

@RestController
@RequestMapping("/pessoa" )
public class PessoaController 
{
	@Autowired
	private IPessoaService service;
	
	@GetMapping
	public List<Pessoa> index()
	{
		return this.service.findAll();
	}
		
	@PostMapping
	public Pessoa criar( @RequestBody Pessoa nova )
	{
		return this.service.criar(nova);
	}

	@DeleteMapping("/{pkPessoa}")
	public Pessoa deletar( @PathVariable String pkPessoa )
	{
		return this.service.deletar( Integer.parseInt(pkPessoa) );
	}
	
	@PutMapping
	public Pessoa actualizar( @RequestBody Pessoa pessoa )
	{
		return this.service.actualizar(pessoa);
	}
}
