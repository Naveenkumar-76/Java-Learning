package Multi_Threading;

class PlayGround implements Runnable {
	
	String sport1 = "Cricket";
	String sport2 = "Kabaddi";
 	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("GroupA")) {
			userA();
		} else {
			userB();
		}
	}
 	public void userA() {
 		try {
 			synchronized (sport1) {
 	 			System.out.println("Group A playing cricket");
 	 			Thread.sleep(1000);
 	 			synchronized (sport2) {
 	 				System.out.println("Group A playing kabaddi");
 	 				Thread.sleep(1000);
 	 			}
 	 		}
 		} catch(InterruptedException e) {
 			System.out.println("Group A Failed");
 		}
 	}
 	public void userB() {
 		try {
 			synchronized (sport1) {
 	 			System.out.println("Group B playing cricket");
 	 			Thread.sleep(1000);
 	 			synchronized (sport2) {
 	 				System.out.println("Group B playing kabaddi");
 	 				Thread.sleep(1000);
 	 			}
 	 		}
 		} catch(InterruptedException e) {
 			System.out.println("Group B Failed");
 		}
 	}
}
public class Sport {

	public static void main(String[] args) {
		
		PlayGround pg = new PlayGround();
		
		Thread t1 = new Thread(pg);
		Thread t2 = new Thread(pg);
		
		t1.setName("GroupA");
		t2.setName("GroupB");
		
		t1.start();
		t2.start();
	}

}
