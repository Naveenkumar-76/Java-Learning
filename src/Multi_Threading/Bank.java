package Multi_Threading;

class BankAccount implements Runnable {
	private Bank bank;
	BankAccount(Bank bank) {
		this.bank = bank;
	}
	@Override
	public void run() {
		bank.withDraw(700);
	}
}
public class Bank {

	private double balance = 1000;
	synchronized public void withDraw(double amount) {
		String name = Thread.currentThread().getName();
		if(amount <= balance && balance > 0) {
			balance = balance - amount;
			System.out.println(name + " sucessfully withdraw " + amount);
		} else {
			System.out.println(name + " Insufficient balance!\nCurrent balance is " + balance);
		}
	}
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		BankAccount ac1 = new BankAccount(b);
		BankAccount ac2 = new BankAccount(b);
		
		Thread t1 = new Thread(ac1);
		Thread t2 = new Thread(ac2);
		
		t1.setName("ba1");
		t2.setName("ba2");
		
		t1.start();
		t2.start();
	}

}
