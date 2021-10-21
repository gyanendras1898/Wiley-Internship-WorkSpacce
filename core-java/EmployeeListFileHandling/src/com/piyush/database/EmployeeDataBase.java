package com.piyush.database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.piyush.exceptions.FileNotFoundException;

import com.piyush.beans.Employee;

public class EmployeeDataBase {
	private static Employee[] employees=new Employee[10];
	static File file;
	static ObjectOutputStream oos=null;
	static ObjectInputStream ois=null;
	public static int size;
	
	file=new File("EmployeeData.txt");
	
	public static Employee[] getEmployees() throws FileNotFoundException {
		if(file.isFile()) {
			ois=new ObjectInputStream(new FileInputStream(file));
			 employees=(Employee[]) ois.readObject();
			 ois.close();
			 return employees;
		}
		else
			throw new FileNotFoundException("File not exists");		
	}
	
	
	public static void setEmployees(Employee[] employees)throws FileNotFoundException  {
		if(file.isFile()) {
			oos=new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(employees);
			oos.close();
		}
		else
			throw new FileNotFoundException("File not exists");	
	}
	
	

}