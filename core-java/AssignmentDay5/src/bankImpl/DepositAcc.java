package bankImpl;

public interface DepositAcc extends Account {
	
	boolean withdraw();
	void deposit();
	double getBalance();

}
