package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	@Getter
	@Setter
	private int empId;
	@Getter
	@Setter
	private String empName;
	@Getter
	@Setter
	private String empDepartment;
	@Getter
	@Setter
	private String empDesignation;
	@Getter
	@Setter
	private int empSalary;
	

}
