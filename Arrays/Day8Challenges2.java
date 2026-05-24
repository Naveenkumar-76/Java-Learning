package Arrays;
public class Day8Challenges2 {
    public static void main(String[] args) {

        // 🔹 Day 8 – 2D Arrays & Matrix Logic

        // 1️. Row–Wise Even–Odd Counter
        // For a given matrix, count even and odd elements in each row separately.
        /*
         * int arr[][] = {{45,5,8,12},{23,41,78,56},{7,45,6,77},{44,22,31,02}};
         * for(int i = 0; i<arr.length; i++){
         * int even = 0, odd = 0;
         * for(int j = 0; j<arr[i].length; j++){
         * if(arr[i][j]%2==0){
         * even++;
         * }else{
         * odd++;
         * }
         * }
         * System.out.println("Row "+(i+1)+" has "+even+" even elements");
         * System.out.println("Row "+(i+1)+" has "+odd+" odd elements");
         * }
         */
        // 2️. Column–Wise Positive–Negative Analyzer
        // Count positive, negative, and zero elements in each column.
        /*
         * int arr[][] = {{45,-5,8,0},{0,41,-8,56},{7,-06,6,-77},{44,-2,0,02}};
         * for(int j = 0; j<arr[0].length; j++){
         * int pos=0,neg =0,zero = 0;
         * for(int i = 0; i<arr.length; i++){
         * if(arr[i][j]>0){
         * pos++;
         * }else if(arr[i][j]<0){
         * neg++;
         * }else{
         * zero++;
         * }
         * }
         * System.out.println(pos>0?"Column "+(j+1)+" has "+pos+" positive elements"
         * :"column "+(j+1)+" don't have positive elements");
         * System.out.println(neg>0?"Column "+(j+1)+" has "+neg+" negative elements"
         * :"column "+(j+1)+" don't have negative elements");
         * System.out.println(zero>0?"Column "+(j+1)+" has "+zero+" zero elements"
         * :"column "+(j+1)+" don't have Zero elements");
         * }
         * 
         */
        // 3️. Maximum Element in Each Row (No Shortcuts)
        // Find the largest element of every row without using Math functions.
        /*
         * int arr[][] = {{45,5,8,12},{-5,-9,-1,-25},{0,45,6,77},{44,22,31,02}};
         * for(int i = 0; i<arr.length; i++){
         * int maxelement = Integer.MIN_VALUE;
         * for(int j = 0; j<arr[i].length; j++){
         * if(arr[i][j]>maxelement){
         * maxelement = arr[i][j];
         * }
         * }
         * System.out.println("Row "+(i+1)+" contain Largest element is "+maxelement);
         * }
         */

        // 4️. Minimum Element in Entire Matrix (Negative Trap)
        // Find the smallest element in a matrix that may contain only negative values.
        /*
         * int arr[][] = {{45,5,8,12},{-5,-9,-1,-25},{0,45,6,77},{44,22,31,02}};
         * int minelement = Integer.MAX_VALUE;
         * for(int i = 0; i<arr.length; i++){
         * for(int j = 0; j<arr[i].length; j++){
         * if(arr[i][j]<minelement){
         * minelement = arr[i][j];
         * }
         * }
         * }
         * System.out.println("Entire matrix contain Smallest element is "+minelement);
         */
        // 5️ Row with Maximum Sum, Find which row index has the highest sum.
        /*
         * int arr[][] = {{45,5,8,12},{-5,-9,-1,-25},{0,45,6,77},{44,22,31,02}};
         * int maxsum = Integer.MIN_VALUE,rowindex = 0;
         * for(int i = 0; i<arr.length; i++){
         * int sum = 0;
         * for(int j = 0; j<arr[i].length; j++){
         * sum+=arr[i][j];
         * }
         * if(sum>maxsum){
         * maxsum = sum;
         * rowindex = i+1;
         * }
         * }
         * System.out.println("Row "+rowindex+" has Highest sum is "+maxsum);
         */
        // 6️. Column with Minimum Sum
        // Find which column index has the lowest sum.
        /*
         * int arr[][] =
         * {{-45,-5,-8,-12},{-5,-9,-1,-25},{0,-145,-6,-77},{-44,-22,-31,-02}};
         * int minisum = Integer.MAX_VALUE,colindex = 0;
         * for(int j = 0; j<arr[0].length; j++){
         * int sum = 0;
         * for(int i = 0; i<arr.length; i++){
         * sum+=arr[i][j];
         * }
         * if(sum<minisum){
         * minisum = sum;
         * colindex = j+1;
         * }
         * }
         * System.out.println("COlumn "+colindex+" has Lowest sum is "+minisum);
         */
        // 7️. Matrix Reverse Print vs Reverse Rows
        // First: print matrix from last row to first row (do not modify). Then: reverse
        // each row in-place.
        /*
         * int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
         * System.out.println("Matrix Reverse is: ");
         * for(int i = arr.length-1; i>=0; i--){
         * for(int j = 0; j<arr[i].length; j++){
         * System.out.print(arr[i][j]+" ");
         * }
         * System.out.println();
         * }
         * System.out.println("Reverse rows of a matrix is: ");
         * for(int i = 0; i<arr.length; i++){
         * for(int j = arr[i].length-1; j>=0; j--){
         * System.out.print(arr[i][j]+" ");
         * }
         * System.out.println();
         * }
         */
        // 8️. Palindrome Row Check
        // Check whether each row of the matrix is a palindrome.
        /*
         * int arr[][] = {{1,2,1,2,1},{4,5,6,4},{7,8,7}};
         * for(int i = 0; i<arr.length; i++){
         * boolean ispalindrome = true;
         * for(int j = 0; j<arr[i].length/2; j++){
         * if(arr[i][j] != arr[i][arr[i].length-1-j]){
         * ispalindrome = false;
         * break;
         * }
         * }
         * System.out.println(ispalindrome?"Row "+(i+1)+" is palindrome ":"Row "+(i+1)
         * +" is not a palindrome");
         * }
         */
        // 9️. Sum of Even Index Columns
        // Calculate the sum of elements present in even-indexed columns.
        /*
         * int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
         * for(int j = 0; j<arr[0].length; j+=2){
         * int sum = 0;
         * for(int i = 0; i<arr.length; i++){
         * sum+=arr[i][j];
         * }
         * System.out.println("Index "+(j+1)+" Sum is "+sum);
         * }
         */
        // 10. Average of Odd Numbers in Matrix
        // Find the average of all odd-valued elements in the matrix.
        /* 
         * int arr[][] = {{45,78,14},{6,45,78},{89,44,12}};
         * int count = 0, sum = 0;
         * for(int i = 0; i<arr.length; i++){
         * for(int j = 0; j<arr[i].length; j++){
         * if(arr[i][j]%2!=0){
         * sum+=arr[i][j];
         * count++;
         * }
         * }
         * }
         * if(count != 0){
         * System.out.
         * println("In the given matrix all of oodd-valued elements Average is "+(sum/
         * count));
         * }else{
         * System.out.println("Given matrix doesn't contain odd-valued elements");
         * }
         */

        // 1️1️. Frequency of an Element (Matrix Level)
        // Given a number, count how many times it appears in the matrix.
    /*     int matrix[][] = {};
        int count = 0, target = 8;
        if (matrix.length == 0 || matrix == null) {
            System.out.println("Matix is empty");
        } else {
            for (int i = 0; i <= matrix.length; i++) {
                if(matrix[i] == null || matrix[i].length == 0){
                    continue;
                }
                for (int j = 0; j <= matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        count++;
                    }
                }
            }
        }
        System.out.println(
                count > 0 ? "The target element occurs " + count + " times" : "The target value is not occured");
 */
          
        //1️2. Duplicate Elements Only (Matrix)
        //Print only elements that appear more than once in the matrix.
              //1D array
  /*       int arr[] = {1,2,4,5,1,2,7,8,6,8};
        boolean visited[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            if(visited[i] == true){
                continue;
            }
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[i] = true;
                    break;
                }
            }
            if(count > 1){
                System.out.print(arr[i]+" ");
            }
        }

                   //2D array
        int matrix[][] = {{4,5,4},{8,7,7},{1,8,4}};
        boolean visit[][] = new boolean[matrix.length][matrix[0].length];
        //int visit[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int count = 0;
                if(visit[i][j] == true){
                    continue;
                }
                for(int k = 0; k < matrix.length; k++){
                    for(int l = 0; l < matrix[k].length; l++){
                        if(matrix[i][j] == matrix[k][l]&&!visit[k][l]){
                            count++;
                            visit[k][l] = true;
                        }
                    }
                }
                if(count > 1){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
       */  
      
        //1️3️. Maximum Frequency Element in Matrix, 
        // Find which element has the highest frequency.
   /*      int arr[][] = {{1, 2, 1},{4 ,4 ,6},{7, 7, 7}};
        boolean visit[][] = new boolean[arr.length][arr[0].length];
        int highfreq = 0,highfeqelement = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int count = 0;
                if(visit[i][j] == true){
                    continue;
                }
                for(int k = 0; k < arr.length; k++){
                    for(int l = 0; l < arr[k].length; l++){
                        if(arr[i][j] == arr[k][l]&&!visit[k][l]){
                            count++; 
                            visit[k][l] = true;
                        }
                    }
                }
                if(count > highfreq){
                    highfreq = count;
                    highfeqelement = arr[i][j];
                }
            }
        }
        if(highfeqelement != 0){
            System.out.println(" The Element " + highfeqelement + " has high frequency " + highfreq);
        }else{
            System.out.println("Given matrix doest not contain frequeny elements");
        }
      */     
        //1️4️. First Occurrence Search (2D)
        //Search for a given element and print its first (row, col) position.
  /*       int matrix[][] = {{4,5,7},{7,3,2,4},{9,6,7,8}};
        int target = 8;
        boolean found = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == target){
                    System.out.println("Search element " + target + " occurs at First position (row,column) " + (i+1) + "," + (j+1));
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("Search element is not found ");
        }
       */  
        //1️5️. Last Occurrence Search (2D)
        //Search for a given element and print its last (row, col) position.
    /*     int matrix[][] = {{4,5,7},{7,3,2,4},{9,6,7,8}};
        int target = 0;
        boolean found = false;
        for(int i = matrix.length-1; i >= 0; i--){
            for(int j = matrix[i].length-1; j >= 0; j--){
                if(matrix[i][j] == target){
                    System.out.println("Search element " + target + " occurs at last position (row,column) " + (i+1) + "," + (j+1));
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("Search element is not found ");
        }
        */ 
        //1️6. Element Exists or Not (Matrix)
        //Check whether a given element exists in the matrix. Print: Found or Not Found
   /*      int matrix[][] = {{4,5,7},{7,3,2,4},{9,6,7,8}};
        int target = 0;
        boolean found = false;
        for(int i = matrix.length-1; i >= 0; i--){
            for(int j = matrix[i].length-1; j >= 0; j--){
                if(matrix[i][j] == target){
                    System.out.println("Found");
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("not found ");
        }
 */
        //1️7️. Replace Negatives with Zero (Matrix Modify)
        //Traverse the matrix and replace all negative values with 0.
   /*      int arr[][] = {{-1,Integer.MIN_VALUE,5},{7,-0,-6},{-4,-8,-1}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < 0){
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
 */
        //1️8️. Count Elements Greater Than Matrix Average
        //Find the average of all elements, then count how many elements are greater than average.
     /*    int matrix[][] = {{1,0,3},{4,5,-6},{-7,-8,-9}};
        int sum = 0,count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sum+=matrix[i][j];
                count++;
            }
        }
        int average = sum/count;
        count = 0;
        System.out.println("The average of all elements is: " + average);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(average < matrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println("The matrix has " + count + " elements grater than average");
     */    
        //1️9️. Difference Between Max & Min (Matrix)
        //Find the difference between maximum and minimum elements of the matrix.
 /*        int matrix[][] = {{1,0,3},{4,5,-6},{-7,-8,-9}};
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(max < matrix[i][j]){
                    max = matrix[i][j];
                }
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Difference between maximum and minimum elements is " + (max - min));
     */    

        //2️0️. Spiral Traversal Thinking (Conceptual)
        //Print the matrix in spiral order.
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int rowstart = 0, rowend = matrix.length-1;
        int colstart = 0, colend = matrix[0].length-1;
        
        while(rowstart <= rowend && colstart <= colend){
            for(int j = colstart; j <= colend; j++){
                System.out.print(matrix[rowstart][j] + " ");
            }
            rowstart++;
            for(int i = rowstart; i <= rowend; i++){
                System.out.print(matrix[i][colend] + " ");
            }
            colend--;
            if(rowstart <= rowend){
                for(int j = colend; j >= colstart; j--){
                    System.out.print(matrix[rowend][j] + " ");
                }
                rowend--;
            }
            if(colstart <= colend){
                for(int i = rowend; i >= rowstart; i--){
                    System.out.print(matrix[i][colstart] + " ");
                }
                colstart++;
            }
        }
    }
}
