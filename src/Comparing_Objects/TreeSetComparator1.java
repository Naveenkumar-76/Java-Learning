package Comparing_Objects;

import java.util.Comparator;
import java.util.TreeSet;

class Student2TreeSetComparator1 implements Comparator<Student1> {
	
	@Override 
	public int compare(Student1 s1, Student1 s2 ) {
		
		int result1 = Double.compare(s2.getMarks(), s1.getMarks());
		
		if(result1 != 0) {
			return result1;
		}
		
		int result2 = s1.getName().compareTo(s2.getName());
		
		if(result2 != 0) {
			return result2;
		}
		
		return Integer.compare(s1.getId(), s2.getId());
	}
}
class Student1 {
	private int id;
	private String name;
	private double marks;
	public Student1(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + marks;
	}
	
}
public class TreeSetComparator1 {

	public static void main(String[] args) {
		
		Student2TreeSetComparator1 sts = new Student2TreeSetComparator1();
		
		Student1 s1 = new Student1(103, "Kumar", 92);
		Student1 s2 = new Student1(101, "Naveen", 87);
		Student1 s3 = new Student1(105, "Ajay", 92);
		Student1 s4 = new Student1(102, "Ajay", 85);
		Student1 s5 = new Student1(104, "Kumar", 92);
		
		TreeSet<Student1> std = new TreeSet<Student1>(sts);
		
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		std.add(s5);
		
		System.out.println(std);
	}

}
