package com.ga.homework;

public class BalancedBrackets {

    public static void main(String[] args) {
        //Brackets are balanced
        String exp = "{[()]}";


        //Brackets are not balanced
        //String exp = "{[(])}";
       // String exp = "{[(";
        //String exp = "{[()]}]";

        //create a stack to store the brackets
        //SingleArrayStack stack = new SingleArrayStack(3);
        SingleArrayStack stack = new SingleArrayStack(exp.length());

        for (int i = 0; i < exp.length(); i++) {

            //get the current character
            char ch = exp.charAt(i);
            //checks if the bracket is opening
            if (ch == '(' || ch == '{' || ch == '[') {
                //add the opening bracket to the stack
                stack.push(ch);
            }

            //check if the bracket is closing
            else if (ch == ')' || ch == '}' || ch == ']') {
                //check if there is no opening bracket
                if (stack.isEmpty()) {
                    System.out.println("Brackets are not balanced");
                    return;
                }

                //remove the last opening bracket
                char open = stack.pop();
                //check if the opening and closing brackets matchs
                if ((open == '(' && ch != ')') ||
                        (open == '{' && ch != '}') ||
                        (open == '[' && ch != ']')) {
                    System.out.println("Brackets are not balanced");
                    return;
                }
            }

        }
        //check if there are any opening brackets left
        if (stack.isEmpty()) {
            System.out.println("Brackets are balanced");
        } else {
            System.out.println("Brackets are not balanced");
        }

    }
}
