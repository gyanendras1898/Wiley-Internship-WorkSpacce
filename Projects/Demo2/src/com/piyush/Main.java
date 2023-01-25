package com.piyush;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;
		int j=7;
		if(i==j)
			System.out.println("Equal");
		
		
		
		Student sunil= new Student("Piyush", 79);
		Student piyush = new Student("Piyush", 79);
		
		System.out.println(sunil);
		System.out.println(piyush);
		
		if(sunil==piyush)
			System.out.println("YES EQUAL");
		else
			System.out.println("NOOOO");
		
//		HashSet <Integer> intSet = new HashSet<>();
//		intSet.add("PiyushSingh");
		
		HashSet<Student> set = new HashSet<>();
		
		set.add(sunil);
		set.add(piyush);
		
		
		System.out.println(set.size());
		
		for(Student st : set) {
			System.out.println(st.hashCode()+" "+st.name+" "+st.roll);
		}

	}

}
