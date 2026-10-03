package Set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
//		Challenge 6 — Find Common Elements
//		You have:
//		Set A = [10, 20, 30, 40, 50]
//		Set B = [30, 40, 50, 60, 70]
		
		HashSet<Integer> A = new HashSet<>();
		
		A.add(10);
		A.add(20);
		A.add(30);
		A.add(40);
		A.add(50);
		
		HashSet<Integer> B = new HashSet<>();
		
		B.add(30);
		B.add(40);
		B.add(50);
		B.add(60);
		B.add(70);
		
		System.out.println(A);
		A.retainAll(B);
		System.out.println(A);
		
//		Challenge 7 — Unique Product IDs
//
//		An e-commerce system receives these product IDs:
//		501, 502, 503, 501, 504, 505, 502, 506, 503
		
//		Use HashSet to store unique product IDs.
//		Then print:
//		All unique product IDs
//		Number of unique products
		
		ArrayList<Integer> id = new ArrayList<>();
		
		id.add(501);
		id.add(502);
		id.add(503);
		id.add(501);
		id.add(504);
		id.add(505);
		id.add(502);
		id.add(506);
		id.add(503);
		
		HashSet<Integer> uniq_id = new HashSet<>();
		
		uniq_id.addAll(id);
		
		System.out.println("Unique product id's: " + uniq_id);
		System.out.println(uniq_id.size() + "Unique id's");
		
//		Challenge 8 — null
		
//		Create a HashSet and perform:
//		add(null)
//		add(null)
//		add("Java")
//		add("SQL")
		
//		Print:
//		Return value of both add(null) operations
//		Set contents
//		Whether null exists
//		Remove null
//		Final set
		
		HashSet<String> nul = new HashSet<>();
		
		System.out.println(nul.add(null));
		System.out.println(nul.add(null));
		nul.add("Java");
		nul.add("Sql");
		
		System.out.println(nul);
		
		System.out.println(nul.contains(null));
		
		nul.remove(null);
		
		System.out.println(nul);
	}

}
