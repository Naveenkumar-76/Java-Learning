package Loops;
import java.util.Scanner;

public class PrintPrime {
	
//	check prime
	public static boolean checkPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
//	print prime 2 to n
	public static void printprime(int n) {
		for(int i = 2; i <= n; i++) {
			if(checkPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
//	print n prime numbers
	public static void printprime2(int n) {
		int count = 0;
		for(int i = 2; count < n; i++) {
			if(checkPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
	}
//	print n to n prime numbers
	public static void n2nPrime(int n1, int n2) {
		if(n1 <= 1 || n2 <= 1) {
			System.out.println("Invalid");
		}
		int count = 0;
		for(int i = n1; i <= n2; i++) {
			if(checkPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("There is no prime numbers");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		n2nPrime(n1, n2);
		sc.close();
	}

}
