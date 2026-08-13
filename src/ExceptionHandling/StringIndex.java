package ExceptionHandling;

import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter the index of character you want to at your name: ");
		int index = sc.nextInt();
		try {
			System.out.println(name.charAt(index));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Index value must be within the range of 0 to " + (name.length() - 1));
		}
		sc.close();
	}

}
