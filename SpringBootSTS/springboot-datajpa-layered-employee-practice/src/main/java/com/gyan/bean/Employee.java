package com.gyan.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Empl")
public class Employee {

	@Id
	@Column(name = "id")
	private int empId;

	private String name;

	@Column(name="desig")
	private String designation;
	@Setter
	@Getter
	@Column(name="deptt")
	private String department;

	private double salary;
	
}
