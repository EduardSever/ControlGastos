package com.educarte.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educarte.demo.interfaceService.ICategoriaService;
import com.educarte.demo.interfaces.ICategoria;
import com.educarte.demo.modelo.Categoria;
@Service
public class CategoriaService implements ICategoriaService {
	
	@Autowired
	private ICategoria data;

	@Override	
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return (List<Categoria>)data.findAll();
	}
	@Override
	public Optional<Categoria> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}
	@Override
	public int save(Categoria cate) {
		// TODO Auto-generated method stub
		int res=0;
		Categoria categoria=data.save(cate);
		if(!categoria.equals(null)){
			res=1;
		}
		return 0;
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub	
	}	
}
