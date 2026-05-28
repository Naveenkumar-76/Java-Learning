package If_Else;
import java.util.Scanner;

public class Leap_Year {
	
	static void leap_year(int year) {
		
		System.out.println(((year%4 == 0 && year%100 != 0) || year%400 == 0) ? "Leap Year": "Not a leap year");
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();	
		
		leap_year(year);
		sc.close();
	}

}
