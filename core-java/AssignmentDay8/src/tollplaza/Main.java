package tollplaza;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		Vehicle vehicle[]=new Vehicle[5];
		Tollplaza tollplaza=new Tollplaza();
		vehicle[0]=new Vehicle("Car",tollplaza);
		vehicle[1]=new Vehicle("Truck",tollplaza);
		vehicle[2]=new Vehicle("Bus",tollplaza);
		vehicle[3]=new Vehicle("auto",tollplaza);
		vehicle[4]=new Vehicle("Airplane",tollplaza);
		
		Executor threadPool=Executors.newFixedThreadPool(5);
		for(int i=0;i<5;i++)
			threadPool.execute(vehicle[i]);
		
//		Thread thread1=new Thread(vehicle1);
//		Thread thread2=new Thread(vehicle2);
//		Thread thread3=new Thread(vehicle3);
//		Thread thread4=new Thread(vehicle4);
//		Thread thread5=new Thread(vehicle5);
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
//		thread5.start();
	}
}
