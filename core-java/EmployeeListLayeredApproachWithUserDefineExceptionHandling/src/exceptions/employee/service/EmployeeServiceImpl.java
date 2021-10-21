package exceptions.employee.service;

import exceptions.employee.beans.Employee;
import exceptions.employee.exceptions.EmployeeAgeOutOfRangeException;
import exceptions.employee.exceptions.EmployeeAlreadyExistException;
import exceptions.employee.exceptions.EmployeeListOverflowException;
import exceptions.employee.persistence.EmployeeDao;
import exceptions.employee.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public Employee[] getAllEmployee() {
		return employeeDao.getEmployeeList();
	}

	@Override
	public boolean validateAge(Employee employee) throws EmployeeAgeOutOfRangeException {
		return employeeDao.validateAge(employee);

	}

	@Override
	public boolean addEmployee(Employee employee) throws EmployeeAlreadyExistException, EmployeeListOverflowException {
		return employeeDao.addEmployee(employee);
	}



}
