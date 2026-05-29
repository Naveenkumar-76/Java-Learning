package Loops;
import java.util.Scanner;

public class Factorial {

	public static void fact(int n) {
		int sum = 1;
		System.out.print("Factorial of " + n + " is: ");
		for(int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.print(sum);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		fact(n);
		sc.close();
	}

}
