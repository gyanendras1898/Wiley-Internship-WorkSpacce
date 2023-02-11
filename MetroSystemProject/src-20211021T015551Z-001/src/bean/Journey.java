package bean;

public class Journey {
	private int cId;
	private int sId;
	private int dId;
	private int fare;
	
	Journey(){
		
	}

	public Journey(int cId, int source, int destination, int fare) {
		super();
		this.cId = cId;
		this.sId = source;
		this.dId = destination;
		this.fare = fare;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getSource() {
		return sId;
	}

	public void setSource(int source) {
		this.sId = source;
	}

	public int getDestination() {
		return dId;
	}

	public void setDestination(int destination) {
		this.dId = destination;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Journey [cId=" + cId + ", source=" + sId + ", destination=" + dId + ", fare=" + fare + "]";
	}
	
	
}
