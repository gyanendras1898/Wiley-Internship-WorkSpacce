package com.sujata.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees()throws ClassNotFoundException,SQLException;
	boolean insertEmployee(Employee employee);
	boolean deleteEmployee(int empId);
	boolean updateSalary(int empId,int salary);
	Employee searchEmployee(int empId);
}
