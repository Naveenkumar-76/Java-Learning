package ArrayDequeChallenges;

import java.util.ArrayDeque;

public class ArrayDeque1 {

	public static void main(String args[] ) {
		
//		Challenge 1 — Customer Queue
		
//		Create a deque containing:
//		C101, C102, C103, C104
//
//		A new customer C105 arrives.
//		Then serve customers one by one until the deque becomes empty.
		
		ArrayDeque<String> customer = new ArrayDeque<>();
		
		customer.add("C101");
		customer.add("C102");
		customer.add("C103");
		customer.add("C104");
		
		System.out.println(customer);
		
		customer.addLast("C105");
		
		System.out.println(customer);
		
		while(!customer.isEmpty()) {
			System.out.println(customer.pollFirst());
		}
		
		System.out.println(customer + ", " + customer.isEmpty());
		
//		Challenge 2 — Front & Rear
//		Start with:
//		[10, 20, 30, 40, 50]
//
//		Perform these operations:
//
//		Add 5 at the front.
//		Add 60 at the rear.
//		Remove the front element.
//		Remove the rear element.
//		Print the final deque.
//
//		Expected final deque:
//		[10, 20, 30, 40, 50]
		
		ArrayDeque<Integer> ar = new ArrayDeque<>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar);
		
		ar.addFirst(5);
		ar.addLast(60);
		
		System.out.println(ar);
		
		ar.removeFirst();
		ar.removeLast();
		
		System.out.println(ar);
		
//		Challenge 3 — First vs Last Occurrence
//		Given:
//		[10, 20, 30, 20, 40, 20, 50]
//
//		Remove:
//		Only the first occurrence of 20.
//		Print the deque.
//
//		Then reset it to the original values and remove:
//
//		Only the last occurrence of 20.
//		Print the deque.
		
		ArrayDeque<Integer> arr = new ArrayDeque<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(20);
		arr.add(40);
		arr.add(20);
		arr.add(50);
		
		System.out.println(arr);
		
		arr.removeFirstOccurrence(20);
		
		System.out.println(arr);
		
		arr.removeLastOccurrence(20);
		
		System.out.println(arr);
		
		arr.remove(20);
		
		System.out.println(arr);
	}
}
