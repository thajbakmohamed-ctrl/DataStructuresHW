package com.ga.homework;

public class SingleArrayStack {
    private final int maxSize;

    private final char[] stackArray;
    //keep track of the top element
    private int top;

    //set up the stack with the given size
    public SingleArrayStack(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public char push(char data) {
        //check if there is space in the stack
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = data;
            return data;
        }
        return 0;
    }

    //remove the top bracket from the stack
    public char pop() {
        // check if the stack has elements
        if (top >= 0) {
            return stackArray[top--];
        }
        return 0;
    }

    //is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    //is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    //get the top bracket without removing it
    public char top() {
        return stackArray[top];
    }

    //print all brackets in the stack
    public void printStack() {
        if (top >= 0) {
            System.out.println("Elements in stack : ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }
}
