package Arrays;
//import java.util.Scanner;
public class jaggedarray {
    public static void main(String[] args){

        //Create a jagged array with 3 rows of different sizes and print it.
        //Take user input for a jagged array.
   /*      Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix rows: ");
        int arr[][] = new int[sc.nextInt()][];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter row "+i+1+" colums: ");
            arr[i] = new int[sc.nextInt()];
        }
        System.out.println("Enter the data into jagged array: ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The jagged array is ");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
     */    
        //Find sum of each row in jagged array.
        //Find maximum element in entire jagged array.
        //Count total elements in jagged array.
/*         int arr[][] = {{1,22,3},{45,5},{0,8,1}};
        int maxelement = arr[0][0],count = 0;
        for(int i = 0; i<arr.length; i++){
            int sum = 0; 
            for(int j =0; j<arr[i].length; j++){
                sum+=arr[i][j];
                count++;
                if(arr[i][j] > maxelement){
                    maxelement = arr[i][j];
                }
            }
            System.out.println("Sum of row "+(i+1)+" is "+sum);
        }
        System.out.println("In entire jagged array maximum element is "+maxelement);
        System.out.println("Given jagged array contains "+count+" elements");
 */

        //Print only rows with even number of elements.
        //Find row with maximum sum.
        //Safely print jagged array with null row handling.
/*         int arr[][] = {{12,3,14},{100,5},{45,12,70}};
        int maxsum = Integer.MIN_VALUE,rowno = 0;
        for(int i = 0; i<arr.length; i++){
            int evenno = 0, tempsum = 0;
            if(arr[i]!=null){
                for(int j = 0; j<arr[i].length; j++){
                    tempsum+=arr[i][j];
                    if(arr[i][j]%2==0){
                        evenno++;
                    }
                }
                if(tempsum > maxsum){
                    maxsum = tempsum;
                    rowno = i+1;
                }
            }
            System.out.println("Row "+(i+1)+" has "+evenno+" even numbers");
        }
        System.out.println("Row "+rowno+" has highest sum is "+maxsum);
     */   
    
        
    }
}
