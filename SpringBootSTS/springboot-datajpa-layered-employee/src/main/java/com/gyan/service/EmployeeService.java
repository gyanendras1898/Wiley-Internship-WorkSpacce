package com.gyan.service;

import java.sql.SQLException;

import java.util.ArrayList;

import com.gyan.bean.Employee;


public interface EmployeeService {

	ArrayList<Employee> getAllEmployees();
	boolean insertEmployee(Employee employee);
	boolean deleteEmployee(int empId);
	boolean updateSalary(int empId,double salary);
	Employee searchEmployee(int empId);
	
}
