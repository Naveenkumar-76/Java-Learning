import java.util.Scanner;

public class challenges {
    public static void main(String args[]) {

        // day 1 + 2 + 3
        // Take an int from the user and print whether it is even or odd.
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.print("Enter a integer number: ");
         * int a = sc.nextInt();
         * if(a%2 == 0){
         * System.out.println("Even");
         * }else{
         * System.out.println("Odd");
         * }
         */
        // Input principal, rate (float), and time (int). Calculate simple interest and
        // print it as a double.
        /*
         * double principal = 50000;
         * float rate = 2.0f;
         * int time = 24; //months
         * System.out.println(((principal*rate*time)/100));
         */
        // Input a float Celsius value. Convert to Fahrenheit (double) and print both.
        /*
         * int celsius = 37;
         * double Fahrenheit = (double)(celsius * 9/5)+32;
         * System.out.println("celsius value: "+celsius+"\nFahrenheit value: "
         * +Fahrenheit);
         */
        // Read a single char and check if it is a vowel or consonant.
        /*
         * System.out.print("Enter a Alphabet: ");
         * char c = sc.next().charAt(0);
         * if(c == 'a' ||c == 'e'||c == 'i'|| c == 'o'||c == 'u'){
         * System.out.println("Vowel");
         * }else if(c == 'A' ||c == 'E'||c == 'I'|| c == 'O'||c == 'U'){
         * System.out.println("Vowel");
         * }else{
         * System.out.println("Consonent");
         * }
         */

        // Electricity Bill Input units (int). Calculate bill with slabs: first 100
        // units @ ₹5/unit next 100 @ ₹7/unit,remaining @ ₹10/unit.
        /*
         * System.out.print("Enter the bill amount : ");
         * int units = sc.nextInt();
         * if(units <= 100){
         * System.out.println(units * 5);
         * }
         * else if(units > 100 && units <= 200){
         * System.out.println((units - 100) * 7 + 500);
         * }
         * else{
         * System.out.println((units - 200) * 10 + 1200);
         * }
         */
        // Ask user: 1-Deposit, 2-Withdraw, 3-Check Balance. Use switch and update a
        // balance variable.
        /* 
         * int balance = 2000;
         * System.out.
         * print("ATM: what could you do now: \n1. Deposite \n2. Withdraw \n3. Check Balance "
         * );
         * int user = sc.nextInt();
         * if (user <= 0 || user > 3) {
         * System.out.println("Please enter only available number");
         * } else if (user == 1) {
         * System.out.print("How much you will deposite: ");
         * int deposite_amount = sc.nextInt();
         * balance += deposite_amount;
         * System.out.println("Your current balance is " + balance);
         * } else if (user == 2) {
         * System.out.print("How much you can withdraw: ");
         * int withdraw_amount = sc.nextInt();
         * balance -= withdraw_amount;
         * System.out.println("Your current balance is " + balance);
         * } else {
         * System.out.println("Your current balance is " + balance);
         * }
         * switch (user) {
         * case 1:
         * System.out.print("How much you will deposite: ");
         * int deposite_amount = sc.nextInt();
         * balance += deposite_amount;
         * System.out.println("Your current balance is " + balance);
         * break;
         * case 2:
         * System.out.print("How much you can withdraw: ");
         * int withdraw_amount = sc.nextInt();
         * if(balance >= withdraw_amount){
         * balance -= withdraw_amount;
         * System.out.println("Your current balance is " + balance);
         * }
         * else{
         * System.out.println("Insufficient Balance");
         * }
         * break;
         * case 3: System.out.println(" Balance is " + balance);
         * break;
         * default : System.out.println("Please enter only available number");
         * }
         * 
         */
        // Read an amount in rupees (double). Convert to USD (float) at a given rate.
        // Print both using formatted output (printf).
        /*
         * System.out.println("Enter the amount in rupees: ");
         * double rupees = sc.nextDouble();` Z
         * float rate = 87.55f;
         * float USD = (float)(rupees / rate);
         * System.out.printf("Amount in rupees is %f ",rupees);
         * System.out.printf("Amount in rupees is %.2f ",USD);
         * 
         */

        // Intermediate Level

        // 6️⃣ Factorial Input an integer and calculate its factorial using a for loop.
     /*    System.out.print("Enter a integer number: ");
        int f = sc.nextInt();
        int j = 1;
        for(int i = 1;i <= f; i++){
            j = i * j;
        }
        System.out.println("Factorial of given number is "+j);  */

        // 7️⃣ Reverse of a Number Read an integer and print the reverse (e.g. 123 → 321).
        // 8️⃣ Sum of Digits Read an integer and find the sum of its digits (no strings).
        // 9️⃣ Count Digits Input a number and count how many digits it has.
       /*  int number = 526, sum = 0, reverse, count=0;
        while(number > 0){
            reverse = number%10;
            count++;
            sum += reverse;
            number = number/10;
            System.out.print(reverse);
        }
         System.out.print("\n"+count+"\n");
         System.out.println(sum);
 */
        // 🔟 Power of a Number Read base and exponent; calculate power using a loop (no Math.pow).
  /*       System.out.print("Enter the base number and power: ");
        int base = sc.nextInt();
        int power = sc.nextInt();
        int i=1, j = 1;
        while(i<=power){
            j = j * base;
            i++;
        }
        System.out.println(j);
 */
        // 1️⃣ Even/Odd Counter Read n numbers from the user and count how many are even and how many are odd.
       /*  System.out.println("Enter n numbers: ");
        int n = sc.nextInt(), even = 0, odd = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd); */

        // 2️⃣ Prime Check Input a number and check if it’s prime using a loop.
   /*      System.out.println("Enter a number: ");
        int number = sc.nextInt(), count = 0;
        for(int i =1;i<= number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count <= 2){
            System.out.println("Given number is a prime number");
        }else{
            System.out.println("given number is not a prime");
        }
         */
        

        // Challenging Level

        // 3️⃣ Fibonacci Series Input n and print the first n Fibonacci numbers.
      /*   System.out.print("Enter a number: ");
        int n = sc.nextInt(),a = 0, b = 1, c;
        System.out.println(a+",\n"+b);
        for(int i = 1;i <= n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
 */
        // 4️⃣ Armstrong Number Check if a given number is an Armstrong number (e.g. 153).
    /*     System.out.print("Enter a number: ");
        int number = sc.nextInt(),digit = 0,sum = 0,original = number;
        while(number > 0){
            digit = number%10;
            sum += digit * digit * digit;
            number = number/10;
        } 
        if(sum == original){
            System.out.println("Given number is a Armstrong number ");
        }else{
            System.out.println("Given number is not a Armstrong number ");
        }
         */
        // 5️⃣ Greatest Common Divisor (GCD) Input two integers and find their GCD using a loop.
/*         System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int gcd = 1;  
        
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i; 
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
     */
        // 6️⃣ Palindromic Number Check if a number reads the same forwards and backwards.
   /*      System.out.println("Enter a number: ");
        int a = sc.nextInt(), palindromic = 0,original = a,reverse = 0;
        while(a > 0){
            palindromic = a%10;
            reverse = reverse * 10 + palindromic;
            a = a/10;
        }
        if(reverse == original){
            System.out.println("Given number "+reverse+" is a palindromic number");
        }else{
            System.out.println("Given number "+ reverse+" is not a palindromic number");
        }
         */
        // 7️⃣ Number Guess Game Generate a random number (1–100). Keep asking the user
        // to guess until they match. Tell if each guess is too high or too low.
        int a , match = 47;
        do{
            System.out.println("User Enter a number: ");
            a = sc.nextInt();
            if(a < 0 || a > 100){
                System.out.println("Please enter the number only 0 to 100");
            }else if(a == match){
                System.out.println("Your guess is correct!");
            }else if(!(a == match)){
                System.out.println("Your guess is wrong");
            }
            if(a > 50){
                System.out.println("Your guess is too high");
            }else if(a < 25){
                System.out.println("Your guess is too low");
            }else if(!(a == match)){
                System.out.println("Your guess is too close");
            }

        }while(!(a == match));
         

       sc.close();
    }

}
