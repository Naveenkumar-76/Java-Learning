package ExceptionHandling;

public class ExceptWithFinally {

	public static void main(String[] args) {
		
		int a = 5, b = 0;
		try {
			System.out.println(a / b);
			System.out.println("Division successfully completed!");
		} catch(ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program execution completed");
		}
	}

}
