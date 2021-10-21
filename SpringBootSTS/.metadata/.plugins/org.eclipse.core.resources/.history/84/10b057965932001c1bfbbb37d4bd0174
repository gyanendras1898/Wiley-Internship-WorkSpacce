package com.sujata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Empl")
public class Employee {

	@Setter
	@Getter
	@Id
	@Column(name = "id")
	private int empId;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	@Column(name="desig")
	private String designation;
	@Setter
	@Getter
	@Column(name="deptt")
	private String department;
	@Setter
	@Getter
	private double salary;
	public Employee(String name, String designation, String department, double salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
	
	
}
