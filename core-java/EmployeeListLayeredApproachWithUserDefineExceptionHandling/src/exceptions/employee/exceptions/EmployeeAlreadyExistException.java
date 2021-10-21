package exceptions.employee.exceptions;

@SuppressWarnings("serial")
public class EmployeeAlreadyExistException extends Exception{
	
	public EmployeeAlreadyExistException(String message) {
		super(message);
	}
}
