package com.piyush.persistence;

import com.piyush.custom.AppendObjectOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeDaoImpl implements EmployeeDao {
	private File employees;
	private File temp;
	private FileOutputStream output;
	private FileInputStream input;
	private FileOutputStream tempOutput;
	private FileInputStream tempInput;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private ObjectOutputStream toos;
	private ObjectInputStream tois;
//	private AppendObjectOutputStream aoos;

	public EmployeeDaoImpl() {
		try {
			employees = new File("Employees");
			temp = new File("temp");
			if (!employees.exists()) {
				employees.createNewFile();

				output = new FileOutputStream(employees, true);
				oos = new ObjectOutputStream(output);
			} else {
				output = new FileOutputStream(employees, true);
				oos = new AppendObjectOutputStream(output);
			}

			if (!temp.exists()) {
				temp.createNewFile();
				tempOutput = new FileOutputStream(temp, true);
				toos = new ObjectOutputStream(tempOutput);
			} else {
				tempOutput = new FileOutputStream(temp, true);
				toos = new AppendObjectOutputStream(tempOutput);
			}
			setInputStream();
			setTempInputStream();

		} catch (Exception ex) {
			System.out.println("temp creation exception");
		}

	}

	private void setInputStream() throws IOException {
		input=new FileInputStream(employees);
		ois=new ObjectInputStream(input);

	}

	private void setTempInputStream() throws IOException {
		tempInput=new FileInputStream(temp);
		tois=new ObjectInputStream(tempInput);

	}

	public ObjectOutputStream getOos() {
		return oos;
	}

	public ObjectInputStream getOis() {
		return ois;
	}

	public ObjectOutputStream getToos() {
		return toos;
	}

	public ObjectInputStream getTois() {
		return tois;
	}

}
