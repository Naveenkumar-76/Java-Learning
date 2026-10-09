package Comparing_Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentMarksComparator2 implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		
		int result1 =  Float.compare(s2.getMarks(), s1.getMarks());

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

public class CompararatorStudent2  {

	public static void main(String[] args) {
		
		StudentMarksComparator2 sm = new StudentMarksComparator2();
		
		Student sid1 = new Student(103, "Kumar", 92);
		Student sid2 = new Student(101, "Naveen", 87);
		Student sid3 = new Student(105, "Ajay", 92);
		Student sid4 = new Student(102, "Ajay", 85);
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(sid1);
		students.add(sid2);
		students.add(sid3);
		students.add(sid4);
		
		Collections.sort(students, sm);
		
		System.out.println(students);
	}

}
