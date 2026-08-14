package ExceptionHandling;

public class NullPoint {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String nul = null;
		try {
			System.out.println(nul.charAt(0));
		} catch(NullPointerException n) {
			System.out.println("Given string is null!");
		}
	}

}
