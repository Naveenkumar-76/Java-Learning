package Comparing_Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentMarksComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {

		int result = Float.compare(s2.getMarks(), s1.getMarks());

		if(result == 0) {

			return Integer.compare(s1.getId(), s2.getId());

		}

		return result;
	}
}

public class CompararatorStudent1  {

	public static void main(String[] args) {
		
		StudentMarksComparator sm = new StudentMarksComparator();
		
		Student sid1 = new Student(103, "Kumar", 85.0f);
		Student sid2 = new Student(101, "Naveen", 92.0f);
		Student sid3 = new Student(105, "Kumar", 92.0f);
		Student sid4 = new Student(102, "Ajay", 88.0f);
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(sid1);
		students.add(sid2);
		students.add(sid3);
		students.add(sid4);
		
		Collections.sort(students, sm);
		
		System.out.println(students);
	}

}