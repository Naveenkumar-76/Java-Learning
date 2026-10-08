package Comparing_Objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	private int id;
	private String name, dept;
	private double salary;
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + dept + " " + salary;
	}
	
}
public class ComparatorEmployee implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		
		int resultDept = e1.getDept().compareTo(e2.getDept());
		
		if(resultDept != 0)
			return resultDept;
		
		int resultSalary = Double.compare(e2.getSalary(), e1.getSalary());
		
		if(resultSalary != 0)
			return resultSalary;
		
		int resultName = e1.getName().compareTo(e2.getName());
		
		if(resultName != 0) 
			return resultName;
		
		return Integer.compare(e1.getId(), e2.getId());
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee(103, "Kumar", "IT", 65000);
		Employee e2 = new Employee(101, "Naveen", "HR", 55000);
		Employee e3 = new Employee(105, "Ajay", "IT", 75000);
		Employee e4 = new Employee(102, "Ravi", "HR", 60000);
		Employee e5 = new Employee(104, "Arun", "IT", 75000);
		Employee e6 = new Employee(106, "Ajay", "IT", 75000);
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		
		ComparatorEmployee comparator = new ComparatorEmployee();
		
		Collections.sort(employees, comparator);
		
		System.out.println(employees);
	}

}
