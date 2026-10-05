package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		
//		Challenge 5 — Nearest available price
//		An online store has product prices:
//		499
//		799
//		999
//		1499
//		1999
//		2499
//
//		A customer has a budget of:
//
//		1200
//
//		Using TreeSet, find:
//
//		Highest price within the budget
//		Lowest price above the budget
		
		TreeSet<Integer> price = new TreeSet<>();
		
		price.add(499);
		price.add(799);
		price.add(999);
		price.add(1499);
		price.add(1999);
		price.add(2499);
		
		System.out.println(price.floor(1200));
		System.out.println(price.ceiling(1200));
		
//		Challenge 6 — TreeSet + Iterator removal
//		Create:
//		[10, 20, 30, 40, 50]
//
//		Use an Iterator to traverse the TreeSet.
//
//		When you encounter 30, remove it using the Iterator.
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(30);
		ts.add(10);
		ts.add(40);
		ts.add(20);
		ts.add(50);
		
		Iterator<Integer> traverse = ts.iterator();
		
		while(traverse.hasNext()) {
			Integer value = traverse.next();
			if(value.equals(30)) {
				traverse.remove();
			}
		}
		
		System.out.println(ts);
		
//		Challenge 7 — Mixed TreeSet task
//		Create:
//		[15, 5, 25, 10, 30, 20, 35]
//
//		Perform all of these:
//
//		Print the TreeSet.
//		Print the first element.
//		Print the last element.
//		Find lower(22).
//		Find floor(22).
//		Find ceiling(22).
//		Find higher(22).
//		Print elements below 25.
//		Print elements from 10 through 30, including both.
//		Print the TreeSet in descending order.
//		Remove the first element using pollFirst().
//		Remove the last element using pollLast().
//		Print the final TreeSet.
		
		TreeSet<Integer> task = new TreeSet<>();
		
		task.add(15);
		task.add(5);
		task.add(25);
		task.add(10);
		task.add(30);
		task.add(20);
		task.add(35);
		
		System.out.println(task);
		
		System.out.println(task.getFirst());
		
		System.out.println(task.getLast());
		
		System.out.println(task.lower(22));
		
		System.out.println(task.floor(22));
		
		System.out.println(task.ceiling(22));
		
		System.out.println(task.higher(22));
		
		System.out.println(task.headSet(25));
		
		System.out.println(task.subSet(10, true, 30, true));
		
		System.out.println(task.reversed());
		
		System.out.println(task.pollFirst());
		
		System.out.println(task.pollLast());
		
		System.out.println(task);
		
	}

}
