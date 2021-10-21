package com.piyush.config;

import org.springframework.context.annotation.Bean;

import com.piyush.persistence.EmployeeDao;
import com.piyush.persistence.EmployeeDaoImpl;
import com.piyush.presentation.EmployeePresentation;
import com.piyush.presentation.EmployeePresentationImpl;
import com.piyush.service.EmployeeService;
import com.piyush.service.EmployeeServiceImpl;

public class EmployeeConfiguration {
	
	@Bean
	public EmployeeDao employeeDao() {
		return new EmployeeDaoImpl();
	}
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl(employeeDao());
	}
	
	@Bean("empPresentation")
	public EmployeePresentation getEmpPresentation() {
		return new EmployeePresentationImpl(employeeService());
	}
	

}
