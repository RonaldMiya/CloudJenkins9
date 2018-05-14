package com.rmiya.gestion.services;

import java.util.List;

import com.rmiya.gestion.exception.DAOException;
import com.rmiya.gestion.exception.EmptyResultException;
import com.rmiya.gestion.model.Departament;

public interface DepartamentService {

	Departament find(int department_id) throws DAOException, EmptyResultException;

	List<Departament> findAll() throws DAOException, EmptyResultException;
	
}
