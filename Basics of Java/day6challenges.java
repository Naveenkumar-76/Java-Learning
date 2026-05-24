import java.util.Scanner;

public class day6challenges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Take n as input, then take n numbers from the user, store them in an
        // array, and print them all.
        /*
         * System.out.print("Enter the size of array: ");
         * int n = sc.nextInt();
         * int arr[] = new int[n];
         * System.out.println("Enter the values in array: ");
         * for(int i = 0;i < arr.length; i++){
         * arr[i] = sc.nextInt();
         * }
         * System.out.println("Array data is ");
         * for(int x : arr){
         * System.out.println(x);
         * }
         */
        // 2. Take n numbers in an array and find: The sum of all elements , The average
        // of all elements
        /*
         * float arr[] = new float[]{10,20.05f,30,40.07f},sum = 0;
         * for(int i = 0;i < arr.length; i++){
         * sum += arr[i];
         * }
         * System.out.println("Given array of total elements is "+sum);
         * System.out.println("The average of array is "+(int)sum/arr.length);
         */
        // 3. Take n numbers in an array and find: The largest number, The smallest
        // number
        /*
         * int arr[] = {5,6,8,1,6,4,3,}, largest = arr[0],smallest = arr[0];
         * for(int i = 0;i < arr.length; i++){
         * if(largest < arr[i]){
         * largest = arr[i];
         * }else if(smallest > arr[i]){
         * smallest = arr[i];
         * }
         * }
         * System.out.println("In the array, largest number is "
         * +largest+" and smallest number is "+smallest);
         */
        // 4. Take n numbers in an array and one more number (key). Check whether the key exists in the array or not.
        // Print "Found" or "Not Found" accordingly.
        int arr[] = new int[] { 3, 7, 9 }, key;
        do {
            System.out.print("Enter the number 1 to 10(key): ");
            key = sc.nextInt();
            if (key > 0 || key < 10) {
                System.out.println("Please enter the number only 1 to 10 ");
            }
            boolean Found = false;
            for (int x : arr) {
                if (key == x) {
                    Found = true;
                    break;
                } 
            }
            if(Found){
               System.out.println("Found ");
            }else{
                System.out.println("Not Found ");
            }
        } while (!(key > 0 || key < 10));

        sc.close();
    }

}
