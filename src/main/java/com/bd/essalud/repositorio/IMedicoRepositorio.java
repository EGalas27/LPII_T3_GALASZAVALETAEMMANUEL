package com.bd.essalud.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.bd.essalud.modelo.TblMedico;

public interface IMedicoRepositorio extends CrudRepository <TblMedico, Integer>{
    
    // Obtener todos los médicos
    List<TblMedico> findAll();
    
    // Guardar (crear o actualizar) un médico
    //void Save(TblMedico tblmedico);
    
    // Eliminar un médico por su ID (corrigiendo el parámetro)
    //void deleteById(TblMedico tblmedico);
}
