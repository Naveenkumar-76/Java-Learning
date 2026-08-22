package Mult_Threading;

class PrintChar implements Runnable {
	@Override
	public void run() {
		for(int i = 65; i < 71; i++) {
			System.out.println((char) i);
		}
	}
}
class PrintNumbers extends Thread {
	@Override
	public void run() {
		for(int i = 1; i < 6; i++) {
			System.out.println(i);
		}
	}
}
public class IntroMultiThreading {

//	We can achieve the multi-threading with 2 ways
//	1. extends Thread class and 2. implementing Runnable Interface
	
	public static void main(String[] args) {
		
		PrintNumbers pn = new PrintNumbers();
		PrintChar pc = new PrintChar();
		Thread t = new Thread(pc);
		pn.start();
		t.start();
	}

}
