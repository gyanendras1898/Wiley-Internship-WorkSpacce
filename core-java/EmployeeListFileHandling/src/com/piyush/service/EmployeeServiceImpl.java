package com.piyush.service;

import java.io.IOException;
import java.io.ObjectInputStream;

import com.piyush.beans.Employee;
import com.piyush.persistence.EmployeeDao;
import com.piyush.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();

	@Override
	public void insertEmployee(Employee employee) throws IOException {
		employeeDao.getOos().writeObject(employee);
		
	}

	@Override
	public Employee[] listOfEmployees() throws ClassNotFoundException, IOException {
		Object obj;
		Employee[] employees=new Employee[10];
		int idx=0;
		ObjectInputStream ois=employeeDao.getOis();
		while((obj=ois.readObject())!=null) {
			employees[idx++]=(Employee) obj;
		}
		return employees;
	}



	

}
