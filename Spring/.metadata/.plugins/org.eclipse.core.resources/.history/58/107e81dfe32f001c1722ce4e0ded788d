package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sujata.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllRecords()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileyc112", "root", "sujata");
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMP");
		ResultSet resultSet=preparedStatement.executeQuery();
		
		ArrayList<Employee> employees=new ArrayList<Employee>();
		//3.Process Result
		while(resultSet.next()) {
			int empId=resultSet.getInt("ID");
			String na=resultSet.getString("NAME");
			String deptt=resultSet.getString("DEPARTMENT");
			String desig=resultSet.getString("DESIGNATION");
			int sal=resultSet.getInt("SALARY");
			Employee employee=new Employee(empId, na, deptt, desig, sal);
			employees.add(employee);
		}
		connection.close();
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
