public class challengesday11set1 {
    //1️⃣ Simple Method Call Check
    //Create a method that prints "Java" and call it three times from main().
 /*    static void print() {
        System.out.println("Java");
    }
    //2️⃣ Parameter Order Trap
    //Create a method subtract(int a, int b) and call it with different argument orders.
    static int subtract(int a, int b) {
        return a - b;
    }
    //3️⃣ Method with Return (No Print Inside)
    //Create a method that returns the sum of two numbers and print the result in main().
    static int sum(int a, int b) {
        return a + b;
    }
    //4️⃣ Reuse Returned Value
    //Use a returned value from one method in another calculation.
    static int division(int a, int b) {
        return a / b;
    }
    //5️⃣ Max of Two Numbers (Return Based)
    //Create a method that returns the maximum of two numbers.
    static int max(int y, int z) {
        if(y > z)
            return y;
        return z;
    }
    //6️⃣ Boolean Return Method
    //Create a method that returns true if a number is even, otherwise false.
    static boolean retur(int a) {
        return a % 2 == 0; 
    }
 */
    //7️⃣ Local Scope Isolation,
    //Call the same method twice with different values and show that variables do not interfere.
 /*    static int same(int value) {
        value = value + 10;
        return value;
    }
    //8️⃣ Pass-by-Value Proof,
    //Create a method that tries to change a variable and prove the original value remains unchanged.
    static int pass(int value) {
        value = value + 10;
        return value;
    }
    //9️⃣ Early Return Usage
    //Create a method that immediately returns if a number is negative.
    static String immediretur(int a) {
        if(a < 0)
            return "negative";
        return "positive";
    }
    //🔟 Multiple Return Statements
    //Create a method that returns: 1. -1 if number is negative
    //2. 0 if number is zero. 3. 1 if number is positive
    static String multiplereturn(int x) {
        if(x < 0)
            return "negative";
        else if(x == 0)
            return "zero";
        return "positive";
    }
 */
    //1️⃣1️⃣ Method Call Flow
    //Create three methods where one calls the second and the second calls the third.
 /*    static int one(int a) {
        return a;
    }
    static int two(int b) {
        return one(b);
    }
    static int three(int c) {
        return two(c);
    }
    //1️⃣2️⃣ Return Chain Logic
    // Create two methods where one method returns a value used as input for another method.
    static int chain1(int x) {
        return x * 5;
    }
    static int chain2(int y) {
        return chain1(y) + 2;
    }
    //1️⃣3️⃣ Count Digits (Method Based)
    // create a method that returns the count of digits in a number.
    static int countDigit(int count, int number) {
        if(number == 0) {
            return 0;
        }
        return count + countDigit(count + 1, number = number / 10);
    }
    //1️⃣4️⃣ Reverse Number (Return Based)
    // Create a method that returns the reverse of a number.
    static int reverse(int num, int revnum) {
        if(num == 0){
            return revnum;
        }
        return reverse(num / 10, revnum * 10 + num % 10);
    }
    //1️⃣5️⃣ Sum of Digits (Method)
    // Create a method that returns the sum of digits of a number.
    static int sumOfDigits(int sum, int number) {
        if(number == 0){
            return sum;
        }
        return sumOfDigits(sum + number % 10, number / 10);
    }
 */
    //1️⃣6️⃣ Print Numbers 1 to N (Recursion)
    // Print numbers from 1 to n using recursion.
    static void printnum(int n) {
        if(n == 0){
            return ;
        }
        printnum(n - 1);
        System.out.println(n);
    }
    //1️⃣7️⃣ Print Numbers N to 1 (Recursion)
    // Print numbers from n to 1 using recursion.
    static void printnto1(int n) {
        if(n == 0) {
            return ;
        }
        System.out.println(n);
        printnto1(n - 1);
    }
    //1️⃣8️⃣ Sum of First N Numbers (Recursion)
    // Return the sum of numbers from 1 to n.
    static int sumofFirstN(int n) {
        if(n == 0)
            return 0;
        return n + sumofFirstN(n - 1);
    }
    //1️⃣9️⃣ Factorial of a Number (Recursion)
    // Find factorial using recursion.
    static int factorialofnum(int num, int fact) {
        if(num == 0)
            return fact;
        return factorialofnum(num - 1, fact *= num);
    }
    //2️⃣0️⃣ Power of a Number (aⁿ)
    // Calculate aⁿ using recursion.
    static int powerofnum(int a, int n) {
        if(n == 0)
            return 1;
        return a * powerofnum(a, n - 1);
    }
    public static void main(String[] args) {
    /*     print();
        print();
        print();
        System.out.println(subtract(5, 10));
        System.out.println(subtract(10, 5));
        System.out.println(sum(10, 10));
        int ans = division(15, 2);
        System.out.println(ans);
        System.out.println(ans * ans);
        System.out.println(max(10, 25));
        System.out.println(retur(5));
     */

    /*     System.out.println(same(5));
        System.out.println(same(8));
        int original = 8;
        pass(original);
        System.out.println(original);
        System.out.println(immediretur(-8));
        System.out.println(multiplereturn(9));
     */

    /*     System.out.println(three(4));
        System.out.println(chain2(9));
        System.out.println(countDigit(0, 456));
        System.out.println(reverse(159, 0));
        System.out.println(sumOfDigits(0, 456));
     */

        printnum(5);
        printnto1(5);
        System.out.println(sumofFirstN(5));
        System.out.println(factorialofnum(5, 1));
        System.out.println(powerofnum(2, 5));
    }
}
