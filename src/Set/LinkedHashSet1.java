package Set;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
//		Challenge 1: Basic uniqueness + order
		
		LinkedHashSet<String> lang = new LinkedHashSet<>();
		
		lang.add("Java");
		lang.add("Sql");
		lang.add("Html");
		lang.add("Java");
		lang.add("Css");
		lang.add("Sql");
		lang.add("JavaScript");
		
		System.out.println(lang);
	
//		Challenge 2:Remove and re-add
		
		LinkedHashSet<Character> character = new LinkedHashSet<>();
		
		character.add('A');
		character.add('B');
		character.add('C');
		character.add('D');
		character.add('E');
		
		System.out.println(character);
		
		character.remove('C');
		
		System.out.println(character);
		
		character.add('C');
		
		System.out.println(character);
		
//		Existing element with addFirst()
		
		character.addFirst('C');
		
		System.out.println(character);
		
		character.addFirst('A');
		
		System.out.println(character.reversed());
		
		System.out.println(character);
		
	
	}

}
