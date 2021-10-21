package day9.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileInputOutput {
	
	

	public static void main(String[] args) {
		
		
		try(FileOutputStream fos=new FileOutputStream("practiceDB");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			
			Employee emp1=new Employee("Ram",32);
			Employee emp2=new Employee("Shyaam",48);
			Employee emp3=new Employee("Harry",24);
			
			oos.writeObject(emp1);
			oos.writeObject(emp2);
			oos.writeObject(emp3);
			
			System.out.println("File created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
