package com.ucan.bicrud.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ucan.bicrud.backend.entities.Pessoa;
import com.ucan.bicrud.backend.repositorios.PessoaRepositorio;
import com.ucan.bicrud.backend.services.interfaces.IPessoaService;


@Service
public class PessoaService implements IPessoaService {

	@Autowired
	private PessoaRepositorio repositorio;
	
	@Override
	public List<Pessoa> findAll() {
		// TODO Auto-generated method stub
		return (List<Pessoa>)this.repositorio.findAll();
	}

	@Override
	public Pessoa criar(Pessoa nova) {
		// TODO Auto-generated method stub
		return this.repositorio.save(nova);
	}

	@Override
	public Pessoa deletar(Integer pk) {
		// TODO Auto-generated method stub
		Pessoa pessoa = this.repositorio.findById(pk).get();
		this.repositorio.delete(pessoa);
		return pessoa;
	}

	@Override
	public Pessoa actualizar( Pessoa pessoa ) {
		// TODO Auto-generated method stub
		this.repositorio.save(pessoa);
		return this.repositorio.findById(pessoa.getPkPessoa()).get();
	}

}
