package com.piyush.client;

import com.piyush.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ram=new Student(2,"Ram");
		Student shyam=new Student("Shaym");
		Student lakhan=new Student(1,"Lakhan");
		
//		shyam.setRollNo(3);
		
		shyam.rollNo=3;
		
		

		
		System.out.println(ram);
		System.out.println(lakhan);
		System.out.println(shyam);
		
		

	}

}
