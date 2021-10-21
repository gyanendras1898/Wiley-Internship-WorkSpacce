package day8.tictactok;

public class Tick implements Runnable {

	private TickTakTok tickTakTok;
	
	public Tick(TickTakTok tickTakTok) {
		super();
		this.tickTakTok = tickTakTok;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=20;i++)
			tickTakTok.showTick(i);

	}

}
