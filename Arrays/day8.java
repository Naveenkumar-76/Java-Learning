package Arrays;
import java.util.Scanner;

public class day8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Input a 2-D array from the user and print it.
        /*
        System.out.println("Enter the size of 2-D array: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        System.out.println("Enter the data in 2-D array: ");
        int arr[][] = new int[row][column];
        for(int i = 0;i < row; i++){
            for(int j = 0;j < column; j++){
                arr[i][j] = sc.nextInt();
             }
        }
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         */
        // Find the sum of each row and each column.
     /*    int arr[][] = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };
        for (int i = 0; i < arr.length; i++) {
            int row_sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                    row_sum += arr[i][j];
            }
            System.out.println("Row "+i+" sum is "+row_sum);
        }
        for (int j = 0;j < arr[0].length; j++){
            int column_sum = 0;
            for (int i = 0; i < arr.length; i++){
                    column_sum += arr[i][j];
            }
            System.out.println("column "+j+"sum is "+column_sum);
        }
  */
        // Find the largest element in the matrix.
   /*      int arr[][] = {{1,8,6},{4,6,9}},largest = arr[0][0];
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                if(largest < arr[i][j]){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("In the given array, the largest element is "+largest);
 */
        // print the common elements between 2 arrays.
    /*     int arr[][] = {{10,10,5},{5,3,4,6}};
        int arr_1[][] = {{60,10,78},{8,3,10,6}};
        System.out.println("common elements are: ");
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                int value = arr[i][j];
                boolean found = false;
                for(int k = 0;k < arr_1.length && !found; k++){
                    for(int l = 0;l < arr_1[k].length; l++){
                        if(value == arr_1[k][l]){
                            System.out.print(value+" ");
                            found = true;
                            break;
                        }   
                    }
                }
            }
        }
 */
        // based on 2 array's prints 1 for same numbers and same position in 2 arrays otherwise 0
      /*   int arr[][] = {{10,10,5},{5,3,4,6}};
        int arr_1[][] = {{60,10,78},{8,3,10,6}};
        System.out.println("updated matix is: ");
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                if(j < arr[i].length && arr[i][j] == arr_1[i][j]){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
           */                 
        // Print the transpose of a matrix (rows become columns).
     /*    int arr[][] = {{10,10,5,9},{5,3,4,6},{8,3,10,6}};
        for(int i = 0;i < arr[0].length; i++){
            for(int j = 0;j < arr.length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
         */
        // Check if a matrix is symmetric.
     /*    int arr[][] = {
        {1,2,3},
        {2,5,6},
        {3,6,9}};
        boolean symmetric = false;
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                if(arr[i][j] == arr[j][i]){
                    symmetric = true;
                    break;
                }
            }
        }
        if(symmetric){
            System.out.println("Given matrix is a symmetric");
        }else{
            System.out.println("Given matrix is not a symmetric");
        }
         */
        // Add two matrices.
       /*  int arr[][] = {
        {1,4,7},
        {2,5,8},
        {3,6,9}},arr_1[][] = {
        {7,1,4},
        {8,2,5},
        {9,3,6}};
        if(arr.length != arr_1.length){
            System.out.println("Matrics are must be have same no.of rows");
            return;
        }
        for(int i = 0 ; i < arr[0].length; i++){
            if(arr[i].length != arr_1[i].length){
                System.out.println("row "+i+" different colums sums ");
                return;
            }
        }
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length; j++){
                arr[i][j] = arr[i][j]+arr_1[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } */

     /*    // Multiply two matrices (classic interview question).
        int arr[][] = {
        {1,4,7},
        {2,5,8},
        {3,6,9}},arr_1[][] = {
        {7,1,4},
        {8,2,5},
        {9,3,6}};
        if(arr[0].length != arr_1.length){
            System.out.println("Matrics are must be have same no.of rows and columns");
            return;
        }
        int result[][] = new int[arr.length][arr_1[0].length]; 
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr_1[0].length; j++){
                int sum = 0;
                for(int k = 0; k < arr[0].length; k++){
                    sum += arr[i][k] * arr_1[k][j];
                }
                result[i][j] = sum;
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
         */
        // create an array with squares of the existing array elements.
        int arr[][] = {
        {1,4,7},
        {2,5,8},
        {3,6,9}};
        int squre[][] = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                squre[i][j] = arr[i][j]*arr[i][j];
                System.out.print(squre[i][j]+" ");
            }
            System.out.println();
        }

        
        
        sc.close();
    }

}
