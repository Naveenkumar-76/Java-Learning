package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(105, "Java");
		tm.put(101, "HTML");
		tm.put(110, "SQL");
		tm.put(103, "CSS");
		tm.put(108, "JavaScript");
		tm.put(115, "Python");
		
//		Challenge 1 — Basic navigation
		
//		Smallest key
//		Largest key
//		Key immediately smaller than 108
//		Key immediately greater than 108
//		Greatest key <= 109
//		Smallest key >= 109
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.lowerKey(108));
		System.out.println(tm.higherKey(108));
		System.out.println(tm.floorKey(109));
		System.out.println(tm.ceilingKey(109));
		
//		Challenge 2 — Entry navigation
		
//		Find the complete key-value pair for:
//
//		First entry
//		Last entry
//		Entry immediately below 110
//		Entry immediately above 110
//		Entry at or below 109
//		Entry at or above 109
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastEntry());
		System.out.println(tm.lowerEntry(110));
		System.out.println(tm.higherEntry(110));
		System.out.println(tm.floorEntry(109));
		System.out.println(tm.ceilingEntry(109));
		
//		Challenge 3 — Range
//
//		A. Keys less than 108
//		B. Keys greater than or equal to 108
//		C. Keys from 103 to 110, including both
		
		System.out.println(tm.headMap(108));
		System.out.println(tm.tailMap(108));
		System.out.println(tm.subMap(103, true, 110, true));
		
//		Challenge 4 — Remove first and last
		
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		
//		Challenge 5 — Traversal
//
//		Write three different traversals:
		
//		A. Print only keys
		Set<Integer> key = tm.keySet();
		
		Iterator<Integer> itr = key.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		B. Print key + value
		Iterator<Map.Entry<Integer, String>> comb = tm.entrySet().iterator();
		
		while(comb.hasNext()) {
			System.out.println(comb.next());
		}

//		C. Print in descending order
		for(Map.Entry<Integer, String> entry : tm.descendingMap().entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
//		Challenge 6 — Map.Entry modification

		for(Map.Entry<Integer, String> modify : tm.entrySet()) {
			Integer ki = modify.getKey();
			if(ki.equals(110)) {
				modify.setValue("MySql");
			}
		}
		
		System.out.println(tm);
	}

}
