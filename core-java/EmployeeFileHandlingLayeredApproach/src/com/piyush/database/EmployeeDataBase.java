package com.piyush.database;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.piyush.bean.Employee;

public class EmployeeDataBase {
	private static Employee[] employees = new Employee[10];
	static File file = new File("EmployeeData.txt");;
	static ObjectOutputStream oos = null;
	static ObjectInputStream ois = null;
	public static int size;

//	file=new File("EmployeeData.txt");

	public static Employee[] getEmployees() throws FileNotFoundException {
		try {
			if (file.isFile()) {
				ois = new ObjectInputStream(new FileInputStream(file));
				employees = (Employee[]) ois.readObject();
				ois.close();
				return employees;
			} else
				throw new FileNotFoundException("File not exists");
		} catch (Exception e) {
			System.out.println("Database exception: " + e.getMessage());
		}
		return null;
	}

	public static void setEmployees(Employee[] employees) throws FileNotFoundException {
		try {
			if (file.isFile()) {
				oos = new ObjectOutputStream(new FileOutputStream(file));
				oos.writeObject(employees);
				oos.close();
			} else
				throw new FileNotFoundException("File not exists");
		} catch (Exception e) {
			System.out.println("Database exception: " + e.getMessage());
		}

	}
}
