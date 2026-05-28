package If_Else;

import java.util.Scanner;

public class Greatest {
	
	public static void greatest(int a, int b, int c) {
		
		System.out.print("Greatest number is: ");
		if(a > b && a > c) {
			System.out.println(a);
		} else if(b > c) {
			System.out.print(b);
		} else {
			System.out.print(c);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three values: ");
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		greatest(a, b, c);
		sc.close();
	}

}
