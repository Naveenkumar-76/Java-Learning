package Inheritance;
import java.util.Scanner;
/*	Class Structure
	Person
	      ↓
	Employee
	      ↓
	Manager
	Person
	
	Variables
	
	name
	age
	
	Method
	
	displayDetails()
	Employee
	
	Additional variables
	
	employeeId
	salary
	
	Override
	
	displayDetails()
	
	Call
	
	super.displayDetails();
	Manager
	
	Additional variable
	
	department
	
	Override again
	
	displayDetails()
	
	Again call
	
	super.displayDetails();
	Expected Output
	Name : Naveen
	Age : 21
	
	Employee ID : 101
	Salary : 55000
	
	Department : Development*/
class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void displayDetails() {
		System.out.println("Name: " + getName() + "\nAge: " + getAge());
	}
}
class Employee extends Person {
	private int employeeId;
	private float salary;
	public Employee(String name, int age, int employeeId, float salary) {
		super(name, age);
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public float getSalary() {
		return salary;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee Id: " + getEmployeeId() + "\nSalary: " + getSalary());
	}
}
class Manager extends Employee {
	private String department;
	public Manager(String name, int age, int employeeId, float salary, String department) {
		super(name, age, employeeId, salary);
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Department: " + getDepartment());
	}
}
public class Problem_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name: ");
		String name = sc.nextLine();
		System.out.print("Enter the Age: ");
		int age = sc.nextInt();
		System.out.print("Enter the EmployeeId: ");
		int employeeId = sc.nextInt();
		System.out.print("Enter the Salary: ");
		float salary = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter the Department: ");
		String department = sc.nextLine();
		
		Manager m = new Manager(name, age, employeeId, salary, department);
		m.displayDetails();
		sc.close();
	}

}
