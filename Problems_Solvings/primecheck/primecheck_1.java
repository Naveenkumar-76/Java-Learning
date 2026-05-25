package primecheck;
import java.util.Scanner;

public class primecheck_1 {
	
	static String primecheck(int n) {
		
		if(n <= 0) {
			return "Invalid";
		}
		
		int count = 0;
		
//		Logic for prime number check
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return "Prime number";
		} else {
			return "Not a prime number";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		User input
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
//		output
		String res = primecheck(n);
		System.out.println(res);
		
		sc.close();
	}
	
}
