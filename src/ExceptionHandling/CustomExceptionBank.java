package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException {
	String get;
	public InsufficientBalanceException(String get) {
		this.get = get;
	}
	@Override
	public String getMessage() {
		return get;
	}
}
public class CustomExceptionBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		fixed balance
		int balance = 5000;
		System.out.println("Enter the withdraw amount: ");
		int withdrawAmount = 0;
		try {
			withdrawAmount = sc.nextInt();
			if(withdrawAmount <= 0) {
				System.out.println("Should be enter the valid withdraw amount!");
				return;
			}
			else if(balance < withdrawAmount) {
				throw new InsufficientBalanceException("Insufficient balance!");
			}
			System.out.println( withdrawAmount + " is withdraw successfully!");
			balance -= withdrawAmount;
			System.out.println("Your current balance is " + balance);
		} catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException f) {
			System.out.println("Withdraw amount should be an integer!");
		} catch(Exception g) {
			g.printStackTrace();
		} finally {
			sc.close();
		}
		
	}

}
