package Multi_Threading;

class Customer1 implements Runnable {
	private Theater t1;
	Customer1(Theater t1) {
		this.t1 = t1;
	}
	@Override
	public void run() {
		t1.getTicket(3);
	}
}
class Customer2 implements Runnable {
	private Theater t1;
	Customer2(Theater t1) {
		this.t1 = t1;
	}
	@Override
	public void run() {
		t1.getTicket(2);
	}
}
class Customer3 implements Runnable {
	private Theater t1;
	Customer3(Theater t1) {
		this.t1 = t1;
	}
	@Override
	public void run() {
		t1.getTicket(2);
	}
}
class Theater {
	int ticket = 5;
	String name;
	synchronized public void getTicket(int nTicket) {
		try {
			if(nTicket > 0) {
				if(ticket >= nTicket) {
					name = Thread.currentThread().getName();
					ticket -= nTicket;
					System.out.println(name + " " + nTicket + " tickets booked successfully!");
				} else {
					System.out.println("Sorry theatre housefull!");
				}
			} else {
				System.out.println("Please enter the valid input!");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public int remaingTicket() {
		return ticket;
	}
	
}
public class Ticket {

	public static void main(String[] args) {
		Theater t = new Theater();
		
		Thread t1 = new Thread(new Customer1(t), "A");
		Thread t2 = new Thread(new Customer2(t), "B");
		Thread t3 = new Thread(new Customer3(t), "C");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch(InterruptedException e) {
			System.out.println("Some thing problem!");
		}
		System.out.println(t.remaingTicket());
	}

}
