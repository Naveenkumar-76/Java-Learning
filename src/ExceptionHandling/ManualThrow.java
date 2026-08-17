package ExceptionHandling;

import java.util.Scanner;

public class ManualThrow {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		try {
		    if (age < 18) {
		        throw new IllegalArgumentException("You are not eligible for vote!");
		    }
		    System.out.println("You are eligible for vote!");
		} catch (IllegalArgumentException e) {
		    System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
