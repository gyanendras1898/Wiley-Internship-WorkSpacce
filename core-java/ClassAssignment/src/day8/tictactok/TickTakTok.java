package day8.tictactok;

public class TickTakTok {
	
	private static int status=1;	
	synchronized public void showTick(int count) {
		while(status!=1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName()+":"+count+"  ");
		status=2;
		notifyAll();
				
	}
	
	synchronized public void showTak(int count) {
		while(status!=2) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(Thread.currentThread().getName()+":"+count+"  ");
		status=3;
		notifyAll();
		
	}
	
	synchronized public void showTok(int count) {
		while(status!=3) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+":"+count);
		status=1;
		notifyAll();

	}
}
