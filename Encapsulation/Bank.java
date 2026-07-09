package Encapsulation;
import java.util.Scanner;

	/*Problem: Bank Account
	
	Create a class BankAccount.
	
	Private Variables
	accountNumber
	accountHolderName
	balance
	Methods
	deposit(double amount)
	
	Rules:
	
	amount > 0
	withdraw(double amount)
	
	Rules:
	
	amount > 0
	amount <= balance
	
	Otherwise print
	
	Insufficient Balance
	
	
	In main()
	Balance = 1000
	
	Deposit 500
	
	Withdraw 300
	
	Withdraw 2000
	
	Expected Output
	
	Balance : 1000
	
	Deposited : 500
	
	Balance : 1500
	
	Withdrawn : 300
	
	Balance : 1200
	
	Insufficient Balance
*/

class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	public BankAccount(int accountNumber, String accountHolder , double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		if(amount > 0) {
			System.out.println("Balance: " + balance);
			System.out.println("Deposited : " + amount);
			balance += amount;
			System.out.println("Balance: " + balance);
		} else {
			System.out.println("Insufficient Amount");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			System.out.println("Balance: " + balance);
			System.out.println("withdrawn : " + amount);
			balance -= amount;
			System.out.println("Balance: " + balance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}
public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount(101, "naveen", 1000);
		System.out.print("Deposite: " );
		double dep = sc.nextDouble();
		System.out.print("Withdraw: ");
		double wd = sc.nextDouble();
		b.deposit(dep);
		b.withdraw(wd);
		sc.close();
	}

}
