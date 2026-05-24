package Strings;
public class Day9Strings {
    public static void main(String[] args) {

        //1️⃣ Count Characters, Write logic to count total characters without using length().
  /*       String st = "Java mastery";
        int count = 0;
        for(int i = 0; ; i++){
            try{
                st.charAt(i);
                count++;
            }catch(StringIndexOutOfBoundsException e){
                break;
            }
        }
        System.out.println(count);
        //2️⃣ Vowel Counter, Count vowels in a string using charAt() and loops.
        int vowelcount = 0;
        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                vowelcount++;
            }
        }
        System.out.println(vowelcount);
     */    
        //3️⃣ Reverse a String, Reverse a string without using StringBuilder.
  /*       String st = "Java";
        String rev = "";
        for(int i = st.length()-1; i >= 0; i--){
            rev = rev + st.charAt(i);
        }
        System.out.println(rev);
        //4️⃣ Palindrome Check, Check if a string is palindrome using charAt().
        String string = "mom";
        String dup = "";
        for(int i = string.length()-1; i >= 0; i--){
            dup = dup + string.charAt(i);
        }
        if(dup.equals(string)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a pPalindrome ");
        }
      */   
        //5️⃣ Word Count, Count number of words in a sentence (single spaces only).
    /*     String word = "if is   if  if   if ";
        int count = 0;
        for(int i = 0; i < word.length(); i++){
             if(word.charAt(i) != ' ' && (i == 0 || word.charAt(i - 1) == ' ')){
                count++;
            }
        }
        System.out.println(count);
      */   
        //6️⃣ Case Normalizer, Convert: "jAvA mAsTeRy" to: "JAVA MASTERY"
  /*       String string = "jAvA mAsTeRy";
        System.out.println(string = string.toUpperCase());
        //7️⃣ Character Search, Check whether a given character exists in a string. 
        String st = "Java mastery";
        char ch = 't';
        boolean bool = false;
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) == ch){
                bool = true;
                break;
            }
        }
        System.out.print(bool ? "found " : "not found ");
      */   

        //1️⃣ Count Types, Count: Alphabets, Digits, Special characters
   /*      String st = "a1p17@ 6E7$ D1#t$";
        int alpha = 0, digit = 0, spchar = 0;
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z' || st.charAt(i) >= 'A' && st.charAt(i) <= 'Z'){
                alpha++;
            }else if(st.charAt(i) >= '0' && st.charAt(i) <= '9'){
                digit++;
            }else{
                spchar++;
            }
        }
        System.out.println("Given string contains " + alpha + " alpahbets");
        System.out.println("Given string contains " + digit + " digits");
        System.out.println("Given string contains " + spchar + " spcial charatcters");
 */
        //2️⃣ Sum of Digits in String, Input: "a1b2c3" Output: 6
   /*      String input = "a1b2c3";
        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(input.charAt(i) >= 48 && input.charAt(i) <= 57){
                sum += ch - '0';
            }
        }
        System.out.println(sum);
      */   

        //3️⃣ Uppercase Counter, Count only uppercase letters.
   /*      String st = "UpperCase Counter";
        int count = 0;
        for(int i = 0; i < st.length(); i++){
            if(Character.isUpperCase(i)){
                count++;
            }
        }
        System.out.println("Given String contains " + count + " Uppercase letters");
     */    
        //5️⃣ Password Validator, Rules: At least 1 digit, At least 1 alphabet, At least 1 special character
    /*     String pass = "Nav@76";
        int i = 0;
        boolean isalpha = false, isdigit = false, isspechar = false;
        while (i < pass.length()) {
            if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z' 
              || pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z'){
                isalpha = true;
            }else if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9'){
                isdigit = true;
            }else{
                isspechar = true;
            }
            i++;
        }
        if(isalpha && isdigit &&  isspechar){
            System.out.println("Password valid");
        }else{
            System.out.println("Password not valid");
        }
      */   
        //6️⃣ Extract Digits, From "ab12c3" → print 123
    /*     String st = "ab12c3";
        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            if(st.charAt(i) >= '0' && st.charAt(i) <= '9'){
                System.out.print(ch);
            }
        }
        //7️⃣ Remove Special Characters, Input: "a@b#1$2", Output: "ab12" 
        String input = "a@b#1$2";
        String output = "";
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z' 
              || input.charAt(i) >= 'A' && input.charAt(i) <= 'Z'
             || input.charAt(i) >= '0' && input.charAt(i) <= '9'){
                output = output + input.charAt(i);
             }
        }
        System.out.println(output); */


                                   //StringBuilder
        
        //1️⃣ Reverse a String, Reverse a string using StringBuilder.
        //2️⃣ Palindrome Check,Check if a string is palindrome using StringBuilder.
    /*     String input = new String("ENE");
        StringBuilder original = new StringBuilder(input);
        StringBuilder reversed = new StringBuilder(input);
        System.out.println(reversed = reversed.reverse());
        if(original.toString().equals(reversed.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
 */

        //3️⃣ Efficient Concatenation, Append numbers from 1 to 100 into a single string efficiently.
   /*      StringBuilder string = new StringBuilder();
        for(int i = 1; i <= 100; i++){
            string.append(i);
        }
        System.out.println(string);
      */   
        //4️⃣ Remove Vowels, Remove all vowels from a string using StringBuilder.
   /*      String st = "Cooperate";
        StringBuffer remove = new StringBuffer(st);
        for(int i = 0; i < remove.length(); i++){
            char ch = remove.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                remove = remove.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(remove);
      */   
 
        //5️⃣ Insert Dashes, Input: "12345", Output: "1-2-3-4-5"
   /*      StringBuilder input = new StringBuilder("12345");
        for(int i = 1; i < input.length(); i+=2){
            input.insert(i, "-");
        }
        System.out.println(input);
 */
        //6️⃣ Replace Character, Replace all 'a' with '@' using StringBuilder.
   /*      StringBuilder string = new StringBuilder("Character");
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'a'){
                string.setCharAt(i, '@');
            }
        }
        System.out.println(string);
     */ 
       

        //8️⃣ Clean String, From "a@b#1$2" → produce "ab12" using StringBuilder.
     /*    StringBuilder from = new StringBuilder("a@b#1$2");
        for(int i = 0; i < from.length(); i++){
            char ch = from.charAt(i);
            if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))){
                from.deleteCharAt(i);
            }
        }
        System.out.println(from);
         */

/*         Problem: Check if Two Strings Are Rotations
        📝 Question:
        Given two strings str1 and str2, write a program to check whether str2 is a rotation of str1.
        📌 Conditions:
        Both strings contain only lowercase letters.
        Return true if str2 is a rotation of str1.
        Otherwise, return false.
        Do not change the order of characters except by rotation.
        🔎 Example 1:
        Input:
        Copy code

        str1 = "abcd"
        str2 = "cdab"
        Output:
        Copy code

        true
        🔎 Example 2:
        Input:
        Copy code

        str1 = "hello"
        str2 = "lohel"
        Output:
        Copy code

        true */

/* 
        String input1 = "hello";
        String input2 = "lohel";
        int count = 0;
        // method 1
        String str = input1;
        if (input1.length() == input2.length()){
            for (int i = 0;i < input1.length(); i++){
                char ch = input1.charAt(i);
                str = str.replaceFirst(""+ch,"").concat(""+ch);
                if (input2.equals(str)){
                System.out.println("two strings are rotations");
                count ++;
                break;
                }
            }
            if (count != 1){
            System.out.println("two strings are not rotations");
            }
        }
        else {
        System.out.println("string lengths are not same");
        }
        
       
        // method 2
        String str1 = "abcdkop";
        String str2 = "qrstlmn";
        if (str1.length() == str2.length() && (str1 + str1).contains(str2)){
            System.out.println("two strings are rotations");
        }
        else {
            System.out.println("two are not rotations");
        }
     */   
    
/*         ✅ 12️⃣ Compare Two Strings (Character Presence)
        📝 Question:
        Write a Java program to compare two strings.
        If a character in String 1 is present in String 2, print that character in output.
        If it is NOT present, print "+" instead.
        👉 Ignore case difference.
        📌 Example:
        Copy code

        Input 1: New York
        Input 2: NWYR
        Copy code

        Output: N+w+Y+r+ 
*/
    // String st1 = "New York";
    // String st2 = "NWYR";
    // char[] ch1 = st1.toLowerCase().toCharArray();
    // char[] ch2 = st2.toLowerCase().toCharArray();
    // for(int i = 0; i < st1.length(); i++){
    //     boolean equal = false;
    //     for(int j = 0; j < st2.length(); j++){
    //         if(ch1[i] == ch2[j]){
    //             equal = true;
    //             break;
    //         }
    //     }
    //     System.out.print(equal ? st1.charAt(i) : "+");
    // }
 /*        ✅ 11️⃣ Find the Maximum Length Word
        📝 Question:
        Write a Java program to find the maximum length word in a given string.
        👉 If two words have the same maximum length, return the first occurring word.
        📌 Example 1:
        Copy code

        Input: hello how are you Mooooommmmm
        Output: Mooooommmmm
        📌 Example 2:
        Copy code

        Input: hello how are you reddy
        Output: hello 
    */

        // String str = "hello how are you reddy";
        // String[] str1 = str.split(" ");
        // int length = Integer.MIN_VALUE;
        // String string = "";
        // for(int i = 0; i < str1.length; i++){
        //     int ithlength = str1[i].length();
        //     if(ithlength > length){
        //         length = ithlength;
        //         string = str1[i];
        //     }
        // }
        // System.out.println(string);
   /*     ✅ 8️⃣ Count Character Types in String
        📝 Question:
        Write a Java program to find the count of:
        Uppercase letters
        Lowercase letters
        Digits
        Special characters
        in a given string.
        📌 Example:
        Copy code

        Input: JavA5is&Su6p%eR
        Copy code

        Output:
        Uppercase letters - 4
        Lowercase letters - 7
        Special characters - 2
        Digits - 2. */

        String input = "JavA5is&Su66p%eeRC";
        int uppercase = 0, lowercase = 0, digits = 0, special = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                uppercase++;
            }else if(ch >= 'a' && ch <= 'z'){
                lowercase++;
            }else if(ch >= '0' && ch <= '9'){
                digits++;
            }else{
                special++;
            }
        }
        System.out.println("Uppercase Letters: " + uppercase);
        System.out.println("Lowercase Letters: " + lowercase);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);

    }
}
