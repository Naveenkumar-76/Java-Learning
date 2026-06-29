package Loops;
import java.util.Scanner;
class Restaurant {
	private int id;
	private String name, email, address;
	private long phone;
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int id() {
		return id;
	}
	public String name() {
		return name;
	}
	public String email() {
		return email;
	}
	public long phone() {
		return phone;
	}
	public String address() {
		return address;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Restaurant rest[] = new Restaurant[n];
		
		for(int i = 0; i < rest.length; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine(), email = sc.nextLine();
			long phone = sc.nextLong();
			sc.nextLine();
			String address = sc.nextLine();
			
			rest[i] = new Restaurant();
			rest[i].setAddress(address);
			rest[i].setPhone(phone);
			rest[i].setId(id);
			rest[i].setEmail(email);
			rest[i].setName(name);
		}
		for(int i = 0; i < rest.length; i++) {
			System.out.println(rest[i].id() + "\n" + rest[i].name() + "\n" + rest[i].email() + "\n" + 
					rest[i].phone() + "\n" + rest[i].address());
		}
		sc.close();

	}

}
