public class day2challenges {
    public static void main(String args[]){
        
        /* // Level 1
        //1. Declare two integers and print their sum.
        int a = 5, b = 2;
        System.out.println(a+"\n"+b);
        
        //2. Declare two floats and print thieir product.
        float c = 5.8f, d = 6.6f;
        System.out.println(c+"\n"+d);

        //3. Take two numbers and print which one is greater using > operator.
        String result = (a>b)? "a is greater": " b is greater";
        System.out.println(result);

        //4. Find the remainder when 29 is divided by 5.
        System.out.println(29%5);

        //5. Take an int value and increment it using ++ and print.
        ++a;
        System.out.println(a);

        //6. Declare a double, cast it to int, and print result.
        double e = 4864.4676467468798d;
        int f = (int)e;
        System.out.println(f);

        //7. Swap two numbers without usig a third variable.
        a = a + b;   // a =  6, b = 2 
        b = a - b;
        a = a - b;
        System.out.println(a+"\n"+b);

        //8. Use && to check if a number is between 10 and 20.
        int g = 15;
        System.out.println("g number is between 10 and 20: " + ((g>=10)&&(g<=20)));

        //9. Use || to check if a number is less than 5 or greater than 50.
        System.out.println("g number is between 10 and 20: " + ((g<5)||(g>50)));

        //10. Use ternary operator to check if a number is even or odd.
        System.out.println(  ((a%2)==0)? "Even":"Odd"); */

        // Level 2
        //1. Multiply a float by an int and store result in a double.
        int a = 2;
        float b = 5.56f;
        double c = (double)a*b;
        System.out.println(c);

        //2. Add 5 to a variable using += operator.
        System.out.println(c+=5);

        //3. Compare two floats using == and print result.
        System.out.println(b==7.77);

        //4. Find the average of three integers and store it in a float.
        int d,e,f;
        d = e = f = 5;
        System.out.println("Average of three(d,e,f) numbers is :"+ (d+e+f)/3);
        float g = (float)((d+e+f)/3);
        System.out.println(g);

        //5. Use -- operator to decrement a number and print it.
        int h = 5;
        System.out.println(--h+"\nH value is decremented."+h);

        //6. Use bitwise & operator on two numbers and print result.
        int i = 1, j = 2;
        System.out.println(i&j);
        System.out.println(i|j);

        //7. Use bitwise << to left shifft a number by 1.
        System.out.println(i<<5);

        //8. Divide two integers and store result in float using type casting.
        int k = 5, l = 8, m;
        System.out.println(m = l/k); 
        System.out.println((float)(m));

        //9. Take a price and reduce it by 10% using operators.
        float price = 97.7f,n;
        // 1st method
        System.out.println("90 percentage of original price:"+price*0.9);
        // 2nd method
        System.out.println("10 percentage of oringinal price:" + (n = (price*10)/100));
        System.out.println("original price reduced by 10 percentage:"+(price-n));
        
        //10. Take two numbers and print their XOR (^) result.
        int o = 3, p = 5;
        System.out.println(o^p);

        //11. Chained Ternary Operator, Take an integer marks and use ternary operator to print: "Pass"
        // if marks ≥ 35, "Fail" if marks < 35, "Distinction" if marks ≥ 75, "Top 5" if marks >= 90
        int marks = 85;
        String student = (marks < 35) ? "Fail" :(marks>=90) ? "Top 5" : (marks>=75) ? "Distinction":"pass";
        System.out.println(student); 
    }
}
