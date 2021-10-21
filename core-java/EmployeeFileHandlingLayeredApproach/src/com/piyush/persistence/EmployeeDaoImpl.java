package com.piyush.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.piyush.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllRecords()throws ClassNotFoundException,SQLException{
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		//3.Process Result
		
		return employees;
	}

	@Override
	public boolean insertData(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteData(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSalary(int empId, int salary) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee searchRecord(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
