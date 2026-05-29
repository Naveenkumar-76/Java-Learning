package Loops;
import java.util.Scanner;

public class Fibonacci_Series {
	
	public static void fibonacci(int n) {
		int a = 0, b = 1;
		while(a <= n) {
			System.out.println(a);
			int c = a;
			a = a+b;
			b = c;
		}
	}
	public static void checkFibonacci(int n) {
		boolean isfibo = false;
		int a = 0, b = 1;
		while(a <= n) {
			if(a == n) {
				isfibo = true;
			}
			int next = a + b;
			a = b; 
			b = next;
		}
		System.out.println((isfibo) ? "fibonacci" : " not a fibonacci");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		checkFibonacci(n);
		sc.close();
	}

}
