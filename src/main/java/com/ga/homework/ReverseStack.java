package com.ga.homework;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        //create a stack to store numbers
        Stack<Integer> stack = new Stack<>();
       // stack.push(20);
        //stack.push(40);
       // stack.push(60);

        //test different numbers
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);

        System.out.println("Original Stack: " + stack);

        //reverse the stack
        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);

    }
    //reverse the stack using recursion
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        //remove the top number
        int temp = stack.pop();
        //call the method again for the remaining numbers
        reverseStack(stack);
        //put the removed number at the bottom
        insertAtBottom(stack, temp);

    }
    //insert a number at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int number) {

        //if the stack is empty add the number
        if (stack.isEmpty()) {
            stack.push(number);
            return;
        }
        //remove the top number and save it
        int temp = stack.pop();

       //call the method again to reach the bottom
        insertAtBottom(stack, number);

       //put the removed number back
        stack.push(temp);

    }
}