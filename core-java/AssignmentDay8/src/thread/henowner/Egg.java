package thread.henowner;

public class Egg implements Runnable {
//	private int sum=1;
	private int count=1;

	@Override
	synchronized public void run() {
		while(count*2<=100) {
			System.out.println("Hen laid the Egg - "+count);
			System.out.println("Owner gained Rs "+(count*2));
			count++;
		}
	}

}
