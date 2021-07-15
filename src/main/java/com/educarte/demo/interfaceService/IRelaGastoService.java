package com.educarte.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.educarte.demo.modelo.RelaGasto;

public interface IRelaGastoService {

	public List<RelaGasto> listar();

	public Optional<RelaGasto> listarId(int id);

	public int save(RelaGasto rg);

	public void delete(int id);
}
