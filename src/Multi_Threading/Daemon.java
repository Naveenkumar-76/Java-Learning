package Multi_Threading;

class OnWorker implements Runnable {
	@Override 
	public void run() {
		try {
			BackGroundWorker back = new BackGroundWorker();
			Thread t2 = new Thread(back);
			t2.setDaemon(true);
			System.out.println(t2.isDaemon());
			t2.start();
			System.out.println("worker: My work is 25% completed!");
			Thread.sleep(3000);
			System.out.println("worker: My work is 50% completed!");
			Thread.sleep(3000);
			System.out.println("worker: My work is completed!");
		} catch(InterruptedException e) {
			System.out.println("Some problem in worker!");
		}
	}
}
class BackGroundWorker implements Runnable {
	@Override
	public void run() {
		try {
			for(; ;) {
				System.out.println("BackGroundWorker: My work is running!");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Some problem in backgroundworker!");
		}
	}
}
public class Daemon {
	
	public static void main(String args[]) {
		
		Thread t = new Thread(new OnWorker());
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main: My work is completed!");
	}
}
