package day11.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		Employee emp1=new Employee(101,"Rajan");
		Employee emp2=new Employee(102,"Piyush");
		Employee emp3=new Employee(103,"Gaurav");
		
		Project project1=new Project(1,"project1");
		Project project2=new Project(2,"project2");
		
		
		TreeMap<Employee,Project> treeMap=new TreeMap<>();
		treeMap.put(emp1, project1);
		treeMap.put(emp3, project1);
		treeMap.put(emp2, project1);
		treeMap.put(emp1, project2);

		for(Map.Entry<Employee, Project> entry: treeMap.entrySet()) {
			System.out.println(entry);
		}
		
	}

}
