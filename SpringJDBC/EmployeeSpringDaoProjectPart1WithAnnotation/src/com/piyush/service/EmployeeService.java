package com.piyush.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.piyush.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> getAllEmployees()throws SQLException;
	boolean insertEmployee(Employee employee) throws  SQLException;
	boolean deleteEmployee(int empId) throws  SQLException;
	boolean updateSalary(int empId,int salary) throws  SQLException;
	Employee searchEmployee(int empId) throws  SQLException;
}
