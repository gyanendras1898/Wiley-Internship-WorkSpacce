package exceptions.employee.exceptions;

@SuppressWarnings("serial")
public class EmployeeAgeOutOfRangeException extends Exception{
	
	public EmployeeAgeOutOfRangeException(String message) {
		super(message);
	}
}
