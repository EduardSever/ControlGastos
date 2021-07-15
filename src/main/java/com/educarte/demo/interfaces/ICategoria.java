package com.educarte.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.educarte.demo.modelo.Categoria;

@Repository
public interface ICategoria extends CrudRepository<Categoria, Integer>{

}
