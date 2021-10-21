package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	private EmployeeDao employeeDao;
		
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSalary(int empId, int salary) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
