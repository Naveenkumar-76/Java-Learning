package ArrayDequeChallenges;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class ArrayDeque3 {

	public static void main(String[] args) {
		
//		Challenge 7 — Task Processing
//		A system receives these tasks:
//		Task-A
//		Task-B
//		Task-C
//		Task-D
//
//		Normally tasks are added at the rear.
//		But URGENT-TASK arrives and must be placed at the front.
//		Then process all tasks from the front.
//
//		Expected processing order:
//		URGENT-TASK
//		Task-A
//		Task-B
//		Task-C
//		Task-D
		
		ArrayDeque<String> task = new ArrayDeque<>();
		
		task.addFirst("URGENT-TASK");
		task.addLast("Task-A");
		task.addLast("Task-B");
		task.addLast("Task-C");
		task.addLast("Task-D");
		
		while(!task.isEmpty()) {
			System.out.println(task.pollFirst());
		}
		
		System.out.println("Task is completed!");
		
//		Challenge 8 — Empty Deque Behavior
//		Create an empty deque and demonstrate the difference between:
//		peekFirst()
//		getFirst()
//		pollFirst()
//		removeFirst()
//
//		For each operation, determine what happens when the deque is empty.
//
//		Don't just print the methods' results. Your code should handle the operations appropriately
//		so the program doesn't terminate unexpectedly.

		System.out.println(task.peekFirst());
		
		try {
			System.out.println(task.getFirst());
		} catch(NoSuchElementException e) {
			System.out.println("Task is empty");
		}
		
		System.out.println(task.pollFirst());
		
		try {
			System.out.println(task.removeFirst());
		} catch(NoSuchElementException e) {
			System.out.println("Nothing to do operation!");
		}
		
//		Challenge 9 — Search and Remove
//		Given:
//		[101, 102, 103, 104, 105]
//		Check whether 103 exists.
//		If it exists, remove it.
//		Then print the resulting deque.
//		Do not use any index-based operation.
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		deque.addLast(101);
		deque.addLast(102);
		deque.addLast(103);
		deque.addLast(104);
		deque.addLast(105);
		
		System.out.println(deque);
		
		if(deque.contains(103)) 
			deque.remove(103);
		
		System.out.println(deque);
	}

}
