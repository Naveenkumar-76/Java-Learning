
public class Patterns {
    public static void main(String[] args) {

        //Pattern 3 — Right-Angled Triangle (Increasing Stars)

        // Print triangle for n = 5.
/* 
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
        // Print triangle using while loop only.
/* 
        int n = 5, i =1;
        while(i<=n){
            int j = 1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
 */
       
        //Reverse this pattern vertically.  
 /*        int n =5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
        //Pattern 3 — Right-Angled Triangle (Decreasing Stars)               

        /*   Print:
        5555
        444
        33
        2 */
/* 
        for(int i = 5; i>=2; i--){
            for(int j = 1; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
         */

        //Print decreasing triangle using formula stars = n - i.
/* 
        int n = 5;
        for(int i =1; i<=n; i++){
            for(int j = 1; j<= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

        //Convert this pattern to do-while loop.

   /*      int n = 5,i = 1;
        do{
            int j = 1;
            do{
                System.out.print("*");
                j++;
            }while(j<=n-i+1);
            System.out.println();
            i++;
        }while(n>=i);
 */
        //Pattern 4 — Right-Aligned Triangle (Spaces + Stars)

      //Print right-aligned triangle for n = 5.
   /*    
      int n=5;
      for(int i =1;i<=n; i++){
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        for(int k =1; k<= i; k++){
            System.out.print("*");
        }
        System.out.println();
      }
 */

        //Print right-aligned triangle using while loops only.
/* 
        int n = 5, i = 1;
        while(i <= n){
            int j = 1,k = 1;
            while(j<= n -i){
                System.out.print(" ");
                j++;
            }while(k <= i){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
 */
        // Stars = 2*i - 1, right-aligned.
        /* 
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int k = i; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        


        //Pattern 5 — Pyramid Pattern (Centered, Odd Stars)

        // Print pyramid for n = 5.
/* 
        for(int i = 1; i<=5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

/*         Print pyramid using numbers:
        1
        222
        33333
        4444444 */
/* 
        for(int i = 1; i<=4;i++){
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print(i);
            }
            System.out.println();
        }
         */
 

        //Pattern Programs 💎 Diamond Pattern 

        //Print diamond for n = 5.
/* 
        for(int i = 1; i<=5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 5-1; i>=1; i--){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
       /* 
        Print diamond using numbers:
        1
        222
        33333
        4444444
        33333
        222
        1    */
/* 
        for(int i = 1; i<=4;i++){
            for(int j = 1; j <=2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i = 4-1; i>=1; i--){
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print(i);
            }
            System.out.println();
        }

 */
        //Print hollow diamond (only borders).
    /*     
        for(int i = 1; i<=5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            } 
            System.out.print("*");
            if(i>1){
                for(int l = 1; l<=2*i-3; l++){
                    System.out.print(" ");
                }
                System.out.print("*");     
            }
            System.out.println();
        }
        for(int i = 5-1; i>=1; i--){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>1){
                 for(int l = 1; l<=2*i-3; l++){
                    System.out.print(" ");
                }
                System.out.print("*");
            } 
            System.out.println();
        }
         */
        // Print diamond using while loops only.
/* 
        int n = 5,i=1;
        while(i<=n){
            int j = 1,k=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            while(k<=2*i-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        int l = n-1;
        while(l>=1){
            int j = 1,k=1;
            while(j<=n-l){
                System.out.print(" ");
                j++;
            }
            while(k<=2*l-1){
                System.out.print("*");
                k++;
            }
            System.out.println();
            l--;
        }
         */

        //Convert diamond into hourglass pattern.
/* 
        for(int i = 5; i >=1; i--){
            for(int j = 5;j> i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i <= 5; i++){
            for(int j = 1; j<= 5-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= 2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
 */
    }
}
