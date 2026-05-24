import java.util.Scanner;
public class day4challenges {
    public static void main(String args[]){

      //Java Practice Questions (Decision Making & Basic Input/Output)
    //1. Take a student’s marks (0–100) as input. Print "Pass" if marks ≥ 35, otherwise print "Fail".

    Scanner in = new Scanner(System.in);
 /*   System.out.print("Enter the student marks: ");
    int marks = in.nextInt();
    if(marks <= 100 && marks >= 0){
      if (marks >= 35){
          System.out.println("Pass");
        }
       else{
           System.out.println("Fail");
        }
    }
    else{
        System.out.println("Enter the marks 0 to 100!");
    }
 */
    //2. Take the user’s age as input. Print "You can vote" if age ≥ 18, else print "You cannot vote".

 /*   System.out.print("Enter the user's age: ");
    int age = in.nextInt();
    if(age >= 18){
        System.out.println("You can vote");
    }else{
        System.out.println("You cannot vote");
    }
 */
    //3. Take two numbers as input. Print which one is greater (or print "Both are equal" if they are the same).

 /*    System.out.print("Enter two numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    if(a > b){
        System.out.println(a+" is greater than "+b);
    }
    else if(a == b){
        System.out.println("Both are equal");
    }
    else{
        System.out.println(b+" is greater than "+a);
    }

 */

    //4. Take an integer input and check whether it is positive, negative, or zero.

/*     System.out.print("Enter a integer value: ");
    int c = in.nextInt();
    if(c > 0){
        System.out.println("Given number is Positive");
    }
    else if (c < 0){
        System.out.println("Given number is Negative ");
    }else{
        System.out.println("Given number is Zero");
    }
 */
    //5. Take today’s temperature (°C) as input. If temp ≥ 30 → Print "It’s Hot!" 
        //If temp is between 20 and 29 → Print "It’s Pleasant!". If temp < 20 → Print "It’s Cold"

 /*    System.out.print("Enter today's temperature: ");
    int temp = in.nextInt();
    if(temp >= 30){
        System.out.println("It's Hot!");
    }else if(temp >= 20 && temp <=29){
        System.out.println("It's Pleasant!");
    }else{
        System.out.println("It's cold");
    }
 */
    //6. Take the bill amount as input. If bill > 2000 → Print "You got 20% discount"
        //Else if bill ≥ 500 → Print "You got 10% discount". Else → Print "No discount available"

/*     System.out.println("Enter the Bill amount: ");
    long  bill = in.nextLong();
    if(bill >= 500 && bill <= 2000){
        System.out.println("You got 10% discount");
    }
    else if(bill > 2000){
        System.out.println("You got 20% discount");
    }else{
        System.out.println("No discount available");
    }    
 */

    //7. Take a decimal number as input. Convert it to integer using typecasting and check if it’s even or odd.
/* 
    System.out.print("Enter a decimal number: ");
    double input = in.nextDouble();
    int j = (int)input;
    if(j%2 == 0){
        System.out.println("Given number is Even");
    }else{
        System.out.println("Given number is Odd");
    } 
*/
    //8. Take student’s marks as input and print grades:
        // Marks ≥ 90 → A, Marks ≥ 75 → B, Marks ≥ 50 → C, Marks ≥ 35 → D, Else → Fail

 /*    System.out.print("Enter the student marks: ");
    int Marks = in.nextInt();
    if(Marks >0 && Marks < 100){
        if(Marks <=100 && Marks >= 90){
             System.out.println("Student got A grade marks");
        }else if(Marks <= 89 && Marks >= 75){
             System.out.println("Student got B grade marks");
        }else if(Marks <= 74 && Marks >= 50){
             System.out.println("Student got C grade marks");
        }else if(Marks <= 49 && Marks >= 35){
             System.out.println("Student got D grade marks");
        }else{
             System.out.println("Fail"); 
        }
    }else{
        System.out.println("Enter the valid marks");
    }
     */
    //9. Take a year as input and check if it’s a Leap Year or not.
        // (Hint: A year is leap if it is divisible by 4 but not by 100, OR divisible by 400)

    System.out.println("Enter the leap year: ");
    int year = in.nextInt();
    if(year%4 == 0 && year%100 != 0){
        System.out.println(year+" is a leap year");
    }else{
        System.out.println(year+" is not a leap year");
    }
    in.close();
    }
    
}
