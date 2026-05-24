package Arrays;
import java.util.Scanner;
public class day7test {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        //Keep asking the user to guess a number until they get it right. Give hints: "Too High" / "Too Low".
       /*  int guess, high = 50,low = 35, secret_number = 47;
        do{
            System.out.print("Enter the number 1 to 100: ");
            guess = sc.nextInt();
            if(guess <= 0 || guess > 111){
                System.out.print("please enter the number only 1 to 100 ");
            }else if(guess == secret_number){
                System.out.println("Your guess is correct!");
            }else if(!(guess == secret_number)){
                System.out.print("Your guess is wrong!");
            }if(guess > high){
                System.out.println(" And Your guess is too high");
            }else if (guess < low){
                System.out.println(" And Your guess is too low");
            }else{
                System.out.println(" And Your guess is too close");
            }
        }while(!(guess == secret_number));
         */
        //Take n and find factorial using a loop.
/*         System.out.println("Enter a number: ");
        int n = sc.nextInt(),fact = 1;
        for(int i = 1;i <= n; i++){
            fact = fact * i;
        }
        System.out.println("Given number "+n+" of factorial is "+fact);
         */
        //Take n and count how many digits it has (using a loop).
   /*      System.out.print("Enter a number: ");
        int number = sc.nextInt(),digit = 0, count = 0;
        while(number > 0){
            digit = number%10;
            count++;
            number = number/10;
        }
        System.out.println("If the given number can contains "+count+" digits");
 */
        //Take start and end as input and count the even and odd numbers between them.
     /*    System.out.print("Enter start and end numbers: ");
        int start = sc.nextInt(), end = sc.nextInt(),even = 0 , odd = 0;
        for(int i = start;i <= end; i++){
            if(i%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("From "+start+" to "+end+", have "+even+" even numbers and "+odd+" odd numbers");
 */
        //Take n and print first n Fibonacci numbers.
    /*     System.out.print("Enter n number: ");
        int n = sc.nextInt(), a = 0, b = 1, c = 0;
        for(int i = 0;i < n; i++){
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;
        }
         */

        //Print unique numbers in an array.
    /*     int arr[] = {10,20,10,50,30,20,10,30,20,40};
        for(int i = 0;i < arr.length; i++){
            int count = 0;
            for(int j = 0;j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("In the given array, The unique numbers are "+arr[i]);
            }
        }
 */
        //Find the sum of digits in a number until it becomes a single digit.
       /*  System.out.print("Enter a number: ");
        int number = sc.nextInt();
        while(number > 9){
            int sum = 0;
            while(number > 0){
                sum += number % 10;
                number = number / 10;
            }
            number = sum;
        }
        System.out.println("sum of digits  until becomes a sigle digit is "+number);
 */
        //Take n and check if it’s an Armstrong number. Example: 153 → 1³ + 5³ + 3³ = 153.
    /*     System.out.print("Enater a number: ");
        int n = sc.nextInt(),Armstrong = 0, digit = 0,original = n;
        while(n > 0){
            digit = n % 10;
            Armstrong += digit * digit * digit;
            n = n /10;
        }
        if(Armstrong == original){
            System.out.println("Given number is a armstrong number");
        }else{
            System.out.println("Given number is not a armstrong number");
        }
         */
        //Take n and print its multiplication table from 1 to 10.
      /*   System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("prints the "+n+" multiplication table");
        for(int i = 1;i <= 10; i++){
            System.out.println(n+" X "+i+" = "+ i*n);
        }
 */
        //Take n numbers and find the sum of alternate elements Example: 1 2 3 4 5 → sum = 1 + 3 + 5.
      /*  System.out.print("Enter the size: ");
       int size = sc.nextInt(),sum = 0;
       int arr[] = new int[size];
       System.out.println("Enter the data in array: ");
       for(int i = 0;i < arr.length; i++){
           arr[i] = sc.nextInt();
        }
       for(int j = 0;j < arr.length; j+=2){
           sum += arr[j];
        }
        System.out.println("sum of alternative elements is "+sum);
         */
        //Take n numbers and print the array after removing duplicates (keep first occurrence only).
   /*      int arr[] = {10,20,10,30,45,30,60};
        for(int i = 0;i < arr.length; i++){
            boolean isDuplicate = false;
            for(int j = 0;j < i; j++){
                if(arr[j] == arr[i]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.println(arr[i]);
            }
        }
    */
        //Check if a number is perfect (sum of its divisors equals the number). Example: 6 → 1 + 2 + 3 = 6.
        System.out.print("Enter a number: ");
        int number = sc.nextInt(), sum = 0;
        for(int i = 1; i < number/2; i++){
            if(number%i == 0){
                sum += i;
            }
        }
        if(sum == number){
            System.out.println(number+" is a perfect number");
        }else{
            System.out.println(number+" is not a perfect number");
        }
        sc.close();
    }

}
