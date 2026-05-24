package OOPs;
//1️⃣ Basic Inheritance, Create: class Animal, method: eat().
// Create: class Dog, method: bark(). In main() call both methods.
/* class Animals {
    void eat() {
        System.out.println("Animals are eating");
    }
}
class Dogs extends Animals {
    void bark() {
        System.out.println("Dog is barking");
    }
}
//2️⃣ Vehicle System, Parent class: Vehicle, method: fuelType().
// Child class: Bike, method: speed(). Print both.
class Vehicles {

    void start() {
        System.out.println("Vehicle starts");
    }

}

class Cars extends Vehicles {

    void drive() {
        System.out.println("Car drives");
    }

}
// 3️⃣ Multilevel Inheritance, Create classes
// Person
//    ↓
// Employee
//    ↓
// Manager
// Methods: Person → name(), Employee → salary(), Manager → department()
// Call all methods.
class Person {
    void name(String name) {
        System.out.println("Name: " + name);
    }
}
class Employee extends Person {
    void salary(int salary) {
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    void department(String dept) {
        System.out.println("Department: " + dept);
    }
}
//4️⃣ Hierarchical Inheritance
// Shape
//   ↓
// Circle
// Rectangle
// Methods: Shape → display(), Circle → area(), Rectangle → area().
class Shape {
    void display() {
        System.out.println("A one floor building has: ");
    }
}
class Circle1 extends Shape {
    void area(int radius) {
        System.out.println("1. Circle with " + radius + " radius");
    }
}
class Rectangle2 extends Shape {
    void area(int width, int height) {
        System.out.println("2. Rectangle, width: " + width + " height: " + height);
    }
}
 */
//5. Rectangle Area, Class: Rectangle
//length, width. Method: setValues(int length, int width), Use this. Print area.
class Rectangle1 {
    int length, width;
    void setValues(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Area is " + length * width);
    }
}
//6. Constructor Using this(), Create two constructors: Car(), Car(String model).
//Call default constructor using this().
class Cars {
    Cars() {
        System.out.println("Default constructor");
    }
    Cars(String model) {
        this();
        System.out.println("Model: " + model);
    }
}
//7. Method Call Using this, Create methods: show(), display().
// call display() using this.display() inside show().
class ShowYour {
    void display() {
        System.out.println("Display your ticket..?");
    }
    void show() {
        this.display();
        System.out.println("This is my ticket");
    }
}
/*8. Object Self-Reference (Understanding this)

Create a class Employee.

Inside a method compare(Employee e) check:

If the current object and the passed object are the same object.

Example scenario:

Employee e1 = new Employee();
Employee e2 = new Employee();

e1.compare(e1);   // same object
e1.compare(e2);   // different object

Expected Output:

Same object
Different object */
class Employeee {

    void compare(Employeee e) {
        if (this == e) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("Different objects.");
        }
    }
}

/*
2️⃣ Constructor Chain Logic

Create class Student

Constructors:

Student()
Student(String name)
Student(String name, int age)

Rules:

Student() prints "Default student created"

Student(String name) should call default constructor

Student(String name, int age) should call second constructor

Expected Output

Default student created
Student Name: Naveen
Age: 21

👉 Use constructor chaining with this().

3️⃣ Returning Current Object (Advanced Thinking)

Create class Counter.

Variables:

count

Method:

increment()

Each call should:

Increase count

Return current object using this

Example usage:

Counter c = new Counter();

c.increment().increment().increment();

c.display();

Expected Output

Count = 3

👉 Hint: Method should return Counter type.
 */
public class Challengesset {
    public static void main(String[] args) {

     /*    Dogs in = new Dogs();  
        in.eat();   
        in.bark();

        Cars c = new Cars();
        c.start();
        c.drive();

        Manager empDeatails = new Manager();
        empDeatails.name("Bharath");
        empDeatails.salary(50000);
        empDeatails.department("Web Developer");

        Circle1 circle = new Circle1();
        Rectangle2 rect = new Rectangle2();
        circle.display();
        circle.area(25);
        rect.area(14, 12);
 */
        Rectangle1 rt = new Rectangle1();
        rt.setValues(5, 4);

        new Cars("Lamborgini");

        ShowYour sy = new ShowYour();
        sy.show();

        Employeee e1 = new Employeee();
        Employeee e2 = new Employeee();
        e1.compare(e1);   
        e1.compare(e2); 
    }
}
