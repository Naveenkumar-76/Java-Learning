package If_Else;
import java.util.Scanner;

public class Grade_Calc {
	
	static String grade_calc(float marks) {
		
		if(marks < 0 || marks > 100) {
			return "Invalid";
		} else if(marks > 90) {
			return "A";
		} else if(marks > 70) {
			return "B";
		} else if(marks > 50) {
			return "C";
		} else if(marks >= 35) {
			return "D";
		} else {
			return "Fail";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		int marks = sc.nextInt();
		
		String res = grade_calc(marks);
		System.out.println(res);
		sc.close();
	}
}
