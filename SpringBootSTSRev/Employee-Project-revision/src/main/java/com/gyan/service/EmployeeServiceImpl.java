package com.gyan.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyan.bean.Employee;
import com.gyan.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public boolean deleteEmployee(int empId) {
		employeeDao.deleteById(empId);
		return true;
	}


	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();	
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		employeeDao.save(employee);
		return true;
	}

	@Override
	public Employee searchEmployee(int empId) {
		return employeeDao.findById(empId).get();
	}

	@Override
	public Employee searchByName(String name) {
		int id = -1;
		id = employeeDao.searchByName(name);
		if(id != -1)
			return this.searchEmployee(id);
		return null;
	}


	@Override
	public boolean updateSalary(int empId, double salary) {
		employeeDao.updateSalary(empId,salary);
		return true;
	}

}
