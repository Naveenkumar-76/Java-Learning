package Map;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

		map.put(101, "Java");
		map.put(102, "SQL");
		map.put(103, "HTML");
		map.put(104, "CSS");
		
		System.out.println(map);
		
//		put is replace the old key value to new value
		map.put(102, "MySQL");
		
		System.out.println(map);
		
//		put again overwritten
		map.put(102, "SQL");
		
//		putIfAbsent return value of existed key
		System.out.println(map.putIfAbsent(102, "MySQL"));
		
//		removed key 103
		map.remove(103);
		
//		putIfAbsent return the null and add the given key-value if doesn't exists, 
//		if it exists it will return the original key value. basically it is doesn't return it adds
		System.out.println(map.putIfAbsent(103, "HTML"));
		
		System.out.println(map);
		
//		getOrDefault method will return the existed key value if it exist,
//		if it doesn't exist, it returns you provided value.
		System.out.println(map.getOrDefault(101, "Unknown"));
		System.out.println(map.getOrDefault(105, "Unknown"));
		
		
	}

}
