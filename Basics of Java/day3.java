public class day3 {
    public static void main(String args[]){
    /*  1. Using Scanner in java.
        first importing import java.util.Scanner package
        Syntax: Scanner object_Name = new Scanner(System.in);
                Data_Type variable_Name = object_Name.nextDatype();
        for String                                    .nextLine();
        for char                                      .next().charAt(index 0); 
        
        2. Print - it prints text not go for the next line.
        3. println - it prints text after that go for the next line.
        4. printf - it prints text and using access specifiers. they are 
              %s - String
              %S - String(Uppercase)
              %c - char
              %C - char(Uppercase)
              %d - integer
              %f - float
              %.2f - float (after . 2 values only)
              %b - boolean 
              %B - boolean(Uppercase)
              %e - scintific notation(lower case) (ex;12345-> 1.2345*(10)**4)
              %E - scintific notation(upper case) (ex;0.00001234-> 1.234*(10)**-5)
        example for printf
    */
    int a = 10;
    String b = "Mangoes";
    char c = 'x'; 
    System.out.printf("I bought %d %s, for %d rupees\"\n", a, b, (int)c);

    }
    
}
