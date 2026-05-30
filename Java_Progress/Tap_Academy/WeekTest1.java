package Tap_Academy;
import java.util.Scanner;

public class WeekTest1 {

//		1. Given two positive integers n and m, print first n prime numbers greater than m.?
	public static boolean checkPrime(int n) {
		for(int i = 2; i*i <= n; i++) {
			if(n%2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void printPrime(int n, int m) {
		int count = 0; 
		for(int i = m+1; count < n; i++) {
			if(checkPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
	}
	
//		2. Write a Java program to print pattern, where each line consists of alphabets. Starting from 'A;
//		   up to the respective line number
	
	public static void printAlpha(int alpha) {
		for(int i = 65; i <= alpha+64; i++) {
			for(int j = 65; j <= i; j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int alpha = sc.nextInt();
		
		printAlpha(alpha);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		printPrime(n, m);
	}

}
