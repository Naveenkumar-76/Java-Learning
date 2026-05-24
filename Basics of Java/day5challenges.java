import java.util.Scanner;
public class day5challenges {
    public static void main(String args[]){
       
 // Loop Practice Questions

//1. Print 1 to 10 → Use a loop to print numbers from 1 to 10.
/* for(int i=1;i<=10;i++){
    System.out.println(i);
} */
//2. Sum of First N Numbers → Take input n and print the sum from 1 to n.
Scanner sc = new Scanner(System.in);
/* System.out.print("Enter a number: ");
int n = sc.nextInt();
int sum = 0;
for(int i = 1; i <= n;i++){
    sum=sum+i;
}
System.out.println(sum);
 */
//3. Multiplication Table → Take input n and print its table (1×n, 2×n … 10×n).
/* System.out.print("Enter n value: ");
int n = sc.nextInt();
int x = 2;
while(n<=10){
    System.out.println(x+" x "+n +" = "+x*n);
    n++;
} */
//4. Even Numbers from 1 to 50 → Print only even numbers using a loop.
/* for(int i = 1;i<=50;i+=2){ 
    if(i%2==1){
        i++;
        System.out.print(i+" ");
        continue;
    }
   System.out.print(i+" ");
} */
//5. Reverse Counting → Print numbers from 10 to 1.
/* int n = 10;
System.out.println("Let's counting starts! ");
while(1<=n){
    System.out.println(n);
    n--;
} */
//6. Factorial Calculator → Take a number n and find its factorial.
/* int n = 6; int j=1;
for(int i = 1; i<=n; i++){
    j=j*i;
}
System.out.println(j);
 */
//7. Count Digits in a Number → Take input n and count how many digits it has.
/* System.out.print("Enter a digit: ");
int n = sc.nextInt();
int count = 0;
while(n>0){
    int count_digit = n%10;
    count++;
    n = n/10;
}
System.out.println("Given digit number can contais "+count+" digits");  */

//8. Sum of Digits → Take input n and calculate the sum of its digits.
/* System.out.print("Enter a number: ");
int n = sc.nextInt();
int sum = 0;
while(n>0){
    int count_digit = n%10;
    sum += count_digit;
    n = n/10;
}
System.out.println("Given number sum of digits is "+sum);  */
//9. Guess the Number 🎯 → Use a loop to let the user guess a number until they get it right.
/* System.out.print("Guess the number: ");
int user = sc.nextInt();
int Secret_Number = 7;
if(user > 10 ){
    System.out.println("Enter a number between 1 to 10");
}
 if(user < 0){
    System.out.println("Enter a number between 1 to 10");
}
while(user > 0 && user < 10){
    if(user == Secret_Number){
        System.out.println("your guess is corrct! ");
        break;
    }else{
        System.out.println("your guess is wrong ");
        break;
    }
}

 */
/* 
int Secret_Number = 7;
int input;
do{
    System.out.print("Guess the number: ");
    input = sc.nextInt();
    if(input < 0 || input > 10 ){
        System.out.println("Enter a number between 1 to 10 only.");
    }
    else if(input == Secret_Number){
        System.out.println("Correct Guess!");
    }
    else{
        System.out.println("Wrong Guess!");
    }
}while(input != Secret_Number);
 */
//10. Print Stars ⭐ → Print the following pattern using a loop:
/* *
   **
   ***
   ****
   ***** 
for(int i = 1;i <= 5; i++){
    for(int j = 1;j <= i; j++){
        System.out.print("*");
    }
    System.out.println();
  }  */
//11. Write a switch program to make a simple calculator (+, -, *, /).
/* System.out.print("Enter the two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.print("Enter a operator: ");
char operator = sc.next().charAt(0);
switch(operator){
    case '+' -> System.out.println("Addition of two given numbers is "+(a+b));
    case '-' -> System.out.println("Substraction of two given numbers is "+(a-b)); 
    case '*' -> System.out.println("Multiplication of two given numbers is "+(a*b)); 
    case '/' -> System.out.println("Division of two given numbers is "+(a/b)); 
}
 */
//12. Create an array {10, 20, 30, 40, 50} and print all numbers using a for-each loop.
/* int a[] = {10, 20, 30, 40, 50};
for(int number:a){
    System.out.println(number);
} */
//13. Write a program that prints numbers from 1 to 10, but stops when number is 7 (use break).
/* for(int i = 1;i <= 10; i++){
    if(i==7){
        break;
    }
    System.out.println(i);
} */
//14. Write a program that prints numbers from 1 to 10, but skips number 5 (use continue).  
for(int i = 1;i <= 10; i++){
    if(i==5){
        continue;
    }
    System.out.println(i);
} 
sc.close();
  }
    
}
