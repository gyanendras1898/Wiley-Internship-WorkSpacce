package com.piyush.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.piyush.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
	
		int id=resultSet.getInt("ID");
		String na=resultSet.getString("NAME");
		String deptt=resultSet.getString("DEPARTMENT");
		String desig=resultSet.getString("DESIGNATION");
		int sal=resultSet.getInt("SALARY");
		Employee employee=new Employee(id, na, deptt, desig, sal);
		return employee;
	}

}
