package day8.tictactok;

public class Tok implements Runnable {
	private TickTakTok tickTakTok;
	
	public Tok(TickTakTok tickTakTok) {
		super();
		this.tickTakTok = tickTakTok;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=20;i++)
			tickTakTok.showTok(i);
	}

}
