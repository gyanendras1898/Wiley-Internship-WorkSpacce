package bankImpl;

public interface DebitInterest extends Interest {
	void deductMonthlyInt();
	void deductHalfYrlyInt();
	void deductAnnualInt();

}
