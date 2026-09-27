package LinkedListChallenges;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
//		Challenge 1 — Student Registration
//
//		Create:
//
//		LinkedList<String> students
//
//		Perform these operations:
//
//		Add "Naveen", "Rahul", "Kiran", "Arjun".
//		Add "Suresh" at the beginning.
//		Add "Priya" at the end.
//		Replace "Kiran" with "Kavya".
//		Remove "Rahul".
//		Display the final list.
//
//		Expected final order:
//
//		[Suresh, Naveen, Kavya, Arjun, Priya]
		
		LinkedList<String> students = new LinkedList<>();
		
		students.add("Naveen");
		students.add("Rahul");
		students.add("Kiran");
		students.add("Arjun");
		
		System.out.println(students);
		
		students.addFirst("Suresh");
		students.addLast("Priya");
		
		System.out.println(students);
		
		students.set(3, "Kavya");
		
		System.out.println(students);
		
		students.remove(2);
		
		System.out.println(students);
		
//		Challenge 2 — Hospital Patient Queue
//
//		A hospital maintains patients in arrival order:
//
//		Ravi
//		Anil
//		Kiran
//		Suresh
//
//		Use a LinkedList<String> as a queue.
//
//		Perform:
//
//		Add all four patients.
//		Display the patient who will be treated next without removing them.
//		Treat/remove the first patient.
//		Treat/remove the next patient.
//		Add "Priya" to the rear.
//		Display the remaining queue.
//
//		Expected:
//
//		Remaining:
//		[Kiran, Suresh, Priya]
		
		LinkedList<String> queue = new LinkedList<>();
		
		queue.add("Ravi");
		queue.add("Anil");
		queue.add("Kiran");
		queue.add("Suresh");
		
		Iterator waiting_queue = queue.iterator();
		
		while(waiting_queue.hasNext()) {
			System.out.println(waiting_queue.next());
		}
		
		queue.peek();
		
		System.out.println(queue);
		
		queue.removeFirst();
		
		System.out.println(queue);
		
		queue.poll();
		
		System.out.println(queue);
		
		queue.addLast("Priya");
		
		System.out.println(queue);
	}

}
