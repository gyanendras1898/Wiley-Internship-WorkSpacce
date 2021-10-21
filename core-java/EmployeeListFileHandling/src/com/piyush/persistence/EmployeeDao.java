package com.piyush.persistence;

import com.piyush.exceptions.FileNotFoundException;

import com.piyush.beans.Employee;
import com.piyush.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
	void addEmployee(Employee employee) throws FileNotFoundException;
}
