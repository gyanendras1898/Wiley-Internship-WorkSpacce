package com.piyush.service;


import java.io.IOException;

import com.piyush.beans.Employee;

public interface EmployeeService {

	public void insertEmployee(Employee employee) throws IOException;

	public Employee[] listOfEmployees() throws ClassNotFoundException, IOException;
	
}
