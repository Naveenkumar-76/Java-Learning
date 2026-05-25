package primecheck;
import java.util.Scanner;

public class primecheck_3 {
	
	static String primecheck(int n) {
		
		if(n <= 0) {
			return "Invalid";
		}
		
//		Logic for prime number check
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				return "Not a prime number";
			}
		}
		return "Prime number";

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
