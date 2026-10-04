package Set;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		
//		Challenge 9 — Realistic: Login Usernames
//		Suppose a website receives registration usernames:
//		naveen
//		rahul
//		sneha
//		naveen
//		kiran
//		rahul
//		anil
		
//		Use a HashSet to determine whether a newly entered username already exists.
//		Test with:
//		sneha
//		mahesh
		
//		Expected behavior:
//		sneha  → Already registered
//		mahesh → Available
		
		HashSet<String> user = new HashSet<>();
		
		user.add("naveen");
		user.add("rahul");
		user.add("sneha");
		user.add("naveen");
		user.add("kiran");
		user.add("rahul");
		user.add("anil");
		
		System.out.println(user);
		
		System.out.println(user.add("sneha") ? "Available" : "Already registered");
		
		System.out.println(user.add("mahesh") ? "Available" : "Already registered");
		
//		Challenge 10 — Real-world Combination
//		Create a HashSet containing these order IDs:
//		1001, 1002, 1003, 1002, 1004, 1005, 1003, 1006
//
//		Perform:
//		Find unique order count
//		Check whether order 1004 exists
//		Remove order 1003
//		Check whether order 1003 still exists
//		Print final orders
		
		HashSet<Integer> order_id = new HashSet<>();
		
		order_id.add(1001);
		order_id.add(1002);
		order_id.add(1003);
		order_id.add(1002);
		order_id.add(1004);
		order_id.add(1005);
		order_id.add(1003);
		order_id.add(1006);
		
		System.out.println(order_id);
		
		System.out.println(order_id.size() + " orders");
		
		System.out.println(order_id.contains(1004));
		
		System.out.println(order_id.remove(1003));
		
		System.out.println(order_id.contains(1003));
		
		System.out.println(order_id);
	}

}
