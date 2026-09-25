package ArrayList;

import java.util.ArrayList;

public class TraverseArList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		al.set(2, 35);
		al.remove(Integer.valueOf(40));
		
		System.out.println(al);
		
		System.out.println(al.contains(50));
		
		System.out.println(al.size());
	
//	    Traverse using for loop 
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		
		System.out.println();
//	    Traverse using for loop 
		
		for(Object i : al) {
			System.out.print(i + " ");
		}
		
		ArrayList al1 = new ArrayList();
		
		al1.add("java");
		al1.add("sql");
		al1.add("html");
		al1.add("css");
		
		al1.add(2, "javascript");
		
		al1.remove(1);
		
		System.out.println(al1);
		
		System.out.println(al1.indexOf("css"));
		
		
	}

}
