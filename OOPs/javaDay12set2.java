package OOPs;
//1️⃣ Laptop System, Create a class Laptop.
// Properties: brand, ram, price. Constructor initializes all values.
// Method: showLaptop(), Print all laptop details. Create 2 laptop objects.
class Laptop {
    String brand;
    int ram;
    double price;
    Laptop(String br, int r, double pr) {
        brand = br;
        ram = r;
        price = pr;
    }
    void showLaptop() {
        System.out.println("Brand: " + brand + ", Ram: " + ram + "GB, Price: " + price);
    }
}
//2️⃣ Movie Ticket System, Create a class MovieTicket.
// Properties: movieName, seatNumber, price. Constructor initializes values.
// Method: showTicket(), Print ticket details. Create 3 tickets.
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    MovieTicket(String mn, int sn, double pr) {
        movieName = mn;
        seatNumber = sn;
        price = pr;
    }
    void showTicket() {
        System.out.println("Movie Name: " + movieName + " Seat Number: " + seatNumber +
            " Price: " + price
        );
    }
}
//3️⃣ Rectangle Calculator, Create class Rectangle.
// Properties: length, width. Constructor initializes values.
// Methods: area(), perimeter(). Print area and perimeter.
class Rectangle {
    float length;
    float width;
    Rectangle(float l, float w) {
        length = l;
        width = w;
    }
    void area() {
        System.out.println("Rectanale Area is " + length * width);
    }
    void perimeter() {
        System.out.println("Perimeter is " + 2 * (width + length));
    }
}
//4️⃣ Online Course, Create class Course.
// Properties: courseName, duration, fee. Constructor initializes values.
// Method: showCourse(). Create 2 courses.
class Course {
    String courseName;
    int duration;
    double fee;
    Course(String cn, int d, double fe) {
        courseName = cn;
        duration = d;
        fee = fe;
    }
    void showCourse() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + 
        ", Fee: " + fee);
    }
}
//5️⃣ Employee Bonus, Create class Employee.
// Properties: name, salary. Constructor initializes values.
// Method: bonus(). Print 10% bonus of salary.
class Employee {
    String name;
    double salary;
    Employee(String n, double sal ) {
        name = n;
        salary = sal;
    }
    void bonus() {
        System.out.println("Hey " + name + ", Your's 10% bonus is " + salary / 10);
    }
}
//6️⃣ Temperature Converter, Create class Temperature.
// Property: celsius. Constructor initializes value.
// Method: toFahrenheit(), Formula: F = (C * 9/5) + 32
class Temperature {
    int celsius;
    Temperature(int c) {
        celsius = c;
    }
    void toFahrenheit() {
        System.out.println((celsius * 9 / 5) + 32);
    }
}
//7️⃣ Product Discount, Create class Product.
// Properties: name, price. Constructor initializes values.
// Method: discount(). Apply 20% discount and print new price.
class Discount {
    String productName;
    double price;
    Discount(String pn, double pr) {
        productName = pn;
        price = pr;
    }
    void discount() {
        System.out.println("product: " + productName);
        System.out.println("Present Price is " + price);
        System.out.println("20% Disount Price is " + price * 20 / 100);
        System.out.println("Current Price is " + (price - (price * 20 / 100)));
    }
}
//8️⃣ Circle Calculator, Create class Circle.
// Property: radius. Constructor initializes value.
// Methods: area(), circumference()
// Formula: Area = πr², Circumference = 2πr. (Use 3.14 for π)
class Circle {
    int radius;
    Circle(int r) {
        radius = r;
    }
    void area() {
        System.out.println("Area: " + (3.14) * (radius * radius));
    }
    void circumference() {
        System.out.println("Circumference: " + 2 * ((3.14) * (radius)));
    }
}
//9️⃣ Bus Ticket System, Create class BusTicket.
// Properties: passengerName, distance, farePerKm. Constructor initializes values.
// Method: totalFare(). Calculate: distance × farePerKm
class BusTicket {
    String passengerName;
    int distance;
    double farePerkm = 2;
    BusTicket(String pn, int d) {
        passengerName = pn;
        distance = d;
    }
    void totalFare() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("He/She is traveled distance is " + distance + "Km");
        System.out.println("He/She is traveled Amount " + (distance * farePerkm));
    }
}
//🔟 Student Grade Checker, Create class Student.
// Properties: name, marks. Constructor initializes values.
// Method: grade(). Rules: 90+  → A, 75+  → B, 60+  → C, else → Fail. Print grade.
class Student1 {
    String studentName;
    int marks;
    Student1(String sn, int m) {
        studentName = sn;
        marks = m;
    }
    void grade() {
        if(marks >= 90){
            System.out.println("Hey " + studentName +", you got 'A' grade");
        }else if(marks >= 75 && marks < 90){
            System.out.println("Hey " + studentName +", you got 'B' grade");
        }else if(marks >= 60 && marks < 75){
            System.out.println("Hey " + studentName +", you got 'C' grade");
        }else{
            System.out.println("Hey " + studentName +", you are Fail");
        }
    }
}
public class javaDay12set2 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Samsung Galaxy", 16, 67000);
        Laptop l2 = new Laptop("HP", 8, 45000);
        l1.showLaptop();
        l2.showLaptop();

        MovieTicket m1 = new MovieTicket("Toxic", 1, 499);
        MovieTicket m2 = new MovieTicket("Dhurandhar", 22, 399);
        MovieTicket m3 = new MovieTicket("Raajasaab", 12, 299);
        m1.showTicket();
        m2.showTicket();
        m3.showTicket();

        Rectangle r = new Rectangle(2.5f, 3.5f);
        r.area();
        r.perimeter();

        Course c1 = new Course("Java", 6, 15000);
        Course c2 = new Course("Python", 4, 12000);
        c1.showCourse();
        c2.showCourse();

        Employee e = new Employee("Indhu", 17500);
        e.bonus();

        Temperature t = new Temperature(35);
        t.toFahrenheit();

        Discount d = new Discount("Sugarcane", 30);
        d.discount();

        Circle c = new Circle(25);
        c.area();
        c.circumference();

        BusTicket bt = new BusTicket("ChatGpt", 30);
        bt.totalFare();

        Student1 student = new Student1("Agraja", 60);
        student.grade();
    }
}
