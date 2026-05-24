public class Patterns2 {
    public static void main(String[] args) {

        //13.Riht Angled triangle
/* 
        for(int i = 1; i<=4; i++){
            for(int j = 1;j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
 */
        //14. Inverted Right triangle
/* 
        for(int i = 4; i>= 1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */

        //15. Number triangle 
/* 
        for(int i = 1; i<=4; i++){
            for(int j = 1;j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
 */
        //16. Repeated Number triangle 
/* 
        for(int i = 1; i<=4; i++){
            for(int j = 1;j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
 */

        //17. Floyd's Triangle
/* 
        int k = 1;
        for(int i = 1; i<=4; i++){
            for(int j = 1;j <= i; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
         */

        //18. Pramid Pattern 
/* 
        for(int i = 1; i<=4; i++){
            for( int j = 1; j <= 4 - i; j++ ){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

        //19. Inverted Pyramid
/* 
        for(int i = 4; i>=1;i--){
            for(int k = 1; k<= 4-i; k++){
                System.out.print(" "); 
            }
            for(int j = 1;j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       */

        //20. Diamond pattern

        for(int i= 1; i <= 3; i++){
            for(int j = 1; j<= 3 - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 3-1; i>=1; i--){
            for(int j = 1; j <= 3-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<= 2*i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
