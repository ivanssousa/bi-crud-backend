package com.ucan.bicrud.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucan.bicrud.backend.entities.Localidade;
import com.ucan.bicrud.backend.repositorios.LocalidadeRepositorio;
import com.ucan.bicrud.backend.services.interfaces.ILocalidadeService;

@Service
public class LocalidadeService implements ILocalidadeService {

	@Autowired
	private LocalidadeRepositorio repositorio;

	@Override
	public List<Localidade> findAll() {
		// TODO Auto-generated method stub
		return (List<Localidade>)this.repositorio.findAll();
	}

	
	@Override
	public List<Localidade> findByFkLocalidade( Localidade localidade ) {
		// TODO Auto-generated method stub
		return this.repositorio.findByFkLocalidade( localidade );
	}


	@Override
	public Localidade findById(Integer pkLocalidade) {
		// TODO Auto-generated method stub
		return this.repositorio.findById( pkLocalidade ).get();
	}
 
}
