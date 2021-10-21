package com.piyush.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.piyush.bean.Employee;
import com.piyush.persistence.EmployeeDao;
import com.piyush.persistence.EmployeeDaoImpl;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

//	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	private EmployeeDao employeeDao;
	@Autowired
	public EmployeeServiceImpl( EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	@Override
	public ArrayList<Employee> getAllEmployees() throws ClassNotFoundException, SQLException {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee)throws ClassNotFoundException, SQLException  {
		return employeeDao.insertData(employee);
	}

	@Override
	public boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException {
		return employeeDao.deleteData(empId);
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return employeeDao.updateSalary(empId,salary);
	}

	@Override
	public Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException {
		return employeeDao.searchRecord(empId);
	}

}
