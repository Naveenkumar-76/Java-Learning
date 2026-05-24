public class Day5Challenges2 {
    public static void main(String[] args) {
        //1️. Reverse a Number, Input an integer and print its reverse.
        //👉 Handle trailing zeros correctly (e.g., 1200 → 21).
/* 
        int num = 120200, reverse = 0;
        while(num > 0){
            reverse = reverse * 10+num%10;
            num = num/10;
        }
        System.out.println("Given number in reverse is "+reverse);

*/     
        //2️. Palindrome Number Checker. Check whether a given number is a palindrome.
/* 
        int num = 123321,palindrome= 0, original = num;
        while(num>0){
            palindrome = palindrome*10+num%10;
            num = num/10;
        }
        if(palindrome == original){
            System.out.println("Given number is a palindrome");
        }else{
            System.out.println("Given number is not a palindrome");
        }
         */

        //3️. Count Digits (No Math Functions), Input a number and count how many digits it has.
/* 
        int num = 10120000, digits = 0;
        while (num > 0) {
            num=num/10;
            digits++;
        }
        System.out.println("The given number contains "+digits+" digits");
 */

        //4. Sum of Digits at Even Positions, Input a number and sum digits at even positions from right.
/* 
        int num = 12965,sum=0,even = 0;
        while(num>0){
            even++;
            if(even%2==0){
                sum += num%10;
            }
            num = num/10;
        }
        System.out.println("Sum of digits from the given number at even positions is "+sum);
 */
    
        //5️. Strong Number Checker. Check if a number is a Strong Number
        // (Example: 145 = 1! + 4! + 5!)
/* 
        int num = 15,strong_number = 0, original = num;
        while(num>0){
            int S_num = num%10;
            int fact = 1;
            for(int i = 1;i <= S_num;i++){
                fact *= i;
            }
            strong_number += fact ;
            num = num/10;
        }
        if(original == strong_number){
            System.out.println("Given number is a Strong number");  
        }else{
            System.out.println("Given number is not a Strong number");
        }
         */

        //6️. Armstrong Number (3-digit only). Check if a number is an Armstrong number.
/* 
        int num = 153, armstrong = 0, original = num;
        if(num > 99&& num <= 999){
            while(num>0){
                int digit = num%10;
                armstrong += digit*digit*digit;
                num = num/10;
            }
            if(armstrong == original){
                System.out.println(original+" is Amstrong number");
            }
            else{
                System.out.println(original+" is not a Amstrong number");
            }
        }
        else{
            System.out.println("Please enter 3 digit number only");
        }
 */


        //7️. Prime Number Checker. Check if a number is prime.
/* 
        int n = 47,count = 0;
        if(n<=1){
            System.out.println(n+" is not a prime number");
        }
        else{
            for(int i = 2;i<n; i++){
                if( n%i == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
 */
        //8️. Print All Primes in a Range, Input two numbers and print all primes between them.
/* 
        int num1 = 2, num2 = 50;
        if(num1 <=1 && num2 <= 1){
            System.out.println("we don't have prime numbers in this range ");
        }else{
            for(int i = num1; i <= num2; i++){
                int count = 0;
                for(int j = 2; j < i; j++){
                    if(i%j == 0){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    System.out.print(i+" ");
                }
            }
            
        }
 */
       

        //9️. LCM of Two Numbers, Find LCM using loops only.
/* 
        int n1 = 4, n2 = 6, max= 0;
        if(n1>n2){
            max = n1;
        }else{
            max = n2;
        }
        int lcm = max;
        for(int i = 2; i<= max; i++){
            if(lcm%n1 == 0 && lcm%n2 == 0){
                lcm = i;
                break;
            }
        }
        System.out.println("lcm is: "+lcm);
         */
        //🔟 GCD (HCF) Using Loops. Find GCD of two numbers.
/* 
        int n1 = 12, n2 = 18, min= 0;
        if(n1<n2){
            min = n1;
        }else{
            min = n2;
        }
        int gcd = min;
        for(int i = min; i>= 1; i--){
            if(gcd%i == 0 && gcd%i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println(" Gcd is: "+gcd); */

        //11. Print first N Fibonacci numbers.
      /*   int a = 0, b = 1,c;
        for(int i = 0; i<=10; i++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;
        }
 */
     

        //1️2️.Power of a Number, Input base and exponent, calculate power using loops.

        int base = 5, exponent = 3, power = 1;
        for(int i = 1; i <= exponent; i++){
            power = power * base;
        }
        System.out.println(power);
       
 
    }
}
