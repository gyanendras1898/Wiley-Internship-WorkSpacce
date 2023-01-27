package com.gyan.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@Column(name = "id")
	private int empId;

	private String name;

	@Column(name="desig")
	private String designation;

	@Column(name="deptt")
	private String department;

	private double salary;
	
}
