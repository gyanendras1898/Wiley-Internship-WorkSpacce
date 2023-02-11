package bean;

public class Card {
	private int cId;
	private int cBalance;
	
	
	Card(){
		
	}


	public Card(int cBalance) {
		super();
		this.cBalance = cBalance;
	}


	public int getcId() {
		return cId;
	}


	public void setcId(int cId) {
		this.cId = cId;
	}


	public int getcBalance() {
		return cBalance;
	}


	public void setcBalance(int cBalance) {
		this.cBalance = cBalance;
	}


	@Override
	public String toString() {
		return "Card [cId=" + cId + ", cBalance=" + cBalance + "]";
	}
	
	
	
	
}
