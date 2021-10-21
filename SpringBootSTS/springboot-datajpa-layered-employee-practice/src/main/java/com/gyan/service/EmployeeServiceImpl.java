package com.gyan.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.bean.Employee;

import com.gyan.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public ArrayList<Employee> getAllEmployees() {
		return (ArrayList<Employee>) employeeDao.findAll();
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		Employee emp = employeeDao.save(employee);
		if (emp != null)
			return true;
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		employeeDao.deleteById(empId);
		return true;
	}

	@Override
	public boolean updateSalary(int empId, double salary) {
		int rows= employeeDao.updateSalary(empId, salary);
		if(rows>0)
			return true;
		return false;
		
	}

	@Override
	public Employee searchEmployee(int empId) {
		return employeeDao.findById(empId).get();
	}

	@Override
	public Employee searchByName(String name) {
		int id=employeeDao.searchName(name);
		return searchEmployee(id);
	}

}
