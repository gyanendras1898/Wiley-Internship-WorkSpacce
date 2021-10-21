package com.piyush.persistence;

import com.piyush.beans.Employee;

public interface EmployeeDao {

	Employee getEmployeeById(int employeeID);
}
