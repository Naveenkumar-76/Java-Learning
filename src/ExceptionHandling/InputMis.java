package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your roll number: ");
		try {
			int n = sc.nextInt();
			System.out.println("Your roll number is " + n);
		} catch(InputMismatchException i) {
			System.out.println("Input must be an integer!");
		}
		sc.close();
	}

}
