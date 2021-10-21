package exceptions.employee.persistence;

import exceptions.employee.beans.Employee;
import exceptions.employee.exceptions.EmployeeAgeOutOfRangeException;
import exceptions.employee.exceptions.EmployeeAlreadyExistException;
import exceptions.employee.exceptions.EmployeeListOverflowException;

public interface EmployeeDao {
	boolean addEmployee(Employee employee) throws EmployeeAlreadyExistException, EmployeeListOverflowException;
	boolean validateAge(Employee employee) throws EmployeeAgeOutOfRangeException;
	Employee[] getEmployeeList();
}
