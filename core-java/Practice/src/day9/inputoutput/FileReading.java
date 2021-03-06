package day9.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileReading {
	public static void main(String[] args) {
		Employee employees[]=new Employee[10];
		try(FileOutputStream fos=new FileOutputStream("practiceDB");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				FileInputStream fis=new FileInputStream("practiceDB");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
		Employee  emp=null;
		
		int idx=0;
			while(true) {
				try {
					emp=(Employee) ois.readObject();
					if(emp==null) {
						for(Employee empl: employees) {
							oos.writeObject(empl);
						}
					}
					if(emp.getName().equals("Shyaam")) {
						emp.setName("Om");
						System.out.println("Success");
					}
					employees[idx++]=emp;
				} catch (ClassNotFoundException e) {
					
				}
				
			}
			
		}catch (IOException e) {
			System.out.println("catched");
		}
		
		
		
	}

}
