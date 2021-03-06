package exceptions.employee.database;

import exceptions.employee.beans.Employee;

public class EmployeeDataBase {
	private int empCount;
	public static final int maxEmpCount=10;
	private Employee[] employees;
	
	public EmployeeDataBase() {
		super();
		employees=new Employee[maxEmpCount];
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

}
