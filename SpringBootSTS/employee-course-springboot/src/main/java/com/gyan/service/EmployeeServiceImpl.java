package com.gyan.service;

import com.gyan.beans.Employee;
import com.gyan.persistence.EmployeeDao;
import com.gyan.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();

	@Override
	public Employee searchEmployeeById(int employeeId) {

		return employeeDao.getEmployeeById(employeeId);
	}

}
