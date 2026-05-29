package Loops;
import java.util.Scanner;
public class Lcm {
	
	public static void lcm(int n1, int n2) {
		int product = n1 * n2, lcf = 0;
		for(int i = n1; i >= 1; i--) {
			if(n1%i == 0 && n2%i == 0) {
				lcf = i;
				break;
			}
		}
		System.out.println(product/lcf);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		lcm(n1, n2);
	}

}
