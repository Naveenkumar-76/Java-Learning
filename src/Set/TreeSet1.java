package Set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
//		Challenge 1 — Navigation
//		Given:
//		[10, 20, 30, 40, 50]
//
//		For the value 35, find:
//		greatest element smaller than 35
//		greatest element smaller than or equal to 35
//		smallest element greater than or equal to 35
//		smallest element greater than 35
		
		TreeSet<Integer> nav = new TreeSet<>();
		
		nav.add(30);
		nav.add(40);
		nav.add(20);
		nav.add(10);
		nav.add(50);
		
		System.out.println(nav.lower(30));
		System.out.println(nav.floor(30));
		System.out.println(nav.ceiling(30));
		System.out.println(nav.higher(30));
		
		System.out.println(nav.floor(9));
		System.out.println(nav.higher(50));
		
//		Challenge 2 — Reverse traversal
		
		Iterator<Integer> itr = nav.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		Challenge 3 — Range operations
		
//		Elements less than 40
//		Elements greater than or equal to 40
//		Elements from 20 to 60, excluding 60
//		Elements from 20 to 60, including both
		
		nav.add(70);
		nav.add(60);
		
		System.out.println(nav.headSet(40));
		System.out.println(nav.tailSet(40));
		System.out.println(nav.subSet(20, 60));
		System.out.println(nav.subSet(20, true, 60, true));
		
//		Challenge 4 — Real-world situation
//		You have employee salaries:
//		45000
//		30000
//		75000
//		50000
//		60000
//		30000
//		90000
//		Store them in a TreeSet.
		
//		Find:
//
//			All unique salaries in sorted order
//			Lowest salary
//			Highest salary
//			Salary immediately below 60000
//			Salary immediately above 60000
		
		TreeSet<Integer> emp_sal = new TreeSet<>();
		
		emp_sal.add(45000);
		emp_sal.add(30000);
		emp_sal.add(75000);
		emp_sal.add(50000);
		emp_sal.add(60000);
		emp_sal.add(30000);
		emp_sal.add(90000);
		
		System.out.println(emp_sal);
		
		System.out.println(emp_sal.first());
		
		System.out.println(emp_sal.last());
		
		System.out.println(emp_sal.lower(60000));
		
		System.out.println(emp_sal.higher(60000));
		
		
	}

}
