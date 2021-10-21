package day7.multithreading;

class MyThreadClass extends Thread{
	
	public MyThreadClass() {
		super();
	}
	
	public MyThreadClass(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());
	}
}
public class MyFirstDemoProject {

	public static void main(String[] args) {
		//New Born
		MyThreadClass thread1=new MyThreadClass();  //thread0
		MyThreadClass thread2=new MyThreadClass("Second");  //Second
		MyThreadClass thread3=new MyThreadClass();  //thread1
		MyThreadClass thread4=new MyThreadClass();  //thread2
		
//		thread2.setName("Second");
		
		thread1.start();
		//ready or running state depending upon scheduling
		thread2.start();
		thread3.start();
		thread4.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println("Good Bye from "+Thread.currentThread().getName());

	}

}
