package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiExcept {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.print("Enter a number: ");
			int a = sc.nextInt();
			System.out.print("Enter b number: ");
			int b = sc.nextInt();
			System.out.println("Division of " + a + " and " + b + " is " + (a / b));
			System.out.print("Enter the array size: ");
			n = sc.nextInt();
			int ar[] = new int[n];
			System.out.print("Enter the array elements: ");
			for(int i = 0; i < ar.length; i++) {
				System.out.print("Enter the value of index " + i + ": ");
				ar[i] = sc.nextInt();
			}
			System.out.print("Enter the index of array element: ");
			int index = sc.nextInt();
			System.out.println("array have a " + ar[index] + " at index " + index);
		} catch(InputMismatchException c) { 
			System.out.println("Input number must an integer!");
		} catch(ArithmeticException d) {
			System.out.println("Cannot divide by zero!");
		}catch(NegativeArraySizeException e) {
			System.out.println("Array size must be positive integer!");
		} catch(ArrayIndexOutOfBoundsException f) {
			System.out.println("Array index value is must be within the range of 0 to " + (n - 1));
		} catch(Exception g) {
			g.printStackTrace();
		}
		sc.close();
	}

}
