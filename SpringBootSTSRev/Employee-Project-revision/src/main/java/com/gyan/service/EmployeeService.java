package com.gyan.service;

import java.util.ArrayList;
import java.util.List;

import com.gyan.bean.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	boolean insertEmployee(Employee employee);
	boolean deleteEmployee(int empId);
	boolean updateSalary(int empId,double salary);
	Employee searchEmployee(int empId);
	Employee searchByName(String name);
}
