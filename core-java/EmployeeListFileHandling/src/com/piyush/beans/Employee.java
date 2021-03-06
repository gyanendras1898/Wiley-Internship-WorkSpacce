package com.piyush.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private String designation;
	private String department;
	private double salary;
	
	public Employee() {
		
	}

	
	public Employee(int empId, String empName, String designation, String department, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", designation="
				+ designation + ", salary=" + salary + "]";
	}
	
	

}
