package ExceptionHandling;

import java.util.Scanner;

public class ArithmeticExcept {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numerator: ");
		int a = sc.nextInt();
		System.out.print("Enter the denominator: ");
		int b = sc.nextInt();
		try {
			System.out.println("Division of " + a + " and " + b + " is " + a / b);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide " + a + " by zero");
		}
		sc.close();
	}

}
