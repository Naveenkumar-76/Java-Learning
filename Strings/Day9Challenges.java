package Strings;
public class Day9Challenges {
    public static void main(String[] args) {

        //1️. Palindrome check (two pointers)
   /*      String st = "EONENOE";
        char[] ch = st.toCharArray();
        int j = st.length()-1;
        boolean is = true;
        for(int i = 0; i<= j; i++){
            if(ch[i] != ch[j]){
                is = false;
                break;
            }
            j--;
        }
        System.out.print(is ? "Palindrome" : "Not a palindrome");
 */
        //2️. Case-insensitive palindrome
  /*       String st = "mAdaM";
        char[] ch = st.toCharArray();
        int j = st.length()-1;
        boolean is = true;
        for(int i = 0; i<= j; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] + 32);
            }
            if(ch[j] >= 'A' && ch[j] <= 'Z'){
                ch[j] = (char)(ch[j] + 32);
            }
            if(ch[i] != ch[j]){
                is = false;
                break;
            }
            j--;
        }
        System.out.print(is ? "Palindrome" : "Not a palindrome");
         */
        //3️. Sentence palindrome (ignore spaces)
  /*       String st = "ENE ONE NO ENE";
        String rev = "";
        for(int i = st.length() - 1; i >= 0; i--){
            if(st.charAt(i) == 32){
                continue;
            }else{
                rev = rev + st.charAt(i);
            }
        }
        System.out.println(rev);
        boolean bool = true;
        int j = 0;
        for(int i = 0 ; i < st.length(); i++){
            if(st.charAt(i) == 32){
                continue;
            }else if(st.charAt(i) != rev.charAt(j)){
                bool = false;
                break;
            }
            j++;
        }
        System.out.println(bool ? "Sentence Palindrome" : "Sentence not a palindrome");
     */    
        //5,6,9. Anagram check (sorting)
    /*     String st = "anagram ";
        String st2 = "marGana ";
        char ch[] = st.toLowerCase().toCharArray();
        char ch2[] = st2.toLowerCase().toCharArray();
        boolean bool = true;
        if(ch.length != ch2.length){
            bool = false;
        }else{
            for(int i = 0; i < ch.length; i++){
                boolean found = false;
                for(int j = 0; j < ch.length; j++){
                   if(ch[i] == ch2[j]){
                        ch2[j] = '0';
                        found = true;
                        break;
                    }
                }
                if(found == false){
                    bool = false;
                    break;
                }
            }
        }
        System.out.println(bool ? "Anagram" : "Not a Anagram");
    */
        //7. Sentence anagram
     /*    String st1 = "Your aim is Programmer";
        String st2 = "programmer is your aim";
        char[] ch1 = st1.toLowerCase().toCharArray();
        char[] ch2 = st2.toLowerCase().toCharArray();
        boolean isAnagram = true;
        if(ch1.length != ch2.length){
            isAnagram = false;
        }else{
            for(int i = 0; i < ch1.length; i++){
                if(ch1[i] == ' '){
                    continue;
                }
                boolean found = false;
                for(int j = 0; j < ch2.length; j++){
                    if(ch2[j] == ' '){
                        continue;
                    }
                    if(ch1[i] == ch2[j]){
                        ch2[j] = '0';
                        found = true;
                        break;
                    }
                }
                if(found == false){
                    isAnagram = false;
                    break;
                }
            }
        }
        System.out.println((isAnagram ? "Anagram sentence" : "Not a Anagram sentence"));
 */
        //11,13. Character frequency count
/*         String st = "Character";
        char[] ch = st.toLowerCase().toCharArray();
        for(int i = 0; i < st.length(); i++){
            boolean iszero = false;
            int count = 1; 
            if(ch[i] == '0'){
                iszero = true;
                continue;
            }
            for(int j = i+1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    ch[j] = '0';
                    count++;
                }
            }
            if(!iszero){
                System.out.print(ch[i] + " -> " + count + "  ");
            }
        }
     */    
        //12. First non-repeating character
   /*      String st = "Non rePeating Character";
        char[] ch = st.toLowerCase().toCharArray();
        System.out.print("First non repeating character is: ");
        for(int i = 0; i < st.length(); i++){
            boolean character = true;
            if(ch[i] == ' '){
                continue;
            }
            for(int j = 0; j < ch.length; j++){
                if(i !=j && ch[i] == ch[j]){
                    character = false;
                    continue;
                }
            }
            if(character){
                System.out.print(ch[i] + " ");
                break;
            }
        }
 */
        //4️. Alphanumeric Palindrome, Check palindrome by ignoring spaces and special characters.
   /*      String st = "Nav@an 12@3 321#      Navan";
        char[] ch = st.toLowerCase().toCharArray();
        int i = 0, j = ch.length - 1;
        boolean ispalindrome = true;
        while(i <= j){
            if(!((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9'))){
                i++;
                continue;
            }
            if(!((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= '0' && ch[j] <= '9'))){
                j--;
                continue;
            } 
            if((ch[i] != ch[j])){
                ispalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ispalindrome ? "Is palindrome" : "Is not a palindrome");
 */
        //5️. Count Palindromic Words, Count how many words in a sentence are palindromes.
  /*       String string = "Is a Palindromic Navan INstitution Gooddoog";
        String st[] = string.split(" ");
        int k = 0, count = 0;
        while (k < st.length) {
            if(st[k].length() == 1 ){
                count++;
                k++;
            }else{
                char[] ch = st[k].toLowerCase().toCharArray();
                boolean ispalindrome = true;
                int i = 0, j = ch.length - 1;
                while(i <= j){
                    if(!((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9'))){
                        i++;
                        continue;
                    }
                    if(!((ch[j] >= 'a' && ch[j] <= 'z') || (ch[j] >= '0' && ch[j] <= '9'))){
                        j--;
                        continue;
                    }
                    if(ch[i] != ch[j]){
                        ispalindrome = false;
                        break;
                    }
                    i++;
                    j--;
                }
                if(ispalindrome){
                    count++;
                }
                k++;
            }
        }
        System.out.println(count);
 */    
        //1️4️. Remove Duplicate Characters , remove duplicate characters from a string.
 /*        String st = "Remove Duplicate Characters";
        char ch[] = st.toLowerCase().toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ' '){
                continue;
            }
            for(int j = i+1; j < ch.length; j++){
                if(ch[j] == ' '){
                    continue;
                }else{
                    if(ch[i] == ch[j]){
                        ch[j] = ' ';
                    }
                }
            }
        }
        System.out.println(ch);
 */
        //1️5️. Maximum Occurring Character, Find the character with the highest frequency.
 /*        String st = "Maximum Occurring Charaters";
        char ch[] = st.toLowerCase().toCharArray();
        int  maxfreq = 1;
        char chart = ' ';
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ' '){
                continue;
            }
            int freq = 1;
            for(int j = i + 1; j < ch.length; j++){
                if(ch[j] == ' '){
                    continue;
                }if(ch[i] == ch[j]){
                    freq++;
                    ch[j] = ' ';
                }
                
            }
            if(freq > maxfreq){
                maxfreq = freq;
                chart = ch[i];
            }
        }
        System.out.println("The character '" + chart + "' occurs with the highest " + maxfreq + " frequency");
      */   
        //1️6️. Reverse Each Word, Reverse each word of a sentence
  /*       String st = "Reverse   Each word";
        String[] starr = st.split("\\s+");
        for(int i = 0; i < starr.length; i++){
            char ch[] = starr[i].toCharArray();
            for(int j = ch.length - 1; j >= 0; j--){
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
     */    

        //1️7️. Reverse Word Order, Reverse the order of words in a sentence.
   /*      String st = "Reverse the order of words";
        String[] st2 = st.split("\\s+");
        for(int i = st2.length - 1; i >= 0; i--){
            System.out.print(st2[i]);
            if(i != 0){
                System.out.print(" ");
            }
        }
 */
        //1️8️. Word Count (Robust), Count words in a sentence with multiple spaces.
        String st = "Count word in a sentence with multiple spaces";
        String[] st2 = st.split("\\s+");
        System.out.print("Given string contains " + st2.length + " words");

        //1️9️. Duplicate Words, Print duplicate words in a sentence.
        String string = "venky bharath venky naveen bharath venky naveen";
        String[] string2 = string.split("\\s+");
        System.out.print("\nDuplicate words are: ");
        for(int i = 0; i < string2.length; i++){
            if(string2[i].equals(" ")){
                continue;
            }
            boolean isduplicate = false;
            for(int j = i+1; j < string2.length; j++){
                if(string2[i].equals(string2[j])){
                    isduplicate = true;
                    string2[j] = " ";
                }
            }
            if(isduplicate){
                System.out.print(string2[i]+" ");
            }
        }
        
        //2️⃣0️⃣ Capitalize Each Word, Convert: "java mastery course" → "Java Mastery Course" 
        String cap = "java mastery course";
        char[] ch = cap.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(i == 0 || (ch[i] >= 'a' && ch[i] <= 'z') && ((ch[i - 1]) == ' ')){
                ch[i] = (char) (ch[i] - 32);
            }
        }
        System.out.println(ch);
    }
}