package tollplaza;

public class Tollplaza {
//	Bridge bridge=new Bridge();
	synchronized public void pass(Vehicle vehicle) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(vehicle.getName()+" crosses toll booth  : "+Thread.currentThread().getName());
		Bridge.pass(vehicle);
	}

}
