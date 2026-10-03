package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
//		Challenge 1:
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(40);
		set.add(10);
		set.add(50);
		set.add(30);

		System.out.println(set);
		
//		Challenge 2:
		
		HashSet<Integer> id = new HashSet<>();
		
		System.out.print("Please enter how many id's you want enter: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(!id.add(sc.nextInt()))
				System.out.println("Duplicate value not accepted!");
		}
		
		System.out.println(id);
		
//		Challenge 3:
		
		HashSet<String> lang = new HashSet<>();
		
		lang.add("Java");
		lang.add("Sql");
		lang.add("Html");
		lang.add("Css");
		lang.add("JavaScript");
		
		System.out.println(lang);
		System.out.println(lang.contains("Java"));
		System.out.println(lang.contains("python"));
		System.out.println(lang.contains("Sql"));
		
//		Challenge 4:
		
		HashSet<String> fruit = new HashSet<>();
		
		fruit.add("Applet");
		fruit.add("Banana");
		fruit.add("Mango");
		fruit.add("Orange");
		fruit.add("Grapes");
		
		System.out.println(fruit);
		
		System.out.println(fruit.remove("Mango"));
		
		System.out.println(fruit.remove("Mango"));
		
//		Challenge 5:
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Ravi");
		names.add("Sneha");
		names.add("Naveen");
		names.add("Ravi");
		names.add("Anil");
		names.add("Sneha");
		names.add("Kiran");
		names.add("Naveen");
		
		System.out.println(names);
		
		HashSet<String> uniq_names = new HashSet<>();
		uniq_names.addAll(names);
		
		System.out.println(uniq_names);
	}

}
