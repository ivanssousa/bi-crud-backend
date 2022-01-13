package com.ucan.bicrud.backend.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ucan.bicrud.backend.entities.Localidade;

@Repository
public interface LocalidadeRepositorio extends CrudRepository<Localidade, Integer> {

	
	@Query("select loc from Localidade loc where loc.fkLocalidade = :fk_localidade")
	public List<Localidade> findByFkLocalidade( @Param("fk_localidade") Localidade localidade );
	
}
