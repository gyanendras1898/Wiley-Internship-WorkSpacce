package exceptions.employee.exceptions;

@SuppressWarnings("serial")
public class EmployeeListOverflowException extends Exception{
	
	public EmployeeListOverflowException(String message) {
		super(message);
	}
}
