package ExceptionHandling;

import java.util.Scanner;

public class NumberFormat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your seat number: ");
		String seat = sc.nextLine();
		try {
			int seat_num = Integer.parseInt(seat);
			System.out.println("Your seat number is " + seat_num);
		} catch(NumberFormatException n) {
			System.out.println("Invalid seat number!");
		}
		sc.close();
	}

}
