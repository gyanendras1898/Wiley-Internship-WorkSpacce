package thread.henowner;


public class Main {
	public static void main(String[] args) {
		Egg egg=new Egg();
		Thread thread=new Thread(egg);
		Thread thread2=new Thread(egg);
		Thread thread3=new Thread(egg);
		thread.start();
		thread2.start();
		thread3.start();
	}

}
