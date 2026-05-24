public class ChallengesDay11set2 {
    //1️⃣ Multiply Digits
    // Create a method multiplyDigits(int n) that returns the product of all digits of a number.
    // Example: multiplyDigits(234) → 234 = 24
    static int multiplyDigits(int digit, int n) {
        if(n == 0) {
            return digit;
        }
        return multiplyDigits(digit * (n % 10), n / 10);
    }
    //2️⃣ Sum of Even Numbers in N
    // Write sumEven(int n) that returns the sum of first n even numbers using recursion.
    // Example: sumEven(5) → 2+4+6+8+10 = 30
    static int sumEven(int n) {
        if(n == 0) 
            return 0;
        return (2 * n) + sumEven(n - 1);
    }
    //3️⃣ Count Odd Digits
    // countOddDigits(int n) returns the number of odd digits in n.
    // Example: countOddDigits(3457) → 3
    static int countOddDigits(int number, int oddcount) {
        if(number == 0) { 
            return oddcount;
        }
        if(number % 2 != 0) 
            oddcount += 1;
        return countOddDigits(number / 10, oddcount);
    } 
    //4️⃣ Reverse and Sum
    // Write reverseSum(int n) that reverses the number and adds it to the original number.
    // Example: reverseSum(123) → 123 + 321 = 444
    static int reverseSum(int original, int current, int reversed) {
        if(current == 0)
            return original + reversed;
        return reverseSum(original, current / 10,  reversed * 10 + (current % 10));
    }
    //5️⃣ Check Palindrome Number
    // isPalindrome(int n, int rev) returns true if the number is palindrome using recursion.
    // Hint: rev starts at 0 and accumulates digits like your reverse method.
    static boolean ispalindrome(int original, int current, int reversed) {
        if(current == 0)
            if(original == reversed) {
                return true;
            }else {
                return false;
            }
        return ispalindrome(original, current / 10, reversed * 10 + (current % 10));
    }
    //6️⃣ Custom Power Variation
    // powerSum(int a, int n) → return aⁿ + a^(n-1) + … + a¹ recursively.
    // Example: powerSum(2, 3) → 2³ + 2² + 2¹ = 8 + 4 + 2 = 14
/*        static int powerSum(int a, int n, int sum) {
        int i = 1, iterationsum = 1;
        if(n == 0){
            return sum;
        }
        while(n >= i){
            iterationsum *= a;
            i++;
        }
        return powerSum(a, n - 1, sum + iterationsum);
    }
 */
    static int power (int a, int n) {
        if(n == 0){
            return 1;
        }
        return a * power(a, n - 1);
    }
    static int powerSum(int a, int n) {
        if(n == 0){
            return 0;
        }
        return power(a, n) + powerSum(a, n - 1);
    }
    //8️⃣ Sum of Squares
    // sumSquares(int n) returns 1² + 2² + … + n² using recursion.
    static int sumSquares(int n) {
        if(n == 0){
            return 0;
        }
        return (n * n) + sumSquares(n -1);
    }
    //9️⃣ Max Digit in Number
    // maxDigit(int n) returns the maximum digit of a number recursively.
    // Example: maxDigit(3921) → 9
    static int maxDigit(int number, int maxdigit) {
        if(number == 0) {
            return maxdigit;
        }
        if(maxdigit < number % 10){
            maxdigit = number % 10;
        }
        return maxDigit(number / 10, maxdigit);
    }
    public static void main(String[] args) {
        System.out.println(multiplyDigits(1,234));
        System.out.println(sumEven(5));
        System.out.println(countOddDigits(3457, 0));
        int reversedsum = reverseSum(123, 123, 0);
        System.out.println(reversedsum);
        System.out.println(ispalindrome(021, 120, 0));
        System.out.println(powerSum(2, 3));
        System.out.println(sumSquares(5));
        System.out.println(maxDigit(9367, 0));
    }
}
