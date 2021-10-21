package com.sujata.demo;

class Base{
	int total;

	public Base(int total) {
		this.total=total;
	}
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}

class Derived extends Base implements Runnable{
	
	public Derived(int total) {
		super(total);
	}
	public void loop() {
		for(int i=1;i<=getTotal();i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println(Thread.currentThread().getName()+" ends here! ");
	}
	@Override
	public void run() {
		loop();
	}
}
public class MySecondDemoClass {

	public static void main(String[] args) {
		Derived job=new Derived(5);
		
		Thread thread1=new Thread(job);
		Thread thread2=new Thread(job);
		
		thread1.start();
		thread2.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" i : "+i);
		}
		System.out.println(Thread.currentThread().getName()+" ends here! ");
	}

}
