package Comparing_Objects;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class StudentTreeMapComparator implements Comparator<Student1> {
	@Override
	public int compare(Student1 s1,  Student1 s2) {
		int result = Double.compare(s2.getMarks(), s1.getMarks());
		if(result != 0) {
			return result;
		}
		int result2 = s1.getName().compareTo(s2.getName());
		if(result2 != 0) {
			return result2;
		}
		return Integer.compare(s1.getId(), s2.getId());
	}
	public static void main(String[] args) {
		
		StudentTreeMapComparator stmc = new StudentTreeMapComparator();
		
		Student1 s1 = new Student1(103, "Kumar", 92);
		Student1 s2 = new Student1(101, "Naveen", 87);
		Student1 s3 = new Student1(105, "Ajay", 92);
		Student1 s4 = new Student1(102, "Ajay", 85);
		Student1 s5 = new Student1(104, "Kumar", 92);
		
		TreeMap<Student1, String> tmap = new TreeMap<>(stmc);
		
		tmap.put(s1, "Java");
		tmap.put(s2, "SQL");
		tmap.put(s3, "HTML");
		tmap.put(s4, "CSS");
		tmap.put(s5, "JavaScript");
		
		System.out.println(tmap);
		
		for(Map.Entry<Student1, String> entry : tmap.entrySet()) {

		    System.out.println(entry.getKey() + " -> " + entry.getValue());

		}
		
	}
	
}
