package ArrayDequeChallenges;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque2 {

	public static void main(String[] args) {
		
//		Challenge 4:
		ArrayDeque<Integer> test = new ArrayDeque<>();
		
		
		test.add(100);
		test.add(200);
		test.add(300);
		
		while(!test.isEmpty()) {
			System.out.println(test.pollFirst());
		}
		
		System.out.println("ArrayDeque is empty!");
		
//		Challenge 5: 
		
		ArrayDeque<Integer> ele = new ArrayDeque<>();
		
		ele.add(15);
		ele.add(25);
		ele.add(35);
		ele.add(45);
		ele.add(55);
		
		System.out.println("First element: " + ele.peekFirst());
		System.out.println("Last element: " + ele.peekLast());
		
//		Challenge 6:
		
		test.add(100);
		test.add(200);
		test.add(300);
		test.add(400);
		test.add(500);
		
		Iterator<Integer> itr = test.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
