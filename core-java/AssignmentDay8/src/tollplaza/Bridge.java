package tollplaza;

public class Bridge {
	
	synchronized static public void pass(Vehicle vehicle) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(vehicle.getName()+" crosses bridge  : "+Thread.currentThread().getName());
	}
}
