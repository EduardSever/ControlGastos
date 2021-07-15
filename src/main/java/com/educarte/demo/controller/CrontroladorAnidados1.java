package com.educarte.demo.controller;
import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educarte.demo.interfaceService.ICategoriaService;
import com.educarte.demo.interfaceService.IRelaGastoService;
import com.educarte.demo.interfaces.ICategoria;
import com.educarte.demo.interfaces.IRelaGasto;
import com.educarte.demo.modelo.Categoria;
import com.educarte.demo.modelo.RelaGasto;


@RestController
@RequestMapping("/anidados")
public class CrontroladorAnidados1 {
	@Autowired
	IRelaGasto irelaGasto;
	@RequestMapping("/lista")
	public List<RelaGasto>lista(){
		List<RelaGasto> lista= (List<RelaGasto>) irelaGasto.findAll();
		return lista;
	}
}