package com.rmiya.gestion.services;

import com.rmiya.gestion.exception.DAOException;
import com.rmiya.gestion.exception.LoginException;
import com.rmiya.gestion.model.Employee;

public interface SecurityService {

	Employee validate(String idEmployee, String clave) throws LoginException, DAOException;

}
