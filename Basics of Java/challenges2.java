import java.util.Scanner;
public class challenges2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter a value:");
        //long a = sc.nextLong();
//  LEVEL 1 – Easy (7 Questions)

//1 Write a program to print "Java is Easy" 10 times.
/* for(int i = 0; i < 10; i++){
    System.out.println("Java is Easy ");
} */
 
//2️ Take a number and print whether it is even or odd.
/* System.out.print("Enter a number: ");
int a = sc.nextInt();
if(a%2==0){
    System.out.println("Given number is even number ");
}else{
    System.out.println("Given number is odd number ");
}
 */

//3️ Take 2 numbers and print their sum, difference, product.
/* int a = 5, b = 3;
System.out.println("The given numbers sum is "+(a+b));
System.out.println("The given numbers difference is "+(a-b));
System.out.println("The given numbers product is "+(a*b));
 */

//4️ Print all numbers from 1 to 50 using a loop.
/* for(int i = 1; i <= 50; i++){
    System.out.println(i);
} */

//5️ Take a user’s name using Scanner and print: "Hello, <name>!"
/* System.out.print("Enter your name: ");
String name = sc.nextLine();
System.out.println("Hello "+name+"!");
System.out.printf("Hello %s!",name);
 */
 /* 
//6️ Print the square and cube of a given number.
int x = 5;
System.out.println("The given number "+x+" of squre is "+(x*x));
System.out.println("The given number "+x+" of cube is "+(x*x*x)); */

//7️ Take age from user and check if the person is adult or not (age ≥ 18).
/* System.out.print("Enter user age: ");
int age = sc.nextInt();
if(age >= 18){
    System.out.println("The person is adult");
}else{
    System.out.println("The person is not adult");
}
 */

//⭐ LEVEL 2 – Medium (7 Questions)

/* //8️ Take 3 numbers and print the largest.
int a = 10, b = 11, c = 5;
if(a > b && a > c){
    System.out.println("a is largest");
}else if(b > a && b > c){
    System.out.println("b is largest");
}else{
    System.out.println("c is largest");
}
 */

//9️ Print the multiplication table of a number up to 20.
/* int m = 2,n = 20 ;
for(int i = 1; i <= n; i++){
    System.out.println(m+" X "+i+" = "+(m*i));
}
 */

/* //10 Count how many digits are in a number.
System.out.print("Enter a number: ");
int number = sc.nextInt(),digits = 0;
while(number > 1){
    int num = number / 10;
    digits++; 
    number = num;
}
System.out.print(digits);
 */

/* //1️1️ Check if a given year is a leap year.
System.out.print("Enter a year: ");
int year = sc.nextInt();
if((year % 4 == 0 && year % 100 != 0 ) ||year % 400 == 0){
    System.out.println("Given year is a leap year");
}else{
    System.out.println("Given year is not a leap year");
}
 */

/* //1️2️ Print the factorial of a number.
System.out.print("Enter a number: ");
int n = sc.nextInt(),fact = 1; */
/* for( int i = 1 ;i <= n ;i ++){
     fact = j * i;
}
     */
 /*    while (n > 0) {
        fact = fact * n ;
        n--;
    }
System.out.println("The factorial of a given number is "+ fact);
*/

/* //1️3️ Take a number and print all numbers from 1 to that number but skip multiples of 3.
int num = 25;
for( int i = 1; i <= num; i++){
    if(i % 3 == 0){
        continue;
    }
    System.out.println(i);
} */

//1️4️ Take n and find the sum of all even numbers from 1 to n.
/* int n = 5,sum = 0;
for( int i = 1; i <= n; i++){
    if(i%2 == 0){
        sum += i;
    }
}
System.out.println("sum of al even numbers from 1 to "+n+" is "+ sum); */


//⭐ LEVEL 3 – Tricky / Logical (7 Questions)
 
//1️5️ Reverse a number (without converting to string).
/* int number = 123,Reverse = 0;
System.out.print("The reverse number is ");
while(number > 0){
    Reverse = number % 10;
    System.out.print(Reverse);
    number = number / 10;
}
 */

//1️6️ Check if a number is a palindrome.
/* int number = 232,num = 0,original = number;
while(number > 0){
    int digit = number % 10;
    num = num * 10 + digit;
    number = number / 10;
}
System.out.println(num);
if(num == original){
    System.out.println("The given number is a palindrome ");
}else{
    System.out.println("The given number is not a palindrome ");
}
 */

//1️7️ Print the first N Fibonacci numbers.
int i = 1, a = 0, b = 1;
System.out.println("Fibonacci series is ");
while( i < 10){
    System.out.print(a+" ");
    int c = a + b;
    a = b;
    b = c;
    i++;
} 
 
// factorial of a number

/* int j = 1;
for( int i = 1; i <= a; i++){
    j = j * i;
}
System.out.println("factorial of "+a+" is "+j);
  */
 // sum of n values
/*  int sum = 0;
 for( int i = 1; i <= a; i++){
    sum = sum + i;
 }
 System.out.println("The total sum is "+sum);
  */
   sc.close();

   }
}
