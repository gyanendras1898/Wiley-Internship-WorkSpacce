package exception;

public class MinimumBalanceException extends RuntimeException {
	

	public MinimumBalanceException(){
		super("Minimum balance should be 25 ");
	}
	
	public MinimumBalanceException(String message){
		super(message);
	}

}
