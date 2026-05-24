package Arrays;
public class Arrays {
    public static void main(String[] args){
        // Print the sum, average, largest , even or odd(count) and reverse of the integers in an integer array 
      /*   int arr[] = {5,8,9,10,4};
        int sum = 0,largest = 0,even = 0,odd = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
            
        }
        System.out.println("Sum of the integers is "+sum);
        System.out.println("Avrage of integers is "+(float)sum/arr.length);
        System.out.println("largest number of the integer array is "+largest);
        System.out.println("In the given array can contains "+even+" even numbers "+"and "+odd+" odd numbers");
        System.out.print("Reverse of array is ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
 */
        //Merge two arrays and print output in console
        /* 
        String arr1[] = {"naveen","pavan"};
        String arr2[] = {"sita","geetha","kaantha"};
        String arr3[] = new String[arr1.length+arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length; i++){
            arr3[k++] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            arr3[k++] = arr2[i];
        }
        for(String merge : arr3){
            System.out.print(merge+" ");
        }
   */

        // Check array is sorted or not
      /*   int[] arr = {1, 2, 3, 5, 8};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted == true){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
             */

        //6️ Find duplicate elements
      /*   int[] arr = {1, 2, 3, 2, 4, 3, 2};
        for(int i = 0; i < arr.length; i++){
            boolean isalreadyPrinted = false;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    isalreadyPrinted = true;
                    break;
                }
            }
            if(isalreadyPrinted){
                continue;
            }
            for(int k = i+1; k < arr.length; k++){
                if(arr[i] == arr[k]){
                    System.out.println(arr[i]);
                    break;
                }
            }
            
        }
 */
        // 7️ Merge two arrays
    /*     int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = new int [a.length+b.length];
        int k = 0;
        for(int i = 0; i < a.length; i++){
            c[k] = a[i];
            k++;
        }
        for(int i = 0; i < b.length; i++){
            c[k] = b[i];
            k++;
        }
        for(int merge : c){
            System.out.print(merge+" ");
        }
        */ 

        //8️ Find second largest element
    /*      int[] arr = {10, 5, 25, 13, 20, 8, 11};
        int high = Integer.MIN_VALUE,sec =  Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(high < arr[i]){
                sec = high;
                high = arr[i];
            }else if (sec < arr[i]&& arr[i] < high) {
                sec = arr[i];
            }
        }
        System.out.println("The second largest value is "+sec);
 */
 
         //9️ Rotate array left by 1 {1, 2, 3, 4} → {2, 3, 4, 1}
     /*    int arr[] = {1, 2, 3, 4};
        int first = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
        for(int g : arr){
            System.out.print(g+" ");
        }
         */

        // Remove duplicate elements {1, 2, 2, 3} → {1, 2, 3}
     /*    int arr[] = {1,2,2,3};
        for(int i  = 0; i < arr.length; i++){
            boolean alreadyprinted = false;
            for(int k = 0; k < i; k++){
                if(arr[k]==arr[i]){
                    alreadyprinted = true;
                    break;
                }
            }
            if(!alreadyprinted){
                System.out.println(arr[i]);
            }
           
        }
  */
                        //  OR

      /*   int[] arr = {1, 2, 2, 3, 7, 8, 7, 10,};
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        System.out.print("After removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
         */

        //Print all elements of array:
        //Print array elements in reverse order (don’t reverse array yet).
        //Find the sum of all elements in an array.
        //Count how many elements are even.
/* 
        int sum = 0,count = 0;
        int[] arr = {3, 6, 9, 12};
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
            if(arr[i]%2==0){
                count++;
            }
            sum += arr[i];
        }
        System.out.println("Sum of alements in an array is "+sum);
        System.out.println("Given array contains "+count+" even elements");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
 */   

        //Modify logic to find second largest (think only, don’t code fully yet).
/* 
        int arr[] = { 23, 5, 10,25 , 15, 11, 22, 20,24};
        int max = arr[arr.length-1],sec = 0;
        for(int i = arr.length -1; i>=0; i--){
            if( max < arr[i] ){
                sec = max;
                max = arr[i];
            }else if(sec < arr[i] ){
                sec = arr[i];
            }
            
        }
        System.out.println("In the given array second largest element is "+sec);
         */
        //Find max using while loop. 
/* 
        int arr1[] = {2,23, 5, 10,25 , 15, 22, 20,24,1};
        int i = 0,max1 = arr[0], min = arr[0];
        while(i<arr1.length){
            if(arr1[i] > max1){
                max1 = arr1[i];
            }if(arr1[i] < min){
                min = arr1[i];
            }
            i++;
        }
        System.out.println("in the given array max element is "+max1);
        System.out.println("in the given array min element is "+min);
 */
     // reverse order using for and while loops
 /*        int[] arr = {1, 2, 3, 4};  
        int start = 0, end = arr.length -1; 
        while ( end > start){ 
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int a[] = {1,2,3,4};
        int s = 0, e = a.length-1;
        for(int i = s; i < e; i++){
            int temp = a[i];
            a[i]= a[e];
            a[e] = temp;
            e--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(a[i]+" ");
        }
         */

        //Find frequency of elements:
        //Print only elements with frequency > 1.
        //Count how many unique elements are present.
/* 
        int[] arr = {4, 5, 4, 6, 5, 4};
        boolean visited[] = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j = i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            //all elements
            System.out.println(arr[i]+" -> "+count);
            //Exist more than 1
            if(count >1){
                System.out.println(arr[i]+" -> "+count);
            }
            //unique elements
            if(count == 1){
                System.out.println(arr[i]+" -> "+count);
            }
        }
 */
        //Find element with maximum frequency
 /*        int arr1[] = {1,2,3,4,1,2,1,3,5,5,5,6,5,5,3,1};
        boolean visit[] = new boolean[arr1.length];
        int i = 0,max = 0,maxelement = arr1[0];
        while(i<arr1.length){
            if(visit[i] == true){
                i++;
                continue;
            }
            int count = 1, j = i+1;
            while(j<arr1.length){
                if(arr1[i] == arr1[j]){
                    count++;
                    visit[j] = true;
                }
                j++;
            }
            if(max < count){
                max = count;
                maxelement = arr1[i];
            }
            i++;
        }
        System.out.println(maxelement+" -> "+max);
  */

              //2D arrays

        //🟢 Challenge 1 – Print boundary elements of a matrix
        //🟢 Challenge 2 – Print matrix in spiral order
  /*       int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        int rowstart = 0, rowend = arr.length-1;
        int colstart = 0, colend = arr[0].length-1;
        while(rowstart <= rowend&&colstart<=colend){
            for(int j = colstart; j<=colend; j++){
                System.out.print(arr[rowstart][j]+" ");
            } 
            rowstart++;
            for(int i = rowstart; i<=rowend; i++){
                System.out.print(arr[i][colend]+" ");
            }
            colend--;
            if(rowstart<=rowend){
                for(int j = colend; j>=colstart; j--){
                    System.out.print(arr[rowend][j]+" ");
                }
                rowend--;
            }
            if(colstart>=colend){
                for(int i = rowend; i>=rowstart; i--){
                    System.out.print(arr[i][colstart]+" ");
                }
                colstart++;
            }
        }
      */   
        //🟢 Challenge 3 – Print zig-zag (snake) pattern
 /*        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i<arr.length; i++){
            if(i%2==0){
                for(int j = 0; j<arr[i].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j = arr[i].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
      */   

        //🟢 Challenge 5 – Print plus (+) pattern in matrix
  /*       int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i==arr.length/2 || j==arr[i].length/2){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
     */    
        //🟢 Challenge 6 – Fill matrix with consecutive numbers in spiral order
   /*      int n = 3,num = 1;
        int matrix[][] = new int[n][n];
        int rowstart = 0, rowend = n-1;
        int colstart = 0, colend = n-1;
        while(rowstart<=rowend && colstart<=colend){
            for(int j = colstart; j<=colend;j++){
                matrix[rowstart][j] = num++;
            }
            rowstart++;
            for(int i = rowstart; i<= rowend; i++){
                matrix[i][colend] = num++;
            }
            colend--;
            if(rowstart<=rowend){
                for(int j = colend;j>=colstart; j--){
                    matrix[rowend][j] = num++;
                }
                rowend--;
            }
            if(colstart<=colend){
                for(int i = rowend; i>=rowstart; i--){
                    matrix[i][colstart] = num++;
                }
                colstart++;
            }
        }
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
      */   

        //🟢 Challenge 7 – Sum border elements
  /*       int arr[][] = {{10,20,15,10},{45,85,56,25},{4,12,25,48},{48,42,78,32}};
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(i == 0 || i==arr.length-1 || j==0 ||j == arr[i].length-1){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of border elements is "+sum);
     */    

                         //OR

/*         int arr[][] = {{10,20,15,10},{45,85,56,25},{4,12,25,48},{48,42,78,32}};
        int sum = 0;
        for(int j = 0; j<arr[0].length; j++){
            sum+=arr[0][j];
        }
        for(int j = 0; j<arr[0].length; j++){
            sum+=arr[arr.length-1][j];
        }
        for(int i = 1; i<arr.length-1; i++){
            sum+=arr[i][0];
        }
        for(int i = 1; i<arr.length-1; i++){
            sum+=arr[i][arr[0].length-1];
        }
        System.out.println("Sum of border elements is "+sum);
     */    


        //🟢 Challenge 8 – Find maximum sum row in spiral traversal
        int arr[][] = {{10,20,15,10},{45,85,56,25},{4,12,25,48},{48,0,0,32}};
        int sum = 0,maxsum = Integer.MIN_VALUE,segment =0;
        for(int j = 0; j<arr[0].length; j++){
            sum+=arr[0][j];
        }
        if(sum > maxsum){
            maxsum=sum;
            segment = 1;
        }
        sum = 0;
        for(int i = 1; i<arr.length-1; i++){
            sum+=arr[i][arr[0].length-1];
            
        }
        if(sum > maxsum){
            maxsum=sum;
            segment = 2;
        }
        sum = 0;
        for(int j = arr[0].length-1; j>=0;j-- ){
            sum+=arr[arr.length-1][j];
        }
        if(sum > maxsum){
            maxsum=sum;
            segment = 3;
        }
        sum = 0;
        for(int i = arr.length-2; i>0; i--){
            sum+=arr[i][0];
        }
        if(sum > maxsum){
            maxsum=sum;
            segment=4;
        }
        System.out.println("Maximum sum row in spiral order is "+segment);
    }
    
}

