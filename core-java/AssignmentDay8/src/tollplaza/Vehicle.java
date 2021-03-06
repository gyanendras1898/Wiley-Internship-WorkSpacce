package tollplaza;

public class Vehicle implements Runnable {
	private String name;
	private Tollplaza tollplaza;


	public Vehicle(String name, Tollplaza tollplaza) {
		super();
		this.name = name;
		this.tollplaza = tollplaza;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		tollplaza.pass(this);
	}
}
