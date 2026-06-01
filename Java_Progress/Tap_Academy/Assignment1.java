package Tap_Academy;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		System.out.println("Enter the data into an array: ");
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		int sumar[] = new int[size];
		
		for(int i = 0; i < ar.length; i++) {
			int sum = 0;
			for(int j = 0; j < ar.length; j++) {
				if(i != j) {
					sum += ar[j];
				}
			}
			sumar[i] = sum;
		}
		
		int largestSum = Integer.MIN_VALUE;
		int smallestSum = Integer.MAX_VALUE;
		for(int i = 0; i < sumar.length; i++) {
			if(largestSum < sumar[i]) {
				largestSum = sumar[i];
			} 
			if(smallestSum > sumar[i]) {
				smallestSum = sumar[i];
			}
		}
		System.out.println("Largest Sum is: " + largestSum);
		System.out.println("Smallest Sum is: " + smallestSum);
		
		sc.close();
	}
}
