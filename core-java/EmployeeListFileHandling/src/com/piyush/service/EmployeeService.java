package com.piyush.service;


import com.piyush.beans.Employee;
import com.piyush.exceptions.EmployeeNotFoundException;
import com.piyush.exceptions.FileNotFoundException;

public interface EmployeeService {

	public void insertEmployee(Employee employee) throws FileNotFoundException;
}
