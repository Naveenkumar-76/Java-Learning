package Comparing_Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparatorStudent1 implements Comparator<Student> {
	
	@Override
	public int compare(Student s1, Student s2) {
		
		int resultMarks = Float.compare(s2.getMarks(), s1.getMarks());
		
		if(resultMarks != 0) {
			return resultMarks;
		}
		
		int resultName = s1.getName().compareTo(s2.getName());
		
		if(resultName != 0) {
			return resultName;
		}
		
		return Integer.compare(s1.getId(), s2.getId());
	}
}


class Student implements Comparable<Student> {
	private int id;
	private String name;
	private float marks;
	public Student(int id, String name, float marks) {
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
	public float getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + marks;
	}
	
	@Override 
	public int compareTo(Student sid) {
		return Integer.compare(this.id, sid.getId());
	}
}

public class CompareToStudent1  {

	public static void main(String[] args) {
		
		ComparatorStudent1 crr = new ComparatorStudent1();

		Student sid1 = new Student(103, "Kumar", 92);

		Student sid2 = new Student(101, "Naveen", 87);

		Student sid3 = new Student(105, "Ajay", 92);

		Student sid4 = new Student(102, "Ajay", 85);


		ArrayList<Student> students = new ArrayList<>();

		students.add(sid1);

		students.add(sid2);

		students.add(sid3);

		students.add(sid4);

		Collections.sort(students);

		System.out.println(students);
		
		Collections.sort(students, crr);
		
		System.out.println(students);

	}

}
