package Multi_Threading;

public class Worker implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("Hello, I'm worker Thread!");
			Thread.sleep(5000);
			System.out.println("Worker: My work is done!");
		} catch(InterruptedException e) {
			System.out.println("Interrupted worker Thread!");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Hi i'm main Thread!");
		Thread t = new Thread(new Worker());
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted main Thread!");
		}
		System.out.println("Main: My work is done!");
		t.interrupt();
	}

}
