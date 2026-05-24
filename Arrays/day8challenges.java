package Arrays;
import java.util.Scanner;
public class day8challenges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*  //1. Matrix sum - Take a 2D array(3x3) and print sum of all elements.
        int arr[][] = {
            {6,9,3},
            {9,3,6},
            {2,1,4}
        },  arr_1[][]={
            {89,99,22},
            {44,66,33},
            {11,22,55}
        };
        int sum =0;
        System.out.print("sum of elememnts is: ");
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];//+arr_1[i][j];
            }
        }
        System.out.println(sum);
        //2. Row sum - Print sum of each row separately.
        int row_sum = 0;
        System.out.print("The total of row sum is: ");
        for(int i = 0; i < arr_1.length - 2; i++){
            for(int j = 0; j < arr_1[i].length; j++){
                row_sum += arr_1[i][j];
            }
        }
        System.out.println(row_sum);
        //3. column sum - print sum of each column separately.
        int column_sum = 0;
        System.out.print("The total of column sum is: ");
        for(int i = 0; i < arr_1[0].length - 2; i++){
            for(int j = 0; j < arr_1.length; j++){
                column_sum += arr_1[j][i];
            }
        }
        System.out.println(column_sum);
         */
        //4. Transpose of Matrix 
       /*  int arr[][] = {
            {6,9,3},
            {9,3,6},
            {2,1,4}
        };
        int Transpose[][] = new int[arr.length][arr[0].length];
        System.out.println("The arr Transpose is: ");
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                Transpose[i][j] = arr[j][i];
                System.out.print( Transpose[i][j]+"  ");
            }
            System.out.println();
        }
        
        //5. Max element in Matrix. 
        int max_element = 0;
         for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                if(max_element < arr[i][j]){
                    max_element = arr[i][j];
                }
            }
        }
        System.out.println("In the given array Max element is "+max_element);
 */
        //6. search element - Take input from user and search if element exists.
   /*        int arr[][] = {
            {6,9,3},
            {9,3,6},
            {2,1,4}
        },search_element , i = 0 , j = 0;
        boolean found = false;
        do{
            System.out.println("Enter a number from 1 to 10: ");
            search_element = sc.nextInt();
            for( i = 0; i < arr.length; i++ ){
                for( j = 0; j < arr[i].length; j++){
                    if(search_element == arr[i][j]){
                        found = true;
                        break;
                    }else{
                        found = false;
                        continue;
                    }
                }
            }
            if(found){
                System.out.println("found");
            }else{
                System.out.println("Not found");
            }
        }while(!(found));
         */
        //7. Diagonal sum - Print sum of primary & seconaday diagonal.
    /*     int arr[][] = {
            {6,9,3},
            {9,3,6},
            {2,1,4}
        },primary_sum = 0,secondary_sum = 0;
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 0; j < arr[i].length; j++){
                if( i == j){
                   primary_sum += arr[i][j];
                }
                if( i + j == arr.length - 1 ){
                   secondary_sum += arr[i][j];
                }
            }
        }
        System.out.println("Primary diagonal sum is "+primary_sum);
        System.out.println("Primary diagonal sum is "+secondary_sum);
 */
        //8. Matrix Addition - Take two matrices and print their sum. 
       /*   int arr[][] = {
            {6,9,3},
            {9,3,6},
            {2,1,4}
        },  arr_1[][]={
            {89,99,22},
            {44,66,33},
            {11,22,55}
        },Addition [][] = new int[arr.length][arr_1[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                Addition[i][j] = arr[i][j] + arr_1[i][j];
                System.out.print( Addition[i][j]+"  ");
            }
            System.out.println();
        } */
        //9. Matrix multiplication.
     /*      int arr[][] = {
            {6,9,3},
            {9,3,6},
            {2,1,4}
        },  arr_1[][]={
            {8,9,2},
            {4,6,3},
            {1,2,5}
        },multiplication [][] = new int[arr.length][arr_1[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr_1[0].length; j++){
                int sum = 0;
                for(int k = 0; k < arr[0].length; k++){
                    sum += arr[i][k] * arr_1[k][j];
                }
                multiplication[i][j] = sum;
                System.out.print( multiplication[i][j]+"  ");
            }
            System.out.println();
        }
         */
        //10. Snake pattern print.(row1-> left to right, row 2 -> right to left).
   /*      int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
               for(int j = 0; j < arr[i].length ; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j = arr[i].length -1; j >= 0; j--){
                     System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();  
        }
 */

        //🟢 Challenge 1, Create a 2×3 matrix and print it.
 /*        System.out.println("Enter Rows and Columns: ");
        int x = sc.nextInt(), y = sc.nextInt();
        int arr[][] = new int[x][y];
        System.out.println("Store the data into array: ");
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array data is: ");
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       */  
        //🟢 Challenge 2: Print only the first row of a matrix.
        //3. Print only the last column of a matrix.
 /*        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i<1; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int lastcol = arr[0].length-1;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i][lastcol]+" ");
        }
     */    
        //Count total elements in a 2D array.
        //Find the sum of all elements in a matrix.
 /*        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int count = 0, sum = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                count++;
                sum+=arr[i][j];
            }
        }
        System.out.println("The given array contains "+count+" elements");
        System.out.println("The sum of all elements in a matrix is: "+sum);
 */
        //Print the matrix in row-wise format.
        //Print the matrix in column-wise format.
  /*       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Row-wise format: ");
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Column-wise format: ");
        for(int j = 0; j < arr[0].length; j++){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
 */
  
        //Find the largest element in a 2D array. 
 /*        int arr[][] = {{1,8,9},{6,4,9},{7,11,8}};
        int max = arr[0][0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("In the given array Largest element is: "+max);
   */      

        //Print only even indexed rows.
        //Print only odd indexed columns.
   /*      int arr[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println("Even indxed rows is: ");
        for(int i = 0; i< arr.length; i+=2){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Odd indxed columns is: ");
        for(int j = 1; j<arr[0].length; j+=2){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
 */
        //Print matrix in Z-shape
 /*        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = arr.length;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i ==  0 || i == n-1){
                    System.out.print(arr[i][j]+" ");
                }else if(j == n-1-i){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     */     

        //print matrix C traversal
  /*       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[0][i]+" ");
        }
        for(int i = 1; i<arr[0].length; i++){
            System.out.print(arr[i][0]+" ");
        }
        for(int j = 1; j<arr[0].length; j++){
            System.out.print(arr[2][j]+" ");
        }
      */  
     
        //Find sum of each row.
        //Find maximum element of each row.
        //Count even numbers in each row.
        //Check which row has all positive elements.
        //Print row number with highest sum.
