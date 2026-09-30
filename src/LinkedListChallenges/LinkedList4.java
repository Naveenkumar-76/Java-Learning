package LinkedListChallenges;

import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		
//		Challeng 7: Realistic Order Processing
//
//		An e-commerce system has pending orders:
//
//		ORD101
//		ORD102
//		ORD103
//		ORD104
//
//		Use a LinkedList<String>.
//
//		Perform:
//
//		Add all orders.
//		Process the first order.
//		Process the next order.
//		A priority order "ORD999" arrives and must be placed at the front.
//		Add "ORD105" normally at the rear.
//		Display the pending orders.
//		Display the next order to be processed without removing it.
//
//		Expected pending orders:
//
//		[ORD999, ORD103, ORD104, ORD105]
				
		LinkedList<String> order = new LinkedList<>();
		
		order.add("ORD101");
		order.add("ORD102");
		order.add("ORD103");
		order.add("ORD104");
		
		System.out.println(order);
		
		System.out.println(order.pollFirst());
		
		System.out.println(order.pollFirst());
		
		order.addFirst("ORD999");
		
		System.out.println(order);
		
		order.addLast("ORD105");
		
		System.out.println(order);
		
		System.out.println(order.peek());
			
//		Mixed Real-World Challenge
//
//		Create a LinkedList<String> representing a delivery route:
//
//		Bangalore
//		Tumkur
//		Chitradurga
//		Davanagere
//		Hubli
//
//		Now suppose:
//
//		"Nelamangala" needs to be added after "Bangalore".
//		"Chitradurga" is cancelled.
//		"Haveri" is added before "Hubli".
//		The first location has been completed and should be removed.
//		The final destination should be displayed without removing it.
//		Display the complete final route.
		
		LinkedList<String> route = new LinkedList<>();
		
		route.add("Banglore");
		route.add("Tumkur");
		route.add("Chitradurga");
		route.add("Davanagere");
		route.add("Hubli");
		
		System.out.println(route);
		
		int indexofbanglore = route.indexOf("Banglore");
		route.add(indexofbanglore + 1, "Nelamangala");
		
		System.out.println(route);
		
		route.remove("Chitradurga");
		
		System.out.println(route);
		
		int indexofhubli = route.indexOf("Hubli");
		route.add(indexofhubli, "Haveri");
		
		System.out.println(route);
		
		System.out.println(route.pollFirst());
		
		System.out.println(route.peekLast());
		
		System.out.println(route);
	}

}
