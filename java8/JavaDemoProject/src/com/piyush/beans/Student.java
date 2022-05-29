package com.piyush.beans;

public class Student {
	public int rollNo;
	public String name;
	public final static String SCHOOL="St. John's";

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(int rollNo) {
		super();
		this.rollNo=rollNo;
	}
	
	public Student(String name,int rollNo) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

//	public int getRollNo() {
//		return rollNo;
//	}
//
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", school= "+SCHOOL+"]";
	}


}
