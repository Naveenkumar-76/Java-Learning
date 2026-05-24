package Strings;
public class day10challenges {
    public static void main(String[] args) {
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

        true 
    */

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

        // String input = "JavA5is&Su66p%eeRC";
        // int uppercase = 0, lowercase = 0, digits = 0, special = 0;
        // for(int i = 0; i < input.length(); i++){
        //     char ch = input.charAt(i);
        //     if(ch >= 'A' && ch <= 'Z'){
        //         uppercase++;
        //     }else if(ch >= 'a' && ch <= 'z'){
        //         lowercase++;
        //     }else if(ch >= '0' && ch <= '9'){
        //         digits++;
        //     }else{
        //         special++;
        //     }
        // }
        // System.out.println("Uppercase Letters: " + uppercase);
        // System.out.println("Lowercase Letters: " + lowercase);
        // System.out.println("Digits: " + digits);
        // System.out.println("Special Characters: " + special);

/*          1️⃣ Reverse Only Vowels
        📝 Problem:

        Given a string, reverse only the vowels using StringBuilder.

        📌 Example:
        Input:  "programming"
        Output: "prigrammong"

        👉 Consonants stay in same position
        👉 Only vowels change positions
*/
        // StringBuilder string = new StringBuilder("programming");
        // char[] ch = string.toString().toLowerCase().toCharArray();
        // boolean[] rev = new boolean[ch.length];
        // for(int i = 0; i < ch.length; i++){
        //     if(rev[i] == true){
        //         continue;
        //     }
        //     else if((ch[i] == 'a') || (ch[i] == 'e') || (ch[i] == 'i') || 
        //        (ch[i] == 'o') || (ch[i] == 'u')){
        //         char temp = ch[i];
        //         ch[i] = ch[ch.length - 1 - i];
        //         ch[ch.length - 1 - i] = temp;
        //         rev[ch.length - 1 - i] = true;
        //     }
        // }
        // System.out.print(ch);

 /*        🚀 2️⃣ Remove Duplicate Characters
        📝 Problem:

        Remove duplicate characters from a string using StringBuilder.

        📌 Example:
        Input:  "programming"
        Output: "progamin"

        👉 Keep first occurrence
        👉 Remove later duplicates
        👉 Do NOT use Set or HashMap
    */
        // StringBuilder st = new StringBuilder("programping");
        // for(int i = 0; i < st.length(); i++){
        //     for(int j = i + 1; j < st.length(); j++){
        //         if(st.charAt(i) == st.charAt(j)){
        //             st.deleteCharAt(j);
        //             j--;
        //         }
        //     }
        // }
        // System.out.println(st);

 /*       🚀 3️⃣ Check Palindrome Using StringBuilder
        📝 Problem:

        Check whether a string is palindrome using reverse() method of StringBuilder.

        📌 Example:
        Input:  "madam"
        Output: true
        Input:  "java"
        Output: false
    */
        // StringBuilder st = new StringBuilder("java");
        // String st2 = st.toString();
        // st = st.reverse();
        // System.out.println(st2.equals(st.toString()));
 /*
        🚀 4️⃣ Compress String (Run Length Encoding)
        📝 Problem:

        Compress string using character count.

        📌 Example:
        Input:  "aaabbccccd"
        Output: "a3b2c4d1"

        👉 Use StringBuilder to build result
        👉 Do not use extra arrays
*/
        // StringBuilder st = new StringBuilder("aaabbccccd");
        // StringBuffer result = new StringBuffer("");
        // for(int i = 0; i < st.length();  i++){
        //     char ch = st.charAt(i);
        //     int count = 1;
        //     while(i + 1 < st.length() && st.charAt(i) == st.charAt(i + 1)){
        //         count++;
        //         i++;
        //     }
        //     result.append(ch).append(count);
        // }    
        // System.out.println(result); 
        
/*
        🚀 5️⃣ Insert Character After Every Digit
        📝 Problem:

        Insert # after every digit using insert().

        📌 Example:
        Input:  "a1b2c34"
        Output: "a1#b2#c3#4#"

        👉 Modify string using StringBuilder
        👉 Be careful while inserting (index changes!)
*/ 
        // String input = "1a1b2c34";
        // StringBuilder output = new StringBuilder(input);
        // for(int i = 0; i < output.length(); i++){
        //     char ch = output.charAt(i);
        //     if(ch >= '0' && ch <= '9'){
        //         output.insert((i+1),"#");
        //         i++;
        //     }
        // }
        // System.out.println(output);
        
  /*       6.🔥 Bonus (Harder)
        🧠 Reverse Words But Keep Punctuation Same
        Input:  "Hello, World!"
        Output: "olleH, dlroW!"

        👉 Reverse letters only
        👉 Keep commas, spaces, ! in same position
 */

        StringBuilder input = new StringBuilder("Hello, World!");
        String[] output = input.toString().split("\\s+ ");
        for(int i = 0; i < output.length; i++){
            char[] ch = output[i].toCharArray();
            boolean isnotalpha = false;
            for(int j = 0; j < output[i].length(); j++){
                if((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= 'A' && (ch[j]) <= 'Z')){
                    if(!((ch[ch.length - 1 - j]) >= 'a' && (ch[ch.length - 1 - j]) <= 'z')){
                        System.out.print(ch[ch.length - 2 -j]);
                        isnotalpha = true;
                    }else if(isnotalpha){
                        System.out.print(ch[ch.length - 2 -j]);
                    }else{
                        System.out.print(ch[ch.length - 1 - j]);
                    }
                }else{
                    System.out.print(ch[j]);
                }
            }
            System.out.print(" ");
        }
    }
}
