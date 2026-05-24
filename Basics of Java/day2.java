public class day2 {
    public static void main(String args []){
        // operators
        //1. arithmetic operators (+,-,*,/,%)
        int a = 10, b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        //2. assignment operators (+=,-=,*=,/=,%=)
        int c=0;
        System.out.println(c);
        System.out.println(c+=a); // c=+a => c = c+a = 0+10 = 10
        System.out.println(c-=b); // c=-b => c = -5 = -5 
        System.out.println(c*=b);
        System.out.println(c/=b);
        System.out.println(c%=b);

        //3. relational / comparision operators (>,<,>=,<=,==,!=)
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        //4. logical oprators (&&,||,!)
        System.out.println(a>b&&b<a);
        System.out.println(a<b||b>a);
        System.out.println(!(a<b));

        //5. unary operators (+(positive),-(negative),++(increment),--(decrement),~(bitwise not))
        int d = +2;
        System.out.println(d);
        ++d;
        System.out.println(d);
        int e = -4;
        System.out.println(e);
        --e;
        System.out.println(e);
        System.out.println(~d);  // now d is 3 then 3 value in binary 011 => ~3  then it is become 100. so, it's current value is 4.

        //6. ternary operator (shortcut if else)
        //syntax: (condition):stmt if true: stmt if false;
        String result = (a>b)?"a is greater than b":"b is greater than a";
        System.out.println(result);

        //7. bitwise operator (&,|,^(XOR),<<,>>,>>>)
        // & (AND) in binary   1+1 = 1, (1+0,0+1,0+0) = 0
        System.out.println(a&b);
        // | (OR) in binary  (1+1,1+0,0+1) = 1, 0+0 = 0
        System.out.println(a|b);
        // ^ (XOR) in binary (1+1,0+0) = 1, (1+0,0+1) = 0
        System.out.println(a^b);
        // << (Left shift) it means bits are shifted on left side and empty value on right side add with 0.
        System.out.println(a<<b);
        // >> (Right shift) it means bits are shifted on right side and empty value on left side add with 0 for positive value and 
        // 1 for negative value.
        System.out.println(a>>b);
        // >>> (Unsigned right shift) it means bits are shifted on right side and empty value on left side add with 0 for both (+tive / -tive) and prints only negative value.
        System.out.println(a>>>b);
    }
    
}
