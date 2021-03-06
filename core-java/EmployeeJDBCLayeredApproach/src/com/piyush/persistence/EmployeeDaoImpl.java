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
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin");
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM employees");
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
	public boolean insertData(Employee employee) throws ClassNotFoundException, SQLException {
		boolean flag=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin");
		PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO employees VALUES(?,?,?,?,?)");
		preparedStatement.setInt(1, employee.getEmpId());
		preparedStatement.setString(2, employee.getEmpName());
		preparedStatement.setString(3, employee.getEmpDepartment());
		preparedStatement.setString(4, employee.getEmpDesignation());
		preparedStatement.setInt(5, employee.getEmpSalary());
		int resultSet=preparedStatement.executeUpdate();
		flag=true;
		connection.close();
		return flag;
	}

	@Override
	public boolean deleteData(int empId) throws ClassNotFoundException, SQLException {
		boolean flag=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin");
		String query="DELETE FROM employees WHERE id="+empId;
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		int resultSet=preparedStatement.executeUpdate();
		flag=true;
		connection.close();
		return flag;
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws ClassNotFoundException, SQLException {
		boolean flag=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin");
		String query="UPDATE employees SET salary="+salary+" WHERE id="+empId;
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		int resultSet=preparedStatement.executeUpdate();
		flag=true;
		connection.close();
		
		return flag;
	}
	
	

	@Override
	public Employee searchRecord(int empId) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "admin");
		String query="SELECT * FROM employees WHERE id="+empId;
		Employee employee=null;
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
		int id=resultSet.getInt("ID");
		String na=resultSet.getString("NAME");
		String deptt=resultSet.getString("DEPARTMENT");
		String desig=resultSet.getString("DESIGNATION");
		int sal=resultSet.getInt("SALARY");
		employee=new Employee(id, na, deptt, desig, sal);
		}
		connection.close();
		return employee;
	}

}
