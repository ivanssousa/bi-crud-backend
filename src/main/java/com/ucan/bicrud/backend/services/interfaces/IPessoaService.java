package com.ucan.bicrud.backend.services.interfaces;

import java.util.List;


import com.ucan.bicrud.backend.entities.Pessoa;

public interface IPessoaService {
	
	List<Pessoa> findAll();
	Pessoa criar( Pessoa nova );
	Pessoa deletar( Integer pk );
	Pessoa actualizar( Pessoa pessoa );
	
}
