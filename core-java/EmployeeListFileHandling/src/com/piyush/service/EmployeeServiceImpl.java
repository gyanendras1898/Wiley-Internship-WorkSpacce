package com.piyush.service;

import com.piyush.exceptions.FileNotFoundException;

import com.piyush.beans.Employee;
import com.piyush.exceptions.EmployeeNotFoundException;
import com.piyush.persistence.EmployeeDao;
import com.piyush.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();

	@Override
	public void insertEmployee(Employee employee) throws FileNotFoundException {
		employeeDao.addEmployee(employee);		
	}
	

}
