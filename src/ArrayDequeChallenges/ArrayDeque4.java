package ArrayDequeChallenges;

import java.util.ArrayDeque;

public class ArrayDeque4 {

	public static void main(String[] args) {
//		Challenge 10 — Mini Real-World Problem
//		You have a deque representing pending jobs:
//		Job1
//		Job2
//		Job3
//		Job4
		
//		Rules:
//		Normal jobs are added at the rear.
//		An urgent job is added at the front.
//		The oldest/front job is processed.
//		You should be able to see the next job without removing it.
//		At the end, report whether any jobs are still pending.
//
//		Implement the complete flow.
		
		ArrayDeque<String> jobs = new ArrayDeque<>();
		
		jobs.addFirst("URGENT Job0");
		jobs.addLast("Job1");
		jobs.addLast("Job2");
		jobs.addLast("Job3");
		jobs.addLast("Job4");
		
		System.out.println(jobs);
		
		System.out.println("Next job: " + jobs.peekFirst());
		System.out.println(jobs.pollFirst());
		
		System.out.println("Pending jobs: " + jobs);
		
//		Final ArrayDeque Challenge
//		Start with:
//		[]
//		Perform this sequence:
//		Add 20 at rear
//		Add 30 at rear
//		Add 10 at front
//		Add 40 at rear
//		Remove front
//		Add 5 at front
//		Remove last
//		Add 50 at rear
//		After every operation, determine the state of the deque.
		
//		Finally, print:
//		Final deque
//		First element
//		Last element
//		Size
//		Whether it is empty
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		System.out.println(deque);
		
		deque.addLast(20);
		deque.addLast(30);
		deque.addFirst(10);
		deque.addLast(40);
		
		System.out.println(deque);
		
		deque.removeFirst();
		
		System.out.println(deque);
		
		deque.addFirst(5);
		
		deque.removeLast();
		
		System.out.println(deque);
		
		deque.addLast(50);
		
		System.out.println("Final deque: " + deque);
		
		System.out.println("First element: " + deque.getFirst());
		
		System.out.println("Last element: " + deque.getLast());
		
		System.out.println("Deque size: " + deque.size());
		
		System.out.println("Deque empty status: " + deque.isEmpty());
	}

}
