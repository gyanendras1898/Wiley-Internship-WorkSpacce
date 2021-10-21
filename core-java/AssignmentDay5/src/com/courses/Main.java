package com.courses;

public class Main {
	public static void main(String[] args) {
		Course java=new CoreJavaCourse();
		Course python=new PythonCourse();
		Course advJava=new AdvanceJavaCourse();
		
		Coordinator coordinator = new Coordinator();
		
		Employee emp1=new Employee("emp1");
		Employee emp2=new Employee("emp2");
		Employee emp3=new Employee("emp3");
		Employee emp4=new Employee("emp4");
		
		coordinator.register(advJava,emp1);
		coordinator.register(advJava,emp2);
		coordinator.register(advJava,emp3);
		
		coordinator.register(java,emp1);
		coordinator.register(java,emp2);
		coordinator.register(java,emp3);
		coordinator.register(java,emp4);
		
		coordinator.register(python,emp1);
		
		coordinator.displayList(advJava);
		System.out.println("====================");
		coordinator.displayList(java);

		coordinator.deregister(java, emp1);
		System.out.println("====================");
		coordinator.displayList(java);
		
	}

}
