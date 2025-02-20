package com.bd.essalud.servicio;

import java.util.List;

import com.bd.essalud.modelo.TblMedico;



public interface IMedicoServicio  {

	void RegistrarMedico(TblMedico tblmedico);
	void EliminarMedico(TblMedico tblmedico);
	List<TblMedico> ListadoMedico();
	TblMedico buscarporId(Integer id);
	

	
}
