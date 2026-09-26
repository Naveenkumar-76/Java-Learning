package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeAlMethods {

	public static void main(String[] args) {
		
//		Practice 4 — addAll() and addAll(index, ...)
		
		ArrayList al1 = new ArrayList();
		
		al1.add("java");
		al1.add("sql");
		al1.add("html");
		
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		
		al2.add("css");
		al2.add("javascript");
		
		al1.addAll(1, al2);
		System.out.println(al1);
		
		ArrayList al3 = new ArrayList();
		
		al3.add("spring");
		al3.add("hibernate");
		
		al1.addAll(1, al3);
		System.out.println(al1);
		
//		Practice 5,6 — containsAll(),removeAll() and retainAll()
			
		ArrayList al4 = new ArrayList();
		
		al4.add("java");
		al4.add("sql");
		al4.add("html");
		al4.add("css");
		
		ArrayList al5 = new ArrayList();
		
		al5.add("java");
		al5.add("html");
		
		System.out.println(al4.containsAll(al5));
		
		al5.set(1, "python");
		
		System.out.println(al4.containsAll(al5));
		
		ArrayList al6 = new ArrayList();
		
		al6.add("sql");
		al6.add("html");
		
		System.out.println(al4);
		
		al4.removeAll(al6);
		System.out.println(al4);
		
		ArrayList al7 = new ArrayList();
		
		al7.add("sql");
		al7.add("css");
		
		al4.retainAll(al7);
		System.out.println(al4);
		
//		Practice 7 — lastIndexOf(), isEmpty(), clear()
		
		ArrayList al8 = new ArrayList();
		
		al8.add("java");
		al8.add("sql");
		al8.add("java");
		al8.add("html");
		al8.add("java");
		
		System.out.println(al8.indexOf("java"));
		System.out.println(al8.lastIndexOf("java"));
		System.out.println(al8.isEmpty());
		
		al8.clear();
		
		System.out.println(al8.isEmpty());
		
//		Challenge 8 — subList() and toArray()
		
		ArrayList al9 = new ArrayList();
		
		al9.add("java");
		al9.add("sql");
		al9.add("html");
		al9.add("css");
		al9.add("javascript");
		
		List sub_al = al9.subList(1, 4);
		
		System.out.println(sub_al);
		
		Object[] array = al9.toArray();
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
//		Challenge 9 — Sorting
		ArrayList al10 = new ArrayList();
		
		al10.add(50);
		al10.add(10);
		al10.add(40);
		al10.add(20);
		al10.add(30);
		
		Collections.sort(al10);
		System.out.println(al10);
		
	}

}
