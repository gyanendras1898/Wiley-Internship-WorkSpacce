package exceptions.employee.service;

import exceptions.employee.beans.Employee;
import exceptions.employee.exceptions.EmployeeAgeOutOfRangeException;
import exceptions.employee.exceptions.EmployeeAlreadyExistException;
import exceptions.employee.exceptions.EmployeeListOverflowException;

public interface EmployeeService {
	Employee[] getAllEmployee();
	boolean validateAge(Employee employee) throws EmployeeAgeOutOfRangeException;
	boolean addEmployee(Employee employee) throws EmployeeAlreadyExistException, EmployeeListOverflowException;

}
