package day8.tictactok;

public class Tak implements Runnable {
	private TickTakTok tickTakTok;
	

	public Tak(TickTakTok tickTakTok) {
		super();
		this.tickTakTok = tickTakTok;
	}


	@Override
	public void run() {
		for(int i=1;i<=20;i++)
			tickTakTok.showTak(i);

	}

}
