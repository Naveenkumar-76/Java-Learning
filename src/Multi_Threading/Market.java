package Multi_Threading;

class Producer implements Runnable {
	
	Market mark;
	Producer(Market mark) {
		this.mark = mark;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			mark.produce(i);			
		}
	}
}
class Consumer implements Runnable {
	Market mark;
	Consumer(Market mark) {
		this.mark = mark;
	}
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			mark.consume();			
		}
	}
}
public class Market {
	int value;
	boolean product_available = false;
	synchronized void produce(int product_value) {
		try {
			while(product_available) {
				wait();
			} 
			value = product_value;
			System.out.println("Producer produce " + value);
			product_available = true;
			notify();
		} catch(Exception e) {
			System.out.println("Problem in producer!");
		}
	}
	synchronized void consume() {
		try {
			while(!product_available) {
				wait();
			} 
			System.out.println("Consumer consume " + value);
			product_available = false;
			notify();
		} catch(Exception e) {
			System.out.println("Problem in Consumer!");
		}
	}

	public static void main(String[] args) {
		
		Market mark = new Market();
		
		Thread t1 = new Thread(new Producer(mark), "producer");
		Thread t2 = new Thread(new Consumer(mark), "consumer");
		
		t1.start();
		t2.start();
	}

}

