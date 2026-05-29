package Loops;
import java.util.Scanner;

public class Palindrome {
	
	public static void palindrome(int num) {
		if(num < 0) {
			num = -num; 
		}
		int original = num, rev = 0;
		while(num != 0) {
			rev = num%10 + rev * 10;
			num /= 10;
		}
		System.out.println((original == rev) ? "Palindrome" : "Not a palindrome");
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		palindrome(num);
	}

}