/* 
        int arr[][] ={{11,44,2},{88,-5,-3},{7,8,9}};
        int highsum = 0,rownum = 0;
        for(int i = 0; i<arr.length; i++){
            int sum = 0,maxelement = arr[i][0],count = 0;
            boolean allpos = false;
            for(int j = 0; j<arr[i].length; j++){
                sum+=arr[i][j];
                if(arr[i][j] > maxelement){
                    maxelement = arr[i][j];
                }
                if(arr[i][j]%2==0){
                    count++;
                }
                if(arr[i][j]<=0){
                    allpos = false;
                    break;
                }
            }
            if(sum > highsum){
                highsum = sum;
                rownum = i+1;
            }
            System.out.println("Sum of row "+(i+1)+" is "+sum);
            System.out.println("Maximum element of row "+(i+1)+" is "+maxelement);
            System.out.println("row "+(i+1)+" has "+count+" even numbers ");
            if(allpos){
                System.out.println("Row "+(i+1)+" has all positive elements");
            }
        }
        System.out.println("row "+rownum+" has highest sum is "+highsum);
 */

        //Find sum of each column.
        //Find minimum element of each column.
  /*       int arr[][] ={{11,44,2},{88,-5,-3},{7,88,9}};
        for(int j = 0; j<arr[0].length; j++){
            int sum = 0,minelement = arr[0][j];
            for(int i = 0; i<arr.length; i++){
                sum+=arr[i][j];
                if(arr[i][j]< minelement){
                    minelement = arr[i][j];
                }
            }
            System.out.println("sum of column "+(j+1)+" is "+sum);
            System.out.println("minimum element of column "+(j+1)+" is "+minelement);
        }
         */
        //Print column number with lowest sum.
   /*      int arr[][] ={{11,44,2},{8,-5,-3},{7,8,9}};
        int col_no = 0, minisum = Integer.MAX_VALUE;
        for(int j = 0; j<arr[0].length; j++){
            int sum = 0;
            for(int i = 0; i<arr.length; i++){
                sum += arr[i][j];
            }
            if(minisum > sum){
                minisum = sum;
                col_no = j+1;
            }
        }
        System.out.println(col_no+" Column has lowest sum is "+minisum);

 */

        //Print primary diagonal.
        //Find sum of primary diagonal.
        //Print secondary diagonal.
        //Find sum of secondary diagonal.
   /*      int arr[][] = {{1,2,3},{4,5,6},{7,8,9}},prisum = 0,secsum = 0;
        System.out.print("Primary Diagonal: ");
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                    prisum+=arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of Primaray diagonal is "+prisum);
        System.out.println("Secondary Diagonal: ");
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(i+j == arr.length-1){
                    System.out.print(arr[i][j]+" ");
                    secsum+=arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of Primaray diagonal is "+secsum);
 */
       

        //Print both diagonals.
  /*       int arr[][] = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println("Both Diagonals: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i][i]+" ");
            if(i!= arr.length-i-1){
                System.out.print(arr[i][arr.length-1-i]+" ");
            }
        }
      */  
        //Check if matrix is diagonal matrix.
  /*       int arr[][] = {{1,0,0},{0,1,0},{0,0,1}};
        boolean isdiagonal = true;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i != j &&arr[i][j]!=0){
                    isdiagonal = false;
                    break;
                }
            }
            if(!isdiagonal){
                break;
            }
        }
        if(isdiagonal){
            System.out.println("Given matrix is diagonal");
        }else{
            System.out.println("Given matrix is not a diagonal");
        }
      */   
        //Check if matrix is identity matrix.
    /*     int arr[][] = {{1,0,0},{0,1,0},{0,0,1}};
        boolean isdiagonal = true;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i == j){
                    if(arr[i][j] != 1){
                        isdiagonal = false;
                        break;
                    }
                }else{
                    if(arr[i][j]!=0){
                        isdiagonal = false;
                        break;
                    }
                }
            }
            if(!isdiagonal){
                break;
            }
        }
        if(isdiagonal){
            System.out.println("Given matrix is diagonal");
        }else{
            System.out.println("Given matrix is not a diagonal");
        }
 */
        //Print  X pattern using matrix.
  /*       int arr[][] = {{1,0,1},{0,1,0},{1,0,1}};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }else if(i+j == arr.length-1){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     */    

        //Find transpose of a matrix.
  /*       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int transpose[][] = new int[arr[0].length][arr.length];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose diagram is: ");
        for(int j = 0; j<transpose.length; j++ ){
            for(int k = 0; k<transpose[j].length; k++){
                System.out.print(transpose[j][k]+" ");
            }
            System.out.println();
        }
     */    

        //Print mirror image (left–right).
   /*      int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Mirror image is : ");
        for(int i = 0; i<rows; i++){
            for(int j = cols-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     */    
        //Print mirror image (top–bottom).
    /*     int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        System.out.println("Mirror image is : ");
        for(int i = rows-1; i>=0; i--){
            for(int j = 0; j<cols; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     */    

        //Rotate matrix 90° clockwise.
   /*      int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int transpose[][] = new int[arr[0].length][arr.length];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("After rotate 90' clockwise matrix is ");
        for(int i = 0; i<transpose.length; i++){
            for(int j = transpose[i].length-1; j>=0; j--){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
         */
        //Rotate matrix 90° anticlockwise.
   /*      int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = arr.length;
        int cols = arr[0].length;
        int transpose[][] = new int[arr[0].length][arr.length];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println("After rotate 90' Anti-clockwise matrix is ");
        for(int i = transpose.length-1; i>=0; i--){
            for(int j = 0; j<transpose[i].length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
      */   


        //Check if matrix is symmetric.
 /*        int arr[][] = {{1,0,1},{0,1,0},{1,0,1}};
        int rows = arr.length;
        int cols = arr[0].length;
        boolean issymmetric = true;
        for(int i = 0; i<rows; i++){
            for(int j = i+1; j<cols; j++){
                if(arr[i][j] != arr[j][i]){
                    issymmetric = false;
                    break;
                }
            }
            if(!issymmetric){
                break;
            }
            
        }
        if(issymmetric){
            System.out.println("Given matrix is a Symmetric");
        }else{
            System.out.println("Given matrix is not a Symmetric");
        }
         */

        //Check if matrix is palindromic row-wise.
/*         int arr[][] = {{1,0,1},{7,2,7},{4,8,2}};
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0;i<rows; i++){
            boolean ispalindrome = true;
            for(int j = 0; j<cols/2; j++){
                if(arr[i][j]!= arr[i][cols-1-j]){
                    ispalindrome = false;
                    break;
                }
            }
            if(ispalindrome){
                System.out.println("row "+(i+1)+" is a palindromic row");
            }else{
                System.out.println("row "+(i+1)+" is not a palindromic row");
            }
        }
        */
       
        //Convert matrix into upper triangular matrix.
    /*     int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(!(i<=j)){
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
      */   
        sc.close();
    }
}
