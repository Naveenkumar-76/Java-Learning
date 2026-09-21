package Multi_Threading;

class Counter {
	int count = 0;
	synchronized void increment() {
		count++;
	}
}
class Increment1 implements Runnable {
	Counter c;
	public Increment1(Counter c) {
		this.c = c;
	}
	@Override
	public void run() {
		for(int i = 1; i < 1001; i++) {
			c.increment();
		}
	}
}
class Increment2 implements Runnable {
	Counter c;
	public Increment2(Counter c) {
		this.c = c;
	}
	@Override
	public void run() {
		for(int i = 1; i < 1001; i++) {
			c.increment();
		}
	}
}
public class SharedCounter {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(new Increment1(c));
		Thread t2 = new Thread(new Increment2(c));
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			System.out.print("Problem in incrementers!");
		}
		System.out.println(c.count);
	}

}
