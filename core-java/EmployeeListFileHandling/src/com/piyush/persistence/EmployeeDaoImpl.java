package com.piyush.persistence;

import com.piyush.exceptions.FileNotFoundException;
import com.piyush.beans.Employee;
import com.piyush.database.EmployeeDataBase;
import com.piyush.exceptions.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee employee) throws FileNotFoundException {
		Employee[] employees=EmployeeDataBase.getEmployees();
		employees[EmployeeDataBase.size]=employee;
		EmployeeDataBase.setEmployees(employees);
		
	}

	
}
