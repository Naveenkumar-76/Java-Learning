package OOPs;
// 10.
// Create:
// Parent → Employee (id, name)
// Child → Manager (salary)
// 👉 Requirements:
// Use super() to initialize parent values
// Override a method display()
// Use this keyword inside constructor

public class Inheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.display(15000.0);
    }
}
class Employee {
    int id;
    String name;
    void display(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println(id + " " + name);
    }
}
class Manager extends Employee {
    double salary;
    void display(double salary) {
        super.display(101, "Vanga");
    }
    Manager() {
        this.display(1000.0);
    }
}
