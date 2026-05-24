//Method 
/* A method is block of named code that performs specific task. 
Instead of writing logic again and again.
it can avoid repetition, and allow to reusble
write once, call multiple times. 

-> Syntax: acessSpecifier static or nonstatic returntype methodName(parameters){
            //logic
           } */

//Static
/* It is a keyword, it is used to excecute a program in main function or 
method without creating any objects.  */

//Parameters
/* Parameters are input values given to a method, so it can works with 
different data and operations. "reusable, dynamic, powerful" */

//voidtype(in main method)
/* void is keyword, it is used to don't want to return any value from the
main function or method */

//voidtype in method
/* void is only prints the result, it cannot store a value , cannot reuse */

//return types (method)
/* it tells what value a method sends back after excecution, return type 
can prints the result, can store a value , can reuse, can combine with other logic. */

// recursion 
/* recurision is nothing but when a method call itself to solve a probolem with
step by step.
                     //OR
    A problem to solved by solving with smaller version of the problem
-> it can uses and follows Stack (LIFO)*/

//Pass by value 
/* the concept is a method is ready to change the value inside method, but is destroyed. 
becase we use inside another value to store and call method in main method and 
printing the same inside global variable
                     //ANSWER INTERVIEW LEVEL
In Java, method parameters are passed by value, so modifying a parameter does not affect the original variable. */

//recursive return statements
/* “If I write an operation outside the recursive call, it will execute during stack unwinding.
If I write the operation inside the parameters, it executes before the next call.”  
                     //OR
//Base return
    “In two-parameter recursion, the accumulating parameter carries the result forward. 
    The recursive call only passes updated values, 
    and the base case directly returns the accumulated result.
//Recursive call (return)
    “In return-based recursion, each function call waits for the recursive call to finish. 
    The actual computation happens during stack unwinding, 
    where each call combines its own value with the returned result.””*/