package com.piyush.persistence;

import java.sql.SQLException;
import java.util.ArrayList;

import com.piyush.bean.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllRecords()throws SQLException;
	boolean insertData(Employee employee) throws SQLException;
	boolean deleteData(int empId) throws SQLException;
	boolean updateSalary(int empId,int salary) throws SQLException;
	Employee searchRecord(int empId) throws SQLException;
}
