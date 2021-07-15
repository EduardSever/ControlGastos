package com.educarte.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.educarte.demo.modelo.Categoria;


public interface ICategoriaService {
	
	public List<Categoria> listar();

	public Optional<Categoria> listarId(int id);

	public int save(Categoria cate);

	public void delete(int id);
}
