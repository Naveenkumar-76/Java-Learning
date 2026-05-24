package OOPs;
//1️. Create a class Car, Variables: brand, speed. Method: showInfo()
// Print brand and speed.
/* class Car {
    String brand = "Lamborgini";
    int speed = 140;
    void showInfo() {
        System.out.println(brand);
        System.out.println(speed);
    }
}
//2️. Create class Student, Variables: name, marks. Method: display()
// Print student details.
class Student {
    String name = "Naveen";
    int marks = 67;
    void disply() {
        System.out.println(name);
        System.out.println(marks);
    }
}
//3️. Create class Mobile, Variables: brand, price, battery. Method: showSpecs()
class Mobile {
    String brand = "Samsung", battery = "6000 mah";
    int price = 60000;
    void showSpecs() {
        System.out.println(brand + " battery: " + battery);
        System.out.println(price);
    }
}
//4️. Create class Book, Variables: title, author, pages, Method: showBook()
class Book {
    String title = "Sarpanch", author = "Naveenkumar Yadav";
    int pages = 11;
    void showBook() {
        System.out.println(title+ " writen By " + author + " pages " + pages);
    }
}
//5️. Create class BankAccount, Variables: accountHolder, balance. 
// Methods: deposit(),withdraw()
class BankAccount {
    String accountHolder = "Naveen";
    int Balance = 10000;
    void deposit(int n) {
        Balance += n;
        System.out.println("AccountHolder: " + accountHolder);
        System.out.println("After deposite " + n + " your balance is " + Balance);
    }
    void withdraw(int n) {
        Balance -= n;
        System.out.println("AccountHolder: " + accountHolder);
        System.out.println("After withdraw " + n + " your balance is " + Balance);
    }
}
  */

//1️⃣ Student Constructor, Create class: Student: name, age.
//Parameterized constructor: Student(String name, int age)
//Create 2 students and display.
class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Bharath";
        age = 22;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
//2️⃣ Car Constructor, Class: Car, brand, speed.
//Constructor: Car(String brand, int speed), Create 3 cars.
class Car {
    String brand;
    int speed;
    Car(String br, int sped) {
        brand = br;
        speed = sped;
    }
    void carDetails(){
        System.out.println("Brand -> " + brand + " Speed -> " + speed);
    }
}
//3️⃣ Book Example, Class: Book, title, author, pages. 
// Constructor to initialize values.
class Book {
    String title;
    String author;
    int pages;
    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }
    void book() {
        System.out.println(title + " Written By " + author + " -> " + pages + " Pages"); 
    }
}
//4️⃣ Bank Account, Class: BankAccount, holder, balance.
// Constructor sets values.
class BankAccount {
    String holder;
    double balance;
    BankAccount(String h, double b) {
        holder = h;
        balance = b;
    }
    void bankDetails() {
        System.out.println("Holder Name: " + holder + ", Balance: " + balance);
    }
}
//5️⃣ Mobile Store, Class: Mobile, brand, price, battery.
//Constructor initializes all values.
class Mobile {
    String brand;
    float price;
    int battery;
    Mobile(String br, int p, int b) {
        brand = br;
        price = p;
        battery = b;
    }
    void mobile() {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Battery: " 
        + battery + " /mah");
    }
}
public class javaDay12set1 {
    public static void main(String[] argrs) {
    /*    Car c1 = new Car();
        c1.showInfo();
        Student s1 = new Student();
        s1.disply();
        Mobile m1 = new Mobile();
        m1.showSpecs();
        Book b1 = new Book();
        b1.showBook();
        BankAccount bank = new BankAccount();
        bank.deposit(200);
        bank.withdraw(100); 
    */

        Student s1 = new Student();                         // default constructor
        Student s2 = new Student("Venkat", 21);   // parameterized constructor

        s1.display();
        s2.display();

        Car c1 = new Car("Toyota", 120);
        c1.carDetails();
        Car c2 = new Car("BMW", 180);
        c2.carDetails();
        Car c3 = new Car(null, 0);
        c3.carDetails();

        Book b = new Book("Sarpanch", "Naveen Kumar yadav", 11);
        b.book();

        BankAccount bk = new BankAccount("Venkat", 10050);
        bk.bankDetails();

        Mobile mb = new Mobile("Realme 14x 5G", 16000, 6000);
        mb.mobile();
    }
}
