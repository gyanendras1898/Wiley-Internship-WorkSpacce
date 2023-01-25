package com.piyush;

public class Student {
	
	int roll;
	String name;
	
	Student(String name, int roll){
		this.name=name;
		this.roll= roll;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + roll;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (roll != other.roll)
			return false;
		return true;
	}
	
	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
////		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + roll;
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
////		if (name == null) {
////			if (other.name != null)
////				return false;
////		} else if (!name.equals(other.name))
////			return false;
//		if (roll != other.roll)
//			return false;
//		return true;
//	}
//	

}
