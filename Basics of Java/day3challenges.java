import java.util.Scanner;
public class day3challenges {
    public static void main(String args[]){

       //1. Take the user's name as input and print: "Hello, <name>! welcome to java."
       Scanner sc = new Scanner(System.in);
/*     System.out.print("Enter a user Name:");
       String name = sc.nextLine();
       System.out.printf("Hello, %s! welcome to java",name);
*/
 /*       //2. Take two integers as input using Scanner and print their sum.
       System.out.print("Enter a Number: ");
       int a = sc.nextInt();
       System.out.print("Enter b Number: ");
       int b = sc.nextInt();
       System.out.println(a + b);
*/
 /*    //3. Take length and width as input and calculate area: area = length + width.
       System.out.print("Enter the length: ");
       int length = sc.nextInt();
       System.out.print("Enter the width: ");
       int width = sc.nextInt();
       System.out.println("Total area is: "+(length + width));
*/
 /*    //4. Take two numbers as input and swap them using a third variable.
       System.out.print("Enter c value: ");
       int c = sc.nextInt();
       System.out.print("Enter d value: ");
       int d = sc.nextInt();
       int e = c + d;
       d = e - d;
       c = e - d;
       System.out.println(c+"\n"+d);
*/
       //5. Take a decimal number as input and print its integer part using explicity type casting.
 /*    System.out.print("Enter a Decimal number: ");
       double f = sc.nextDouble();
       int g = (int)f;
       System.out.println(g);
 */
  /*   //6. Take P, R, T as input and calculate simple interest: SI = (P * R * T) / 100
       System.out.print("Enter the Principal: ");
       float h = sc.nextFloat();
       System.out.print("Enter the Rate of Interest: ");
       int i = sc.nextInt();
       System.out.print("Enter No.of Years: ");
       long j = sc.nextLong();
       System.out.println("Simple Interest is: "+ (h*i*j)/100); 
       
       //7. Take a single character as input and print it's ASCII value (use (i0nt ) casting).
       System.out.print("Enter a single character: ");
       char k = sc.next().charAt(0);
       int l = (int)k;
       System.out.println(l);
   */
       //8. Take the user's age as input and print Eligible if age >=18, otherwise Not Eligible.
/*     System.out.print("Enter a user age: ");
       int m = sc.nextInt();
       String result = (m>=18) ? "User is Elilgible ":"User Not Eligible";
       System.out.print(result);
*/
 /*    //9. Take a number as input and print if it's positive , negative, or zero.
       System.out.print("Enter a number: ");
       int n = sc.nextInt();
       String res = (n==0)? "Given number is zero": (n>0)? "Given number is positve":"Given number is negative";
       System.out.print(res);
 */
       //10. Take celsius value as input and convert to Fahrenhit: F = (c * 9/5) + 32
       System.out.print("Enter a Celcius value: ");
       int o = sc.nextInt();
       System.out.print("celsius value converted into Fahrenhit is "+((o * 9.0/5)+32)+"'c");
       sc.close();
    }

}
