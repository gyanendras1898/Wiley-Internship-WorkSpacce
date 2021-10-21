package com.piyush.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.piyush.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees()throws ClassNotFoundException,SQLException;
	boolean insertEmployee(Employee employee) throws ClassNotFoundException, SQLException;
	boolean deleteEmployee(int empId) throws ClassNotFoundException, SQLException;
	boolean updateSalary(int empId,int salary) throws ClassNotFoundException, SQLException;
	Employee searchEmployee(int empId) throws ClassNotFoundException, SQLException;
}
