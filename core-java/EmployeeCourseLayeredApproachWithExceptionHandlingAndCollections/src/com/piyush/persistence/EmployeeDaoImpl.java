package com.piyush.persistence;

import com.piyush.beans.Employee;
import com.piyush.database.EmployeeDataBase;
import com.piyush.exceptions.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {
	
	

	
	@Override
	public Employee getEmployeeById(int employeeID) throws EmployeeNotFoundException {
		
		for(Employee employee:EmployeeDataBase.getEmployees() ) {
			if(employee.getEmpId()==employeeID)
				return employee;
		}
		throw new EmployeeNotFoundException("employee with id "+employeeID+" does not exist!");
	}

}
