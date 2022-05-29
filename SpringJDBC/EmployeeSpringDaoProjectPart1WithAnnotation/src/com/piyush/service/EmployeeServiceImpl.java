package com.piyush.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piyush.bean.Employee;
import com.piyush.persistence.EmployeeDao;
import com.piyush.persistence.EmployeeDaoImpl;

@Service
public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	@Autowired
	private EmployeeDao employeeDao;

	
//	public EmployeeServiceImpl(EmployeeDao employeeDao) {
//	super();
//	this.employeeDao = employeeDao;
//	}

	@Override
	public ArrayList<Employee> getAllEmployees() throws  SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee)throws  SQLException  {
		return employeeDao.insertData(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) throws  SQLException {
		return employeeDao.deleteData(empId);
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws  SQLException {
		// TODO Auto-generated method stub
		return employeeDao.updateSalary(empId,salary);
	}

	@Override
	public Employee searchEmployee(int empId) throws  SQLException {
		return employeeDao.searchRecord(empId);
	}

}
