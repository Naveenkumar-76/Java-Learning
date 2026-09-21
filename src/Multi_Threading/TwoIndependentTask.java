package Multi_Threading;

class PrintNumbers2 implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
				System.out.println("Printing numbers interrupted!");
			}
		}
	}
}
class PrintCharacters implements Runnable {
	@Override
	public void run() {
		for(char ch = 'A'; ch <= 'J'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(2000);
			} catch(Exception e) {
				System.out.println("Printing characters interrupted!");
			}
		}
	}
}
public class TwoIndependentTask {

	public static void main(String[] args) {
		
		PrintNumbers2 pn = new PrintNumbers2();
		PrintCharacters pc = new PrintCharacters();
		
		Thread t1 = new Thread(pn);
		Thread t2 = new Thread(pc);
		t1.start();
		t2.start();
	}

}
