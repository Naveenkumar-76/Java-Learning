package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends RuntimeException {
	@Override 
	public String getMessage() {
		return "You are minor";
	}
}
public class CustomExceptionAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = 0;
		try {
			age = sc.nextInt();
			if(age < 18) {
				throw new InvalidAgeException();
			} 
			System.out.println("You are major");
		} catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException f) {
			System.out.println("input should an integer!");
		} catch(Exception g) {
			g.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
