package day8.tictactok;

public class TickTakTokMain {

	public static void main(String[] args) {
		TickTakTok tickTakTok=new TickTakTok();
		Tick tick=new Tick(tickTakTok);
		Tak tak=new Tak(tickTakTok);
		Tok tok=new Tok(tickTakTok);
		
		Thread tickThread=new Thread(tick,"Tick");
		Thread takThread=new Thread(tak,"Tak");
		Thread tokThread=new Thread(tok,"Tok");
		
		tickThread.start();
		takThread.start();
		tokThread.start();

	}

}
