public class day4 {
    public static void main(String args []){
        // control statements 
        // 1. decision making statements 
    /* 1. if 
     * 2. if else
     * 3. else if 
     * 4. nexted if 
     * 5. switch 
     */
      // short form / short cut of switch
      int Laptop_Price = 120000;
      switch(Laptop_Price){
        case 20000 -> System.out.println("2nd Hand laptops");
        case 30000 -> System.out.println("Lenovo");
        case 40000 -> System.out.println("Hp");
        case 50000 -> System.out.println("Acer");
        case 70000 -> System.out.println("Samsung");
        case 90000 -> System.out.println("Intel");
        case 100000 -> System.out.println("Mac Book");
        default -> System.out.println("Go for the high range laptops like Apple ");
      }

    }
}
