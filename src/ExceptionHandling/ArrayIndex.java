package ExceptionHandling;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = 0;
		try {
			System.out.print("Enter the size of the array: ");
			n = sc.nextInt();
			int ar[] = new int[n];
			System.out.print("Enter the elements of the array: ");
			for(int i = 0; i < ar.length; i++) {
				System.out.print("Enter the value of index " + i + ": ");
				ar[i] = sc.nextInt();
			}
			System.out.print("Enter the index of array element: ");
			int index = sc.nextInt();
			System.out.println(ar[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index value must be with in the range 0 to " + (n - 1));
		} catch(NegativeArraySizeException f) {
			System.out.println("Array size must be positive integer!");
		}
		sc.close();
	}

}
