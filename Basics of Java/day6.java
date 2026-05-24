import java.util.Scanner;
public class day6 {
    public static void main(String args[]){
        // Arrays 
    Scanner sc = new Scanner(System.in);    
    //Take n integers as input and print their total sum.
  /*   System.out.print("Enter the array size: ");
    int s = sc.nextInt(),sum = 0;
    int arr[] = new int[s];
    System.out.println("store the values in array: ");
    for(int i = 0;i < s; i++){
        arr[i] = sc.nextInt();
    }
    for(int j = 0;j < s; j++){
        sum = sum + arr[j];
    }
    System.out.println("sum of given numbers is "+sum);
 */
    //Read an array and print the largest and smallest numbers.
   /*   int arr[] = new int[] {10,25,45,23,56,97,5};
    int a = arr[0],b = arr[0];
    for(int i = 0;i < arr.length; i++){
        if(a < arr[i]){
            a = arr[i];
        }
       else{
            b = arr[i];
        }
    }
    System.out.println("In the given array the largest number is "+a);
    System.out.println("In the given array the smallest number is "+b);
  */
    //Count how many even and odd numbers are present.
  /*   System.out.print("Enter the array size: ");
    int size = sc.nextInt();
    int arr[] = new int[size], even = 0, odd = 0, j = 0;
    System.out.println("Enter the values in array: ");
    for(int i = 0;i < size; i++){
        arr[i] = sc.nextInt();
    }
    while(j < size){
        if(arr[j]%2 == 0){
            even++;
        }else{
            odd++;
        }
        j++;
    }
    System.out.println("In the given array can contain's "+even+" even numbers! and "+odd+" odd numbers!");
     */
 
    //Print the array elements in reverse order without changing the array.
  /*   int arr[] = {10,20,30,40,50};
    for(int i = arr.length - 1;i >= 0; i--){
       System.out.print(arr[i]+" ");
    } */
    //Find the second largest element without sorting.
/*     int arr[] = {30,45,90,18,100,50,90,92,92,74}, temp = arr[0],sec = 0;
    for(int i = 0;i < arr.length; i++){
        if(temp < arr[i]){
            sec = temp;
            temp = arr[i];
        }else if(temp > sec && sec <= arr[i]){
            sec = arr[i];
        }
    }
    System.out.println("In the array, the second largest element is "+sec);
     */
  
    //Rotate all elements to the left by 1 position. Example: [1,2,3,4] → [2,3,4,1].
 /*    int arr[] = {1,2,3,4}, end = arr[0];
    for(int i = 0;i < arr.length-1; i++){
        arr[i] = arr[i+1];
    }
    arr[arr.length-1] = end;
    for(int x : arr){
        System.out.println(x);
    }
     */
    //Print all pairs of elements whose sum equals a given target.
 /*    int arr[] = {10,20,10,5,15},equal = 30,temp = 0;
    for(int i = 0;i < arr.length; i++){
        int j = i;
        for( j = i + 1;j < arr.length; j++){
            temp = arr[i];
            arr[i] += arr[j];
            if(arr[i] == equal){
                System.out.println(temp+", "+arr[j]);
            }
        }
    }
     */
sc.close();
} 
    
}