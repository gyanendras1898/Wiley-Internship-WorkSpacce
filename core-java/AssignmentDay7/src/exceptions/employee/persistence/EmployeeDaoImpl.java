package exceptions.employee.persistence;

import exceptions.employee.beans.Employee;
import exceptions.employee.database.EmployeeDataBase;
import exceptions.employee.exceptions.EmployeeAgeOutOfRangeException;
import exceptions.employee.exceptions.EmployeeAlreadyExistException;
import exceptions.employee.exceptions.EmployeeListOverflowException;

public class EmployeeDaoImpl implements EmployeeDao {
	
	EmployeeDataBase employeeDataBase=new EmployeeDataBase();

	@Override
	public boolean addEmployee(Employee employee) throws EmployeeAlreadyExistException, EmployeeListOverflowException {
		
		Employee[] employees=employeeDataBase.getEmployees();
		
		if(employeeDataBase.getEmpCount()<employeeDataBase.maxEmpCount) {
			for(int i=0;i<employeeDataBase.maxEmpCount;i++) {
				if(employees[i]==null) {
					employees[i]=employee;
					return true;
				}
				if(employees[i].getName().equals(employee.getName()))
					throw new EmployeeAlreadyExistException("Employee with name "+employee.getName()+" already exist");	
			}
		}
		throw new EmployeeListOverflowException("Employee List in dataBase is full");
	}

	@Override
	public boolean validateAge(Employee employee) throws EmployeeAgeOutOfRangeException {
		if(employee.getAge()>=18 && employee.getAge()<=60)
			return true;
		throw new EmployeeAgeOutOfRangeException(employee.getName()+"'s age does not match with our requirement");
	}

	@Override
	public Employee[] getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDataBase.getEmployees();
	}



}






