package com.ucan.bicrud.backend.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.ucan.bicrud.backend.entities.Pessoa;


@Repository
public interface PessoaRepositorio extends CrudRepository<Pessoa, Integer> {

}
