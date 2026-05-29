package Loops;
import java.util.Scanner;

public class Armstrong {
	
//	count digits
	public static int countDigits(int num) {
		int count = 0;
		while(num > 0) {
			num = num/10;
			count++;
		}
		return count;
	}
//	check a number armstrong or not 
	public static boolean checkArmstrong(int num) {
		int original = num, armsum = 0; 
		int count = countDigits(num);
		while(num > 0) {
			int digit = num % 10;
			armsum = armsum + (int)Math.pow(digit, count);
			num = num/10;
		}
//		System.out.println((original == armsum) ? "Armstrong" : " Not a armstrong");
		return (original == armsum) ? true : false;
	}
//	print armstrong numbers from 1 to n
	public static void printArmstrong(int num) {
		for(int i = 1; i <= num; i++) {
			if(checkArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
//		checkArmstrong(num);
		printArmstrong(num);
		sc.close();
	}
}
