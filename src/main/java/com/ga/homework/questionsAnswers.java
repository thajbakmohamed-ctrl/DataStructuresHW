package com.ga.homework;

public class questionsAnswers {

    //q1
    //The biggest problem I had was figuring out how to reverse the
    // stack without employing another array or stack. It was a little
    // confusing at first as the stack has only the ability to add and
    // remove elements from the top. I removed the elements from the stack using recursion
    //and then put them back in reverse order.
    //I also learned how insertAtBottom() works and why it is necessary.
    // After trying out various numbers, I gained an understanding of the process.

   //q2

   // My solution is correct, but it is not the fastest way to reverse a stack.
   // I used recursion with push() and pop() to remove the elements and put
   // them back in reverse order. The time complexity is O(n²) because
   // some elements need to be removed and added several times.
   // Recursion also uses extra memory to keep track of method calls.
   // Using another stack could make the solution faster and easier,
   // but the exercise required us not to use any additional data structures.


   //q3
   //Stacks are very helpful in many programming problems because they follow the
    // Last In First Out (LIFO) principle. For instance, a stack can be used to determine
    // whether brackets are balanced as in Exercise 2. Stacks may also be employed in undo
    // features, where the last action is undone first. For example, in a program we can reverse
    // the data or trace calls to methods. This exercise was useful for me to understand the use of
    // stack to solve various problems.
}
