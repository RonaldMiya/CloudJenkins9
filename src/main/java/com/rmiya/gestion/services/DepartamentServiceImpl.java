package com.rmiya.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rmiya.gestion.dao.DepartamentDAO;
import com.rmiya.gestion.exception.DAOException;
import com.rmiya.gestion.exception.EmptyResultException;
import com.rmiya.gestion.model.Departament;

public class DepartamentServiceImpl implements DepartamentService {

	@Autowired
	private DepartamentDAO departmentDAO;
	
	@Override
	public Departament find(int department_id) throws DAOException, EmptyResultException {
		
		Departament emp = departmentDAO.findDepartament(department_id);

		return emp;
		
	}

	@Override
	public List<Departament> findAll() throws DAOException, EmptyResultException {
		
		List<Departament> emps = departmentDAO.findAllDepartament();
		return emps;
		
	}
	
}
