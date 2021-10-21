package com.piyush.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	private int empId;
	private String empName;
	private String empDepartment;
	private String empDesignation;
	private int empSalary;
	
	
//	
//	public Employee() {
//		super();
//	}
//
//	public Employee(int empId, String empName, String empDepartment, String empDesignation, int empSalary) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empDepartment = empDepartment;
//		this.empDesignation = empDesignation;
//		this.empSalary = empSalary;
//	}
//
//	public int getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpDepartment() {
//		return empDepartment;
//	}
//
//	public void setEmpDepartment(String empDepartment) {
//		this.empDepartment = empDepartment;
//	}
//
//	public String getEmpDesignation() {
//		return empDesignation;
//	}
//
//	public void setEmpDesignation(String empDesignation) {
//		this.empDesignation = empDesignation;
//	}
//
//	public int getEmpSalary() {
//		return empSalary;
//	}
//
//	public void setEmpSalary(int empSalary) {
//		this.empSalary = empSalary;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment
//				+ ", empDesignation=" + empDesignation + ", empSalary=" + empSalary + "]";
//	}
//	
	
	

}
