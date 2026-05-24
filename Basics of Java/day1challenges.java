import java.util.Scanner;
public class day1challenges {
    public static void main(String args[]){

/* 
// Level 1
//Write a Java program to store your name, age, and height in variables and print them.

String name = "Naveen";
int age = 21;
float height = 155.5f;
System.out.println("Name: "+name+"\nAge: "+age+"\nHeight: "+height);
 
//Create variables for int, double, char, and boolean, assign values, and display them.

int a = 5;
double b = 768778.8867d;
boolean c = true;
char d = 'a';
System.out.println(a+" "+b+" "+c+" "+d);
 
//Write a program that converts an int to double and a double to int (type casting).

int e = 10;
double f = e;
int g = (int)f;
System.out.println(f);
System.out.println(g);
 
//🔹 Mini Challenges

//Suppose you have int x = 10; double y = 5.75; Add them together and print the result as double.Then cast the result to int and print again.

int x = 10; double y = 5.75;
double result = (x+y);
System.out.println(result); 
int z = (int)result;
System.out.println(z);
 
//Write a program that asks the user (using Scanner) to enter their age. Store it in an int. Convert it to double.
//Print: "Your age in double is: ...".

Scanner sc = new Scanner(System.in);
System.out.println("Enter User age:");
int _age = sc.nextInt();
double Age = _age;
System.out.println("Your age in double is: "+Age);

//Challenge:

//Declare two char variables, add them, and print the ASCII sum. Example: 'A' + 'B' → prints 131. 

char m = 65, n = 66;
int l=(char)(m+n);
System.out.println(l);

//sc.close();
                  */

// Level 2

//🔹 Variables & Data Types
 
//1. Write a program to swap two numbers without using a third variable. (Hint: use arithmetic operators)

int a = 10, b = 20;
a = a + b;
b = a - b;
a = a - b;
System.out.println(a);
System.out.println(b);
 
//2. Declare a long variable with a very large number (greater than int range). Then try assigning it to an int (type casting). 
//Print both values and observe the difference.

long c = 415757577875315642L;
int d = (int)c;
System.out.println(c);
System.out.println(d);

//3. Create a program that stores the marks of 5 subjects (use float or double). Calculate total, average, and percentage. Print results neatly.

float Telugu = 76.6f, Hindi = 79.9f; 
double English = 61.33d, Maths = 69.11111d, Social = 55.00000d;
double total = (Telugu+Hindi+English+Maths+Social);
double average = total / 5;
int percentage = (int)average;
System.out.println("Total of 5 subject marks is "+ total);
System.out.println("Average of 5 subject marks is "+ average);
System.out.println("Percentage of 5 subject marks is "+ percentage+"%");

//🔹 Type Casting (Tricky)
//4. double e = 99.99; Convert it to int. Multiply the integer result by 2. Then convert it back to double and print final result. 

double e = 99.99;
int f = (int)e;
f *= 2;
System.out.println(f);
double g = (double)f;
System.out.println("The Final result is "+g);

//5. Take a char h = 'Z'; Convert it to its ASCII value (int). Add 32 and convert back to char. (Hint: You’ll get lowercase 'z').
char h = 'Z';
//System.out.println(h);
int i = (int)h;
System.out.println(i);
i += 32;
char j = (char)i;
System.out.println(j);
 
//6. Write a program to divide two integers, but print result as decimal (e.g., 5/2 = 2.5 instead of 2).

int k = 5, l = 2;
float m = (float)k / l;
System.out.println(m);

//🔹 Mixed Challenge
//7. Suppose you have: int n = 257;  byte o = (byte) n; Print o. Explain why the output is different from 257.

int n = 257;             // 257 : in binary (0000 0000 0000 0000 00000 0001 " 0000 00001 " = 1.)
byte o = (byte)n;
System.out.println(o);   // Here why output is different means byte can stores only 127 to -128. so it can takes last 8-bits only 

//8. Accept a float value from user and convert it into: int, byte, char, Print all results.

Scanner Obj  = new Scanner(System.in);
System.out.println("Enter a float value:");
float p = Obj.nextFloat();
int q = (int)p;
byte r = (byte)p;
char s = (char)p;
System.out.println(q);
System.out.println(r);
System.out.println(s);
Obj.close();
    } 
}  