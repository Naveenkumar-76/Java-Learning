package Arrays;
//import java.util.Scanner;
public class Day7Challenges2 {
    public static void main(String[] args) {

        //1️. Even–Odd Counter
        // Given an integer array, count how many even and odd numbers are present.
   /*      int arr[] = {10,7,5,4,3,6,9,45,12,5};
        int even = 0, odd = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("In the given array contains "+even+" even numbers");
        System.out.println("In the given array contains "+odd+" odd numbers");
 */
        //2️. Positive–Negative Analyzer
        //Count how many elements are positive, negative, and zero in an array.
/*         int arr[] = {-5,5,-6,6,4,-5,0,9,7,0};
        int pos = 0, neg = 0, zero = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                pos++;
            }else if(arr[i] < 0){
                neg++;
            }else{
                zero++;
            }
        }
        System.out.println("In the given array contains "+pos+" Positive numbers");
        System.out.println("In the given array contains "+neg+" negative numbers");
        System.out.println("In the given array contains "+zero+" zeros");
 */

        //3️. Maximum Element (positive Trap)
        //Find the largest element in an array without using Math.max.
/*         int arr[] = {12,3,25,46,88,9,99,12};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("In the given array largest element is "+max);
  */

        //4️. Minimum Element (Negative Trap)
        //Find the smallest element in an array that contains only negative numbers.
  /*       int arr[] = {12,3,25,46,88,9,0,-99,12};
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("In the given array smallest element is "+min);
   */

        //5️. Second Largest Element, Find the second largest element in an array.
/*         int arr[] = {-12,-30,-25,-46,-88,-91,-9,-99,-12};
        int max = arr[0],sec = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max || sec < arr[i]){
                sec = max;
                max = arr[i];
            }
        }
        System.out.println("In the given array second largest element is "+sec);

     */  

        //6️. Print the array in reverse order without modifying it, then reverse the array in-place.
/*         int arr[] = {1,2,3,4};
        System.out.print("Reverse order is: ");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
 */

        //7️. Palindrome Array Check, Check whether an array is a palindrome.
                       //METHOD - I
/*         int arr[] = {1, 2, 3, 2, 1};
        int original[] = new int[arr.length],j=0;
        for(int i = arr.length-1; i >= 0; i--){
            original[j] = arr[i];
            j++;
        }
        boolean ispalin = true;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != original[i]){
                ispalin = false;
                break;
            }
        }
        if(ispalin){
        System.out.println("Given array is a palindrome");
        }else {
            System.out.println("Given array is not a palindrome");
        }
                           //METHOD - II
        int arr1[] = {1, 2, 3, 2, 1};
        int start = 0, end = arr1.length-1;
        boolean isPalindrome = true;
        for(int i = start; i < end; i++){
            if(arr1[i] != arr1[end]){
                isPalindrome = false;
                break;
            }
            end--;
        }
        if(isPalindrome){
            System.out.println("Given array is a palindrome");
        } else {
            System.out.println("Given array is not a palindrome");
        }
   */      
       
        //8️. Sum of Even Index Elements, Calculate the sum of elements present at even indexes.
  /*       int arr[] = {5,6,5,8,-4,3,7,1,9};
        int sum = 0;
        for(int i = 0; i<arr.length; i+=2){
            sum+=arr[i];
        }
        System.out.println("Sum of Even Index Elements is "+sum);
     */    

        //9️. Average of Odd Numbers, Find the average of odd-valued elements in the array.
 /*        int arr[] = {5,6,5,8,-4,3,7,1,9};
        int sum = 0,j=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
                j++;
            }
        }
        if(j > 0){
            float avg = (float) sum / j;
            System.out.println("Average of Odd-valued Elements is " + avg);
        } else {
            System.out.println("No odd elements present in the array");
        }
         */

        //10. Frequency Printer, Print frequency of each element, but do not repeat elements.
   /*      int arr[] = {1,2,3,1,2,5,4,4,6,3,5,2,3,4,2,4};
        boolean visited[] = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(visited[i]==true){
                continue;
            }
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+" -> "+count+" times");
        }
     */ 
        //1️1️. Duplicate Elements Only, Print only elements whose frequency > 1.
 /*        int arr[] = {4,6,5,6,6};
        boolean visited[] = new boolean[arr.length];
        boolean foundduplicate = false;
        System.out.print("Duplicate elements is ");
        for(int j = 0; j<arr.length; j++){
            if(visited[j] == true){
                continue;
            }
            int count = 1;
            for(int k = j+1; k<arr.length; k++){
                if(arr[k] == arr[j]){
                    count++;
                    visited[k] = true;
                }
            }
            if(count > 1){
                System.out.println(arr[j]+" -> "+count+" times ");
                foundduplicate = true;
            }
        }
        if(!foundduplicate){
            System.out.println("There is no duplicates ");
        }
         */

        //1️2️. Unique Elements Counter, Count how many unique elements are present in the array.
   /*      String st[] = {"one","two","one","two","two","three"};
        boolean visited[] = new boolean[st.length];
        int freqcount = 0;
        for(int i = 0; i<st.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i+1; j<st.length; j++){
                if(st[j] == st[i]){
                    count ++;
                    visited[j] = true;
                }
            }
            if(count == 1){
                freqcount++;
            }
        }
        if(freqcount > 0){
            System.out.println("In the given array countains "+ freqcount + " unique elements");
        }else{
            System.out.println("There is no unique elements");
        }
 */

        //1️3️. Maximum Frequency Element, Find which element occurs maximum number of times.
 /*        String st[] = {"one","two","one","two","two","three"};
        boolean visited[] = new boolean[st.length];
        int maxfreqcount = 1;
        String freqelement = st[0];
        for(int i = 0; i<st.length; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j = i+1; j<st.length; j++){
                if(st[j] == st[i]){
                    count ++;
                    visited[j] = true;
                }
            }
            if(count > maxfreqcount){
                maxfreqcount = count;
                freqelement = st[i];
            }
        }
        if(maxfreqcount > 1){
            System.out.println(freqelement+" element occurs "+maxfreqcount+" times");
        }else{
            System.out.println("There is no duplicate elements");
        }
     */    

        //1️4️. First Occurrence Search, Search for a given element and print the first index where it appears.
  /*       int arr[] = {1,2,3,4,1,2,3,1,5,6,5,4};
        int searchelemnt = 5;
        boolean found = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == searchelemnt){
                System.out.println("Element "+searchelemnt+" is occurs at index of "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Given Search_element "+searchelemnt+" is not occuered");
        }
         */


        //1️5️. Last Occurrence Search, Search for a given element and print the last occurrence index.
 /*        int arr[] = {1,2,3,4,1,2,3,1,5,6,5,4};
        int searchelemnt = 5;
        boolean found = false;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] == searchelemnt){
                System.out.println("Element "+searchelemnt+" is occurs at index of "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Given Search_element "+searchelemnt+" is not occuered");
        }
     */    

        //1️6️. Element Exists or Not, Check whether a given number exists in the array, Print: "Found" or "Not Found".
 /*        int arr[] = {1,2,3,4,1,2,3,1,5,6,5,4};
        Scanner sc = new Scanner(System.in);
        Boolean found;
        do{
            found = false;
            System.out.print("Please! Enter your number from 1 to 9: ");
            int n = sc.nextInt();
            for(int i = 0; i<arr.length; i++){
                if(n == arr[i]){
                    System.out.println("Given number is found successfully");
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Given number is not found, Try again");
            }

        }while(!found);
        sc.close();
      */   

        //1️7️. Replace Negatives with Zero, Traverse the array and replace all negative values with 0.
 /*        int arr[] = {1,-3,5,-4,-6,7,9};
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
            System.out.print(arr[i]+" ");
        }
   */      

        //1️8️. Count Elements Greater Than Average, Find the average of the array, then count elements greater than average.
   /*      int arr[] = {22,15,9,6,7,45,32};
        int sum = 0,count = 0;
        for(int ar : arr){
            sum+=ar;
        }
        int average = sum/arr.length;
        for(int i = 0; i<arr.length; i++){
            if(average < arr[i]){
                count++;
            }
        }
        System.out.println("Sum of given array is "+sum);
        System.out.println("Average of given array is "+average);
        System.out.println("The given array contais "+count+" greater than average");
 */

        //1️9️. Smallest & Largest Difference, Find the difference between max and min elements.
  /*       int arr[] = {22,55,88,66,19,33,44,99};
        int max = arr[0], min = arr[0];
        for(int dif : arr){
            if(dif > max){
                max = dif;
            }
            if(dif < min){
                min = dif;
            }
        }
        System.out.println("In the given array maximum element is "+max);
        System.out.println("In the given array manimum element is "+min);
        System.out.println("Difference of max and min element is "+ (max-min));
 */
  


        //2️0. Rotation Thinking (Conceptual), Rotate the array right by 1 position.
        // Example: {1, 2, 3, 4} → {4, 1, 2, 3}
        int arr[] = {1,2,3,4};
        int last = arr[arr.length-1];
        for(int i = arr.length-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int var: arr){
            System.out.print(var+"  ");
        }
    }
}