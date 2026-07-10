package Inheritance;
import java.util.Scanner;
/*	Problem: Vehicle → Car
	
	Create
	
	Vehicle
	
	Variables
	
	brand
	speed
	
	Method
	
	displayVehicleDetails()
	
	Now create
	
	Car extends Vehicle
	
	Additional variable
	
	fuelType
	
	Override
	
	displayVehicleDetails()
	
	Requirements
	
	Call parent method using super
	Print car details
	Expected Output
	Brand : Tata
	Speed : 180
	
	Fuel Type : Petrol*/
class Vehicle {
	private String brand;
	private int speed;
	public Vehicle(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	public String getBrand() {
		return brand;
	}
	public int getSpeed() {
		return speed;
	}
	public String displayVehicleDetails() {
		return "Brand: " + brand + "\nSpeed: " + speed;
	}
}
class Car extends Vehicle {
	private String fuelType;
	public Car(String brand, int speed, String fuelType) {
		super(brand, speed);
		this.fuelType = fuelType;
	}
	public String getFuel() {
		return fuelType;
	}
	@Override
	public String displayVehicleDetails() {
		return super.displayVehicleDetails() + "\nFuel Type: " + fuelType;
 	}
}
public class Problem_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the car brand name: ");
		String brand = sc.nextLine();
		System.out.print("Enter the speed of car: ");
		int speed = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the fuel type of car: ");
		String fuelType = sc.nextLine();
		
		Car c = new Car(brand, speed, fuelType);
		System.out.println(c.displayVehicleDetails());
		sc.close();
	}

}
