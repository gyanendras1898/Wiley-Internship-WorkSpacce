package com.piyush.service;

import com.piyush.beans.Employee;
import com.piyush.persistence.EmployeeDao;
import com.piyush.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();

	@Override
	public Employee searchEmployeeById(int employeeId) {

		return employeeDao.getEmployeeById(employeeId);
	}

}
