package Encapsulation;
	/* Problem: Student Management
	
	Create a class named Student.
	
	Requirements:
	Private variables:
	studentId
	studentName
	marks
	Create:
	Parameterized constructor
	Getter methods
	Setter methods
	The setter for marks should accept values only between 0 and 100.
	
	If the value is invalid, print:
	
	Invalid Marks
	
	and do not update the variable.
	
	In main():
	Student s = new Student(101, "Naveen", 85);
	
	Print all details.
	
	Then try:
	setMarks(120);
	
	Print marks again.
	Expected Output
	Student ID : 101
	Student Name : Naveen
	Marks : 85
	
	 */
class Student {
	private int id, marks;
	private String name;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		setMarks(marks);
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int marks) {
		if(marks >= 0 && marks <= 100) {
			this.marks = marks;
		} else {
			System.out.println("Invalid Marks");
		}
	}
	public int getId() {
		return id;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
}
public class StudentManagement {
	public static void main(String[] args) {
		
		Student s = new Student(101, "Naveen", 85);
		
		System.out.println("Student Id: " + s.getId() + "\nStudent Name: " + s.getName() + 
				"\nStudent Marks: " + s.getMarks());
		
		s.setMarks(120);
		System.out.println(s.getMarks());
	}
}