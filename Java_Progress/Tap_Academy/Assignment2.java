package Tap_Academy;
import java.util.Scanner;

public class Assignment2 {

//	Find largest element 
	public static int largest(int[] ar) {
		int largestele = Integer.MIN_VALUE;
		for(int i = 0; i < ar.length; i++) {
			if(largestele < ar[i]) {
				largestele = ar[i];
			}
		}
		return largestele;
	}
	
//	Find second largest element
	public static int secondLargest(int[] ar) {
		
		int secondlargestele = Integer.MIN_VALUE;
		int largestele = largest(ar);
		
		for(int i = 0; i < ar.length; i++) {
			if(secondlargestele < ar[i] && largestele != ar[i]) {
				secondlargestele = ar[i];
			}
		}
		return secondlargestele;
	}
	
//	Find smallest element
	public static int smallest(int[] ar) {
		int smallestele = Integer.MAX_VALUE;
		for(int i = 0; i < ar.length; i++) {
			if(smallestele > ar[i]) {
				smallestele = ar[i];
			}
		}
		return smallestele;
	}
	
//	Find second smallest element
	public static int secondSmallest(int[] ar) {
		
		int secondsmallestele = Integer.MAX_VALUE;
		int smallestele = smallest(ar);
		
		for(int i = 0; i < ar.length; i++) {
			if(secondsmallestele > ar[i] && smallestele != ar[i]) {
				secondsmallestele = ar[i];
			}
		}
		return secondsmallestele;
	}
	
//  Find Sum of an array
	public static int sumOf(int[] ar) {
		int sum = 0; 
		for(int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		return sum;
	}
	
//	Find product of an array
	public static int productOf(int ar[] ) {
		int product = 1;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] != 0) {
				product *= ar[i];
			}
		}
		return product;
	}
	
//	1. Print max and min sum of n-1 array
	public static void printSumOf(int[] ar) {
		
		int sum = sumOf(ar);
		int largestele = largest(ar);
		int smallestele = smallest(ar);
		
		System.out.println("Largest Sum is " + (sum - smallestele));
		System.out.println("Smallest Sum is " + (sum - largestele));
	}
	
//	2. Print product of resultant array of n-1 array
	public static void printProduct(int[] ar) {
		
		int res[] = new int[ar.length];
		int product = productOf(ar);
		
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] != 0) {
				res[i] = product / ar[i];
			}
		}
		
		System.out.print("Product of resutant array is: ");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
//	3. Print Max and Min sum of pairs in an array
	public static void sumOfPairs(int ar[]) {
		
		int max = largest(ar);
		int secmax = secondLargest(ar);
		int min = smallest(ar);
		int secmin = secondSmallest(ar);
		
		System.out.println("Max sum of pair is: " + (max + secmax));
		System.out.println("Min sum of pair is: " + (min + secmin));
	}
	
//	4. Print Max and Min product of pairs in an array
	public static void productOfPairs(int ar[]) {
		
		int product1 = largest(ar) * secondLargest(ar); 
		int product2 = smallest(ar) * secondSmallest(ar);
		
		System.out.println((product1 > product2) ? "Max product of pair is: " + product1 :  
			"Max product of pair is: " + product2);
		System.out.println((product1 < product2) ? "Min product of pair is: " + product1 :  
			"Min product of pair is: " + product2);
		
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the data: ");
		int ar[] = new int[size];
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
//		printSumOf(ar);
		
//		printProduct(ar);
		
//		sumOfPairs(ar);
		
		productOfPairs(ar);
		
		sc.close();
	}

}
