package com.bd.essalud.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bd.essalud.modelo.TblMedico;
import com.bd.essalud.repositorio.IMedicoRepositorio;

@Service
public class MedicoServicioImp implements IMedicoServicio{
	
	
	@Autowired
	private IMedicoRepositorio imedicorepositorio;

	@Override
	public void RegistrarMedico(TblMedico tblmedico) {
		
		imedicorepositorio.save(tblmedico);
		
	}

	@Override
	public void EliminarMedico(TblMedico tblmedico) {
		imedicorepositorio.delete(tblmedico);
		
	}

	@Override
	public List<TblMedico> ListadoMedico() {
		// TODO Auto-generated method stub
		return (List<TblMedico>) imedicorepositorio.findAll();
	}

	@Override
	public TblMedico buscarporId(Integer id) {
		return imedicorepositorio.findById(id).orElse(null);
	}

}
