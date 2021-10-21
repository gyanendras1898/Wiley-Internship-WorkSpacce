package com.piyush.persistence;

import com.piyush.beans.Employee;
import com.piyush.database.EmployeeDataBase;

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
