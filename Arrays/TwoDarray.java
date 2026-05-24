package Arrays;
public class TwoDarray {
    public static void main(String args[]){
        //Print the sum of elements of an multi-dimensional array
      /*   int arr[][] = {
            {1,8,4},
            {9,7,2},
            {7,6,4}
        };
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("Given sum of elements is "+sum);

        //Add the elements of two arrays and print the output in console
        int arr1[][] = {{1,2,1},{9,7,2},{7,6,4}};
        int arr2[][] = {{2,6,8},{0,1,3},{1,2,4}};
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){ 
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
   */
        
        //create an array square of existing array
     /*    int arr[][] = {
            {1,8,4},
            {9,7,2},
            {7,6,4}
        };
        int  square[][] = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                square[i][j] = arr[i][j] * arr[i][j];
                System.out.print(square[i][j]+" ");
            }
            System.out.println();
        }
 */
         
        //Print the common elements between two arrays
      /*   int arr[][] = {{1,2,1},{9,7,2},{7,6,4}};
        int arr1[][]= {{2,6,8,6},{0,1,3,9,7},{7,2,0},{8,3}};
        System.out.print("The common elements are: ");
        for(int i  = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                int result = arr[i][j];
                boolean alreadyprinted = false;
                for(int x = 0; x < i && !alreadyprinted; x++){
                    for(int y = 0; y < arr[x].length; y++){
                        if(arr[x][y] == result){
                            alreadyprinted = true;
                            break;
                        }
                    }
                }
            if(alreadyprinted){
                continue;
            }
            boolean found = false;
            for(int k = 0; k < arr1.length && !found; k++){
                for(int l = 0; l < arr1[k].length; l++){
                    if(result == arr1[k][l]){
                        found = true;
                        System.out.print(result+" ");
                        break;
                    }
                }               
            }
        }  
        }
         */

        // create an two arrays and common elements print one and non common elements print zero
     /*    int arr1[][] = {{1,2,1},{9,7,2},{7,6,4}};
        int arr2[][] = {{1,6,1},{0,7,3},{1,6,2}};
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                int result = arr1[i][j];
                boolean found = false;
                for(int k = 0; k < arr2.length; k++){
                    for(int l = 0; l < arr2[k].length; l++){
                        if(result == arr2[k][l]){
                            found = true;
                        }
                    }
                }
                if(found){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
         */

        //interchange the values of an array by transporting the index values
        int arr[][] = {{1,8,4},{9,7,2},{7,6,4}};
        for(int i  = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
