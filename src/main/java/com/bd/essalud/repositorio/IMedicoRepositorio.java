package com.bd.essalud.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.essalud.modelo.TblMedico;

public interface IMedicoRepositorio extends CrudRepository <TblMedico, Integer> {

}
