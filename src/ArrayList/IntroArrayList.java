package ArrayList;

import java.util.*;

public class IntroArrayList {

	public static void main(String[] args) {
		
//		Creation of ArrayList
		ArrayList al = new ArrayList();
		
//		Using add method to push the data into al.
		al.add(111);
		al.add(122);
		al.add(133);
		al.add(144);
		
//		Printing elements using reference
		
		System.out.println(al); 
		System.out.println("Printing elements using reference is completed!");
		
//		printing elements specifically one after one by using for loop 
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("Printing elements using for loop is completed!");
		
//		Printing elements by using for each loop
		
		for(Object i : al) {
			System.out.println(i);
		}
		System.out.println("Printing elements using for each loop is completed!");
		
//		Printing elements by using Iterator interface and it's methods
		
		Iterator cursor = al.iterator();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		System.out.println("Printing elements using Iterator interface  is completed!");
		
//		Printing elements by using ListIterator interface and it's methods
		
		ListIterator cursor_point = al.listIterator();
		while(cursor_point.hasNext()) {
			System.out.println(cursor_point.next());
		}
		System.out.println("Printing elements using Listiterator interface with forward direction is completed!");
		
		ListIterator cursor_points = al.listIterator(al.size());
		while(cursor_points.hasPrevious()) {
			System.out.println(cursor_points.previous());
		}
		System.out.println("Printing elements using Listiterator interface with backward direction is completed!");
	}

}
