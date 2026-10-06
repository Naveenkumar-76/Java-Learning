package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
//		Challenge 1 — Student Marks
//
//		Create: Hashmap
//		Add:
//		101 → 85
//		102 → 92
//		103 → 78
//		104 → 92
//
//		Write code to:
//		Print the complete HashMap.
//		Print the marks of student 103.
//		Check whether student 105 exists.
//		Update student 103's marks to 88.
//		Remove student 101.
//		Print the final size.
		
		HashMap<Integer, Integer> marks = new HashMap<>();
		
		marks.put(101, 85);
		marks.put(102, 92);
		marks.put(103, 78);
		marks.put(104, 92);
		
		System.out.println(marks);
		System.out.println(marks.get(103));
		System.out.println(marks.containsKey(105));
		System.out.println(marks.put(103, 88));
		System.out.println(marks.remove(101));
		System.out.println(marks.size());
		
		System.out.println(marks);
		
//		Challenge 2 — Product Price Lookup
//		Create:
//		HashMap<String, Double> products = new HashMap<>();
//
//		Store:
//		"Java" → 499.50
//		"SQL" → 399.00
//		"HTML" → 299.50
//		"CSS" → 349.00
//
//		Write code to:
//		Retrieve the price of "SQL".
//		Check whether "JavaScript" exists as a key.
//		Check whether 299.50 exists as a value.
//		Change "HTML" price to 319.50.
//		Print all products using entrySet() and Map.Entry.
		
		HashMap<String, Double> products = new HashMap<>();
		
		products.put("Java", 499.50);
		products.put("SQL", 399.00);
		products.put("HTML", 299.50);
		products.put("CSS", 349.00);
		
		System.out.println(products.get("SQL"));
		System.out.println(products.containsKey("JavaScript"));
		System.out.println(products.containsValue(299.50));
		System.out.println(products.put("HTML", 319.50));
		
		for(Map.Entry<String, Double> value : products.entrySet()) {
			System.out.println(value.getKey() + " = " + value.getValue());
		}
		
//		Challenge 4 — Traversal
//		A. Only keys
//		BOnly values
//		C. Both key and value
		
		HashMap<Integer, String> employees = new HashMap<>();

		employees.put(501, "Ravi");
		employees.put(502, "Kiran");
		employees.put(503, "Naveen");
		employees.put(504, "Suresh");
		
		Set<Integer> keys = employees.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for (Integer key : employees.keySet()) {
		    System.out.println("Key: " + key);
		    System.out.println("Value: " + employees.get(key));
		}
		
		Collection<String> values = employees.values();
		
		Iterator<String> itr_values = values.iterator();
		
		while(itr_values.hasNext()) {
			System.out.println(itr_values.next());
		}
		
		Set<Map.Entry<Integer, String>> entry = employees.entrySet();
		
		Iterator itr_set_values = entry.iterator();
		
		while(itr_set_values.hasNext()) {
			System.out.println(itr_set_values.next());
		}
	}

}
