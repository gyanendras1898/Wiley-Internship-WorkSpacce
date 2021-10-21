package com.piyush.persistence;

import com.piyush.beans.Employee;
import com.piyush.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {

	Employee getEmployeeById(int employeeID) throws EmployeeNotFoundException;
}
