package com.educarte.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.educarte.demo.interfaceService.IRelaGastoService;
import com.educarte.demo.interfaces.IRelaGasto;
import com.educarte.demo.modelo.RelaGasto;
@Service
public class RelaGastoService implements IRelaGastoService{
	@Autowired
	private IRelaGasto data;
	@Override
	public List<RelaGasto> listar() {
		// TODO Auto-generated method stub
		return (List<RelaGasto>)data.findAll();
	}
	@Override
	public Optional<RelaGasto> listarId(int id) {
		return data.findById(id);
	}
	@Override
	public int save(RelaGasto rg) {
		// TODO Auto-generated method stub
		int res=0;
		RelaGasto relagasto=data.save(rg);
		if(!relagasto.equals(null)){
			res=1;
		}
		return 0;
	}
	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}
}
