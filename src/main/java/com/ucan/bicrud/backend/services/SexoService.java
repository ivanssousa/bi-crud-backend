package com.ucan.bicrud.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucan.bicrud.backend.entities.Sexo;
import com.ucan.bicrud.backend.repositorios.SexoRepositorio;
import com.ucan.bicrud.backend.services.interfaces.ISexoService;

@Service
public class SexoService implements ISexoService {
	
	@Autowired
	private SexoRepositorio repositorio;

	@Override
	public List<Sexo> findAll() {
		// TODO Auto-generated method stub
		return (List<Sexo>)this.repositorio.findAll();
	}

}
