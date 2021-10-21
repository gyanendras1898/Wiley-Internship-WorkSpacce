package com.gyan.persistence;

import com.gyan.beans.Employee;
import com.gyan.database.EmployeeDataBase;

public class EmployeeDaoImpl implements EmployeeDao {

	
	@Override
	public Employee getEmployeeById(int employeeID) {
		
		for(Employee employee:EmployeeDataBase.getEmployees() ) {
			if(employee.getEmpId()==employeeID)
				return employee;
		}
		return null;
	}

}
