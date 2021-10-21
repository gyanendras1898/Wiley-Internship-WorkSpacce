package thread.sleep;

class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getId()+", "
						+Thread.currentThread().getName()+", "
						+Thread.currentThread().isAlive()+", "
						+Thread.currentThread().getState()+", "
						+Thread.currentThread().getPriority());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}


public class ThreadMain {
	public static void main(String[] args) {
		
		Thread thread1=new Thread(new MyThread());
		Thread thread2=new Thread(new MyThread());
		Thread thread3=new Thread(new MyThread());
		Thread thread4=new Thread(new MyThread());
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
