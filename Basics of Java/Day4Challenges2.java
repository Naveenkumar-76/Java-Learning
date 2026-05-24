public class Day4Challenges2 {
    public static void main(String[] args){

    //1️⃣ Even–Odd with a Twist: Take an integer input.
    //If it’s even and divisible by 4, print "Perfect Even"If it’s even but not divisible by 4, print "Even"Else print "Odd"
/* 
    int num = 19;
    if(num%2 == 0){
        if(num%4 == 0){
            System.out.println("Perfect Even");
        }else{
            System.out.println("Even");
        }
    }else{
        System.out.println("odd");
    }
 */

    //2️⃣ Temperature Analyzer. Input temperature in Celsius. Below 0 → "Freezing"
    //0 to 20 → "Cold". 21 to 35 → "Warm". Above 35 → "Hot"
    //Edge cases matter (0, 20, 35).
/* 
    int temperature = 99;
    if(temperature < 0){
        System.out.println("Freezing");
    }else if(temperature >= 0 && temperature <= 20){
        System.out.println("Cold");
    }else if(temperature > 20 && temperature <= 35){
        System.out.println("Warm");
    }else{
        System.out.println("Hot");
    }
     
 */
    
    //3️⃣ Valid Triangle Checker. Input three angles of a triangle. Check if they form a valid triangle
    //If valid, classify as: 1.Equilateral 2.Isosceles 3.Scalene

/*     //triangle sizes
    int t1 = 5, t2 = 7, t3 = 15;
    if((t1+t2 > t3) && (t1+t3 > t2) && (t2+t3 > t1)){
        System.out.println("The given three angles are form a valid triangle");
        if((t1 == t2 && t1 == t3) && t2 == t3 ){
            System.out.println("Equalateral triangle ");
        }else if((t1 == t2) && (t1 != t3)){
            System.out.println("Isosceles triangle");
        }else if((t1 == t3) && (t1 != t2)){
            System.out.println("Isosceles triangle");
        }else if((t2 == t3) && (t2 != t1)){
            System.out.println("Isosceles triangle");
        }else{
            System.out.println("Scalene triangle");
        }
    }else{
        System.out.println("The given three angles are does not form a valid triangle. So, please enter a valid inputs ");
    }
 */

    //4️⃣ Salary Bonus System.Input salary and years of experience.
    // If experience ≥ 5: Salary < 50k → 20% bonus. Salary ≥ 50k → 10% bonus. Else → No bonus
/* 
    long salary = 49999l;
    int experience_years = 5;
    if(experience_years >= 5){
        if(salary < 50000 && salary > 0){
            System.out.println("20% bonus");
        }else if(salary >= 50000){
            System.out.println("10% bonus");
        }else{
            System.out.println("Please enter your correct salary");
        }
    }else if(experience_years <= 0){
        System.out.println("Please enter your correct experience years");
    }
    else{
        System.out.println("No bonus");
    }
     */

    //5️⃣ Number Nature Detector. Input a number.
    //Print:1."Positive Even" 2."Positive Odd" 3."Negative Even" 4."Negative Odd" 5."Zero"
/* 
    int num = 0;
    if(num > 0 ){
        if(num%2 == 0){
            System.out.println("Positive Even");
        }else{
            System.out.println("Positive Odd");
        }
    }else if(num < 0){
        if(num%2 == 0){
            System.out.println("Negative Even");
        }else{
            System.out.println("Negative Odd");
        }
    }else{
        System.out.println("Zero");
    }
 */
    //6️⃣ Electricity Bill Slab. Units consumed:
    //1.≤ 100 → ₹1/unit 2.101–200 → ₹2/unit 3.above 200 → ₹3/unit. Print total bill.
/* 
    int Electricity_consumed = 999;
    if(Electricity_consumed > 0){
        if(Electricity_consumed <= 100){
            System.out.println("Total electricity bill is "+Electricity_consumed * 1);
        }else if(Electricity_consumed > 100 && Electricity_consumed <= 200){
            System.out.println("Total electricity bill is "+Electricity_consumed * 2);
        }else{
            System.out.println("Total electricity bill is "+Electricity_consumed * 3);

        }
    }else{
        System.out.println("Please enter your correct Electricity consumed units ");
    }
     */

    //7️⃣ Leap Year (Strict Rules). Input year.
    //Leap if divisible by 400 OR divisible by 4 but not by 100
/* 
    int year = 2026;
    if(year%400 == 0 || (year%4 == 0 && year%100 != 0)){
        System.out.println(year+" is a leap year");
    }else{
        System.out.println(year+" is not a leap year");
    }
 */

    //8️⃣ Character Classifier. Input a single character.
    //Check if: 1.Uppercase letter 2.Lowercase letter 3.Digit 4.Special character
/* 
    char c = '@';
    if(c >= 'A' && c <= 'Z'){
        System.out.println("Uppercase letter");
    }else if(c >= 'a' && c <= 'z'){
        System.out.println("Lowercase letter");
    }else if(c >= '0' && c <= '9'){
        System.out.println("Digit");
    }else{
        System.out.println("Spcial character");
    }
     */

    //9️⃣ Exam Result Generator, Input marks (0–100).
    //1.< 35 → Fail 2.35–59 → Pass 3.60–74 → First Class 4.≥ 75 → Distinction 5.Else ->Invalid Marks
/*     
    int marks = 60;
    if(marks > 0 && marks < 35){
        System.out.println("Fail");
    }else if(marks >= 35 && marks <= 59){
        System.out.println("Pass");
    }else if(marks >= 60 && marks <= 74){
        System.out.println("First Class");
    }else if(marks >= 75){
        System.out.println("Distinction");
    }else {
        System.out.println("Invalid Marks");
    }
 */

    //🔟 Calculator Using switch, Input two numbers and an operator (+ - * / %).
    // Perform the operation using switch.
/* 
    int num1 = 10, num2 = 5;
    //char c1 = '+',c2 = '-',c3 = '*', c4 = '/', c5 = '%';
    switch('/'){
        case '+':
            System.out.println(num1+num2);
            break;
        case '-':
            System.out.println(num1-num2);
            break;
        case '*':
            System.out.println(num1*num2);
            break;
        case '/':
            System.out.println(num1/num2);
            break;
        case '%':
            System.out.println(num1%num2);
            break;
        default:
            System.out.println("Choose is valid operator");
    }
     */
    //👉 Clean switch usage, handle division by zero.


    //1️⃣1️⃣ Voting Eligibility + Priority, Input age.
    //1.< 18 → Not eligible 2.18–59 → Eligible 3.≥ 60 → Eligible + Senior Priority
/* 
    short age = 60;
    if(age > 0 ){
        if(age < 18){
            System.out.println("Not Eligible");
        }else if(age >= 18 && age <= 59){
            System.out.println("Eligible");
        }else if(age >= 60){
            System.out.println("Eligible and Senior priority");
        }
    }else{
        System.out.println("Mission understand you are not living on earth, So enter age for eligile to living ");
    }
 */

    //1️⃣2️⃣ Traffic Signal Simulator, Input color (Red, Yellow, Green).
    //Red → Stop. Yellow → Ready. Green → Go
/* 
    String color = "Green";
    switch (color) {
        case "Red":
            System.out.println("Stop");
            break;
        case "Yellow":
            System.out.println("Ready");
            break;
        case "Green":
            System.out.println("Go");
            break;
        default:
            System.out.println("Please enter traffic signal Simulators!");
            break;
    }
     */

    //1️⃣3️⃣ Shop Discount Logic, Input purchase amount.
    // 1.≥ 10,000 → 20% discount 2.≥ 5,000 → 10% discount. Else → No discount
/* 
    long purchase_Amount = 9999;
    if(purchase_Amount > 0){
        if(purchase_Amount >= 5000 && purchase_Amount < 10000){
            System.out.println("10% discount");
        }else if(purchase_Amount >= 10000){
            System.out.println("20% discount");
        }else{
            System.out.println("No discount");
        }
    }else{
        System.out.println("Are you Purchase or not, if you purchase then enter correct purchase amumount");
    }
     */

    //1️⃣4️⃣ Biggest of Three Numbers, Input three numbers. Print the largest.
/* 
    int num1 = 11, num2 = 9, num3 = 7;
    if(num1 > num2 && num1 > num3){
        System.out.println(num1);
    }else if(num2 > num1 && num2 > num3){
        System.out.println(num2);
    }else{
        System.out.println(num3);
    }
     */

    //1️⃣5️⃣ Passcode Validator, Input a 4-digit number.
    //If exactly 4 digits and even → Valid. Else → Invalid
/* 
    int passcode = 9999;
    if(passcode > 999 && passcode < 10000){
        if(passcode%2 == 0){
            System.out.println("Given input is valid");
        }else{
            System.out.println("Given input is not valid");
        }
    }else{
        System.out.println("Please enter 4 digit number only");
    }
     */

    //1️⃣6️⃣ Water State Detector, Input temperature.
    // 1.≤ 0 → Solid. 2.1–99 → Liquid 3.≥ 100 → Gas
/* 
    int temperature = 99;
    if(temperature <= 0){
        System.out.println("Solid");
    }else if(temperature > 0 && temperature < 100){
        System.out.println("Liquid");
    }else{
        System.out.println("Gas");
    }
 */

    //1️⃣7️⃣ Mobile Battery Status, Input battery percentage.
    // 1.≤ 15 → Low. 2.16–80 → Normal 3.80 → Fully Charged
/* 
    byte Battery_Percentage = 99;
    System.out.println("Mobile Battery Status:");
    if(Battery_Percentage >= 0 && Battery_Percentage <= 100){
        if(Battery_Percentage <= 15){
            System.out.println("Battery is Low");
        }else if(Battery_Percentage > 15 && Battery_Percentage <= 80){
            System.out.println("Battery is Normal");
        }else{
            System.out.println("Battery is Fully Charged");
        }
    }else{
        System.out.println("Please enter only 0 to 100 only");
    }
 */

    //1️⃣8️⃣ Simple Authentication, Input username and PIN.
    //If username = "admin" and PIN = 1234 → Login Success. Else → Access Denied
/* 
    String username = "admin";
    int PIN = 1234;
    if(username == "admin" && PIN == 1234){
        System.out.println("Login Success");
    }else{
        System.out.println("Access Denied ");
    }
 */

    //1️⃣9️⃣ Day Type Checker, Input day number (1–7).
    //1–5 → Weekday, 6–7 → Weekend, Else → Invalid Day
/* 
    int day_number = 5;
    switch (day_number) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Invalid Day");
            break;
    }
 */

    //2️⃣0️⃣ Grade Upgrade Rule, Input marks. If marks 1.≥ 90 → A 2.80–89 → B 3.70–79 → C 4.< 70 → D
    //If marks < 0 or > 100 → Invalid

    byte marks = 99;
    if(marks > 0 && marks <= 100){
        if(marks >= 90){
            System.out.println("You got 'A' grade");
        }else if(marks >= 80 && marks <= 89){
            System.out.println("You got 'B' grade");
        }else if(marks >= 70 && marks <= 79){
            System.out.println("You got 'C' grade");
        }else{
            System.out.println("You got 'D' grade");
        }
    }else{
        System.out.println("You got Invalid marks");
    }


    }
}