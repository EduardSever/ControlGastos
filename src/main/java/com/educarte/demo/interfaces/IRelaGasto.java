package com.educarte.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.educarte.demo.modelo.RelaGasto;

@Repository
public interface IRelaGasto extends CrudRepository<RelaGasto, Integer>{

}
