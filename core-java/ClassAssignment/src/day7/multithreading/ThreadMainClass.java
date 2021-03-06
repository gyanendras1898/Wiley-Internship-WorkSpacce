package day7.multithreading;

class Factorial extends Thread {
	private int number;
	Factorial(int number){
		this.number=number;
	}
	
	@Override
	public void run(){
		int factorial=1;
		for(int i=1;i<=number;i++)
			factorial*=i;
		System.out.println(Thread.currentThread().getName()+" :"+ factorial);
	}
}

class Reverse implements Runnable{
	private int number;
	Reverse(int number){
		this.number=number;
	}
	
	@Override
	public void run() {
		int rev=0;
		while(number>0) {
			rev=rev*10+number%10;
			number/=10;
		}
		System.out.println(Thread.currentThread().getName()+" :"+ rev);	
	}
}


public class ThreadMainClass {
	public static void main(String[] args) {
		Thread thread1=new Factorial(5);
//		Reverse rev=new Reverse(1234);
		Thread thread2=new Thread(new Reverse(123));
//		Thread thread2=new Thread(rev);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Main end");
	
	}
}





