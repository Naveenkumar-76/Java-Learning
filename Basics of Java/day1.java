public class day1 {
    public static void main(String args[]){
        //Syntax variables dataType variableName;
     /* int a;
        a = 5;
        System.out.println(a);
        //Multi variables  
        int x,y,z;                            
        x = y = z = 42;
        System.out.println(x+y+z);
        int b,c,d;
        b=5;
        d=b;
        c=d;
        System.out.println(c); */
        // Identifiers start with letters(small/capital), dollar, containing underscore and does not  containing whitespaces 
     /* int employee_Age = 10;
        float $Salary = 29999.999f;
        String Per_month = "30 days"; 
        System.out.println(employee_Age+" "+$Salary+" "+Per_month); */
        // using final keyword 
     /* final int z=30;
        //z=389;
        System.out.println(z); */
        // Data Types primitive( byte(127 to -128), short(32767 to -32768), int, long(.l), float(.f), double(.d), boolean(True,False), char )
     /* byte a=-128;
        short b=32767;
        int c=-598;
        float d=4653455.00f;
        double e=7654674896467654.6465776d;
        boolean f=true;
        char g=67;
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);  */
        //var keyword
     /* var x=5;
        //x=39.0f;
        System.out.println((x)); */ 
        //Type Casting 
        //Widening(Automatically) Casting. i.e; smaller to larger
        int a=5;
        double b = a;      //not require representing any type
        System.out.println(b);
        //Narrowing(Mannually) Casting. i.e; larger to smaller
        double c = 50948.0809485908d;
        float d = (float)c;    // compulsary representing type
        System.out.println(d);
    }
}
