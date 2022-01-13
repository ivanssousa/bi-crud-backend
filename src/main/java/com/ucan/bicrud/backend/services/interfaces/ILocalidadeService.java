package com.ucan.bicrud.backend.services.interfaces;

import java.util.List;

import com.ucan.bicrud.backend.entities.Localidade;

public interface ILocalidadeService {
	List<Localidade> findAll();
	Localidade findById( Integer localidade );
	List<Localidade> findByFkLocalidade( Localidade localidade );
}
