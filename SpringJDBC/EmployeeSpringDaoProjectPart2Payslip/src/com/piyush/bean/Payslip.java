package com.piyush.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payslip {
	
	private Employee employee;
	private double hra;
	private double pf;
	private double da;
	private double totalSalary;

}
