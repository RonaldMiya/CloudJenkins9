package com.rmiya.gestion.dao;

import java.util.List;

import com.rmiya.gestion.exception.DAOException;
import com.rmiya.gestion.exception.EmptyResultException;
import com.rmiya.gestion.model.Departament;

public interface DepartamentDAO {
	
	List<Departament> findAllDepartament() throws DAOException, EmptyResultException;

	Departament findDepartament(int department_id) throws DAOException, EmptyResultException;

	void create(String name, String description, String city) throws DAOException;

	void delete(String name) throws DAOException;

	void update(String name, String description, String city) throws DAOException;
	
	Departament findDepartmentByName(String name) throws DAOException, EmptyResultException;

	
}
