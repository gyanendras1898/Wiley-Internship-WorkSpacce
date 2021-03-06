package com.piyush.persistence;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.piyush.bean.Employee;
import com.piyush.helper.EmployeeRowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	private EmployeeRowMapper employeeRowMapper;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void setEmployeeRowMapper(EmployeeRowMapper employeeRowMapper) {
		this.employeeRowMapper = employeeRowMapper;
	}


	@Override
	public ArrayList<Employee> getAllRecords()throws SQLException{
		String query="SELECT * FROM employees";
		
		List<Employee> employees=jdbcTemplate.query(query, employeeRowMapper);
		
		return (ArrayList<Employee>)employees;
	}

	@Override
	public boolean insertData(Employee employee) throws SQLException {
		String query="INSERT INTO employees VALUES(?,?,?,?,?)";
		
		int rows=jdbcTemplate.update(query, employee.getEmpId(),employee.getEmpName()
				,employee.getEmpDepartment(),employee.getEmpDesignation(),employee.getEmpSalary());
		
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public boolean deleteData(int empId) throws SQLException {
		String query="DELETE FROM employees WHERE id=?";
		int rows=jdbcTemplate.update(query, empId);
		
		if (rows > 0)
			return true;
		return false;
	}

	@Override
	public boolean updateSalary(int empId, int salary) throws  SQLException {
		String query="UPDATE employees SET salary=? WHERE id=?";
		
		int rows=jdbcTemplate.update(query,salary, empId);
		
		if (rows > 0)
			return true;
		return false;
	}
	
	

	@Override
	public Employee searchRecord(int empId) throws SQLException {
		String query="SELECT * FROM employees WHERE id=?";
		
		Employee employee=jdbcTemplate.queryForObject(query, employeeRowMapper, empId);
		
		return employee;
	}

}
