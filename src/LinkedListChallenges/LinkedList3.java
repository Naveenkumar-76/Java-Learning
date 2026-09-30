package LinkedListChallenges;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		
//		Challenge 5 — Deque Situation
//
//		Create:
//
//		LinkedList<Integer> deque
//
//		Perform:
//
//		Add 20 at front
//		Add 30 at rear
//		Add 10 at front
//		Add 40 at rear
//
//		Then:
//
//		Remove one element from the front.
//		Remove one element from the rear.
//		Display the remaining deque.
//		Display its first and last elements.
//
//		Expected remaining:
//
//		[20, 30]
		
		LinkedList<Integer> deque = new LinkedList<>();
		
		deque.addFirst(20);
		deque.addLast(30);
		deque.addFirst(10);
		deque.addLast(40);
		
		System.out.println(deque);
		
		deque.pollFirst();
		
		System.out.println(deque);
		
		deque.pollLast();
		
		System.out.println(deque);
		
		System.out.println(deque.peekFirst());
		
		System.out.println(deque.peekLast());
		
//		Challenge 6 — Duplicate Detection
//
//		Given:
//
//		[10, 20, 30, 20, 40, 10, 50]
//
//		Using a LinkedList<Integer>:
//
//		Check whether 20 exists.
//		Find the first index of 20.
//		Find the last index of 20.
//		Remove only the first occurrence of 20.
//		Display the resulting list.
//
//		Expected:
//
//		[10, 30, 20, 40, 10, 50]
		
		LinkedList<Integer> detect = new LinkedList<>();
		
		detect.add(10);
		detect.add(20);
		detect.add(30);
		detect.add(20);
		detect.add(40);
		detect.add(10);
		detect.add(50);
		
		System.out.println(detect);
		
		System.out.println(detect.contains(20));
		
		System.out.println(detect.indexOf(20));
		
		System.out.println(detect.lastIndexOf(20));
		
		detect.remove(1);
		
		System.out.println(detect);
	}

}
