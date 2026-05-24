public class ChallengesDay11 {
 /*    //set 1: Method
    // 1️⃣ Create a method printHello() that prints Hello World
    public static void printHello() {
        System.out.println("Hello World");
    } 
    // 2️⃣ Create a method printNumbers() that prints numbers 1 to 5
    public static void printNumbers() {
        System.out.print("Natural numbers: ");
        for(int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
    }
    // 3️⃣ Create a method printEven() that prints even numbers from 1 to 10
    public static void printEven() {
        System.out.print("\nEven numbers 1 to 10 is: ");
        for(int i = 2; i <= 10; i+=2){
            System.out.print(i + " ");
        }
    }
    // 4️⃣ Create a method printSquare() that prints square of 5
    public static void printSquare() {
        System.out.print("\nSquare of 5 is: " + (5 * 5));
    }
    // 5️⃣ Create a method printName() that prints your name 3 times 
    // (using calls, not loop)
    public static void printName() {
        System.out.print("\nNaveen");
    }
 */

    // Challenge Set 2 — Parameters
    // 1️⃣ Method printSum(int a, int b) → print sum
/*     public static void printSum(int a, int b) {
        System.out.println(a + b);
    } 
    // 3️⃣ Method checkEven(int n) → print Even / Odd
    static void checkEven(int n) {
        System.out.print(n % 2 == 0 ? "Even" : "odd");
    }
    // 4️⃣ Method printTable(int n) → print table of n
    static void printTable(int n){
        for(int i = 0; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    // 5️⃣ Method maxOfTwo(int a, int b) → print bigger number
    static void maxOfTwo(int a, int b){
        System.out.print(a > b ? a : b);
    }
 */

    // Challenge Set 3 (Logic Focused)
    // 1️⃣ int sum(int a, int b) → return sum
/*     static int sum(int a, int b) {
        return a + b ;
    }
    // 2️⃣ int max(int a, int b) → return bigger number
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }else {
            return b;
        }
    }
    // 3️⃣ boolean isEven(int n) → return true/false
    static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
    // 5️⃣ int sumOfFirstN(int n) → return sum 1 to n
    static int sumOfFirstN(int n) {
        int i = 1;
        int sum = 0; 
        while(i < n){
            sum += i;
            i++;
        }
        return sum;
    }
  */   

    // 1️⃣ Print numbers from n to 1
    // static void print(int n) {
    //     if(n == 0){
    //         return; // Base case
    //     }
    //     System.out.println(n);
    //     print(n - 1); // recursive call
    // }
    // 2️⃣ Find sum of first n numbers
    // static int sum(int n) {
    //     if(n == 0) {
    //         return 0;
    //     }
    //     return n + sum(n - 1);
    // }
    // 3️⃣ Find factorial of a number
    // static int fact(int fact) {
    //     if(fact ==  1) {
    //         return 1;
    //     }
    //     return fact * fact(fact - 1);
    // }
    // 4️⃣ Count digits of a number
    // static int countDigits(int number, int count) {
    //     if(number == 0){
    //         return count;
    //     }
    //     return countDigits(number =  number / 10, count + 1);
    // }
    // 5️⃣ Find power (aⁿ)
    static int power(int a, int n) {
        if(n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
     /*   printHello();
        printNumbers();
        printEven();
        printSquare();
        printName();
        printName();
        printName();         */
     /*    printSum(5, 10);
        checkEven(5);
        printTable(10);
        maxOfTwo(7, 9);        */ 
     /*    int x = sum(44,15);
        System.out.println(x);
        int max = max(8, 9);
        System.out.println(max);
        boolean isEeven = isEven(7);
        System.out.println(isEeven);
        int sumof = sumOfFirstN(5);
        System.out.println(sumof);    */
        // int x = print(10);
        // int sum = sum(10);
        // System.out.println(sum);
        // int fact = fact(5);
        // System.out.println(fact);
        // int ans = countDigits(4566468, 0);
        // System.out.print(ans);
        int ans = power(2, 3);
        System.out.println(ans);
    }
}
