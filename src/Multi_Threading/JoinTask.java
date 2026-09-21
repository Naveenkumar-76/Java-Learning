package Multi_Threading;

class Task extends Thread {
	@Override 
	public void run() {
		String thread_name = Thread.currentThread().getName();
		if(thread_name.equals("download_task")) {
			downloadTask();
		} else {
			processTask();
		}
	}

	public void downloadTask() {
		System.out.println("Downloading...");
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			System.out.println("Downloading a file interrupted!");
		}
	}

	public void processTask() {
		System.out.println("Processing downloaded file...");
	}
}
public class JoinTask {

	public static void main(String[] args) {
		
		Thread t1 = new Task();
		Thread t2 = new Task();
		t1.setName("download_task");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
