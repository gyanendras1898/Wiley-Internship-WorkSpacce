package com.gyan.persistence;

import com.gyan.beans.Employee;

public interface EmployeeDao {

	Employee getEmployeeById(int employeeID);
}
