package com.rmiya.gestion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmiya.gestion.dao.EmployeeDAO;
import com.rmiya.gestion.exception.DAOException;
import com.rmiya.gestion.exception.LoginException;
import com.rmiya.gestion.model.Employee;

@Service
public class SecurityServiceImpl implements SecurityService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee validate(String login, String password) throws LoginException, DAOException {

		Employee emp = employeeDAO.validate(login, password);

		return emp;
	}

}
