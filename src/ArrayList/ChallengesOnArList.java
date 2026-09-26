package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ChallengesOnArList {

	public static void main(String[] args) {
		
//		Challenge 10A — Realistic situation
//		[101, 102, 103, 104, 105]
//
//				These are student IDs.
//
//				Perform:
//
//			1.	Add student 106.
//			2.	Remove student 103.
//			3.	Insert student 107 at index 2.
//			4.	Check whether student 105 exists.
//			5.	Find the index of student 104.
//			6.	Print all student IDs using an enhanced iterator loop.
//			7.	Print the total number of students.
		
		ArrayList student = new ArrayList();
		
		student.add(101);
		student.add(102);
		student.add(103);
		student.add(104);
		student.add(105);
		student.add(106);
		
		student.remove(2);
		System.out.println(student);
		
		student.add(2, 107);
		System.out.println(student.contains(105));
		
		System.out.println(student.indexOf(104));
		
		Iterator itr = student.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println("\n" + student.size() + " students");
		
//		Challenge 10B - Write one program that starts with:
//
//			[Java, SQL, HTML, CSS, JavaScript]
//
//			Perform all of these:
//
//			1.Add "Spring" at the end.
//			2.Insert "Hibernate" at index 2.
//			3.Replace "CSS" with "React".
//			4.Remove "SQL" by value.
//			5.Check whether "Java" exists.
//			6.Find the last index of "Java".
//			7.Print the size.
//			8.Traverse using listIterator.
//			9.Create a sublist containing three elements.
//			10.Convert the final list to an array.
//			11.Sort the list only if you can handle the element type correctly.
		
		ArrayList lang = new ArrayList();
		
		lang.add("java");
		lang.add("sql");
		lang.add("html");
		lang.add("css");
		lang.add("javascript");
		
		lang.add("spring");
		
		System.out.println(lang);
		
		lang.add(2, "hibernate");
		
		System.out.println(lang);
		
		lang.set(4, "react");
		
		System.out.println(lang);
		
		lang.remove(1);
		
		System.out.println(lang);
		
		System.out.println(lang.contains("java"));
		
		System.out.println(lang.lastIndexOf("java"));
		
		System.out.println(lang.size());
		
		ListIterator ltr = lang.listIterator(); 
		
		while(ltr.hasNext()) {
			System.out.print(ltr.next() + " ");
		}
		
		System.out.println();
		
		List sub_lang = lang.subList(1, 4);
		
		System.out.println(sub_lang);
		
		Object[] ar = lang.toArray();
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		System.out.println();
		
		Collections.sort(lang);
		
		System.out.println(lang);
	}

}
