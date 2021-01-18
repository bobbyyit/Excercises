package com.yit.exercise.stack;

import java.util.Stack;

public class BalanceBrackets {

    public static void main(String[] args) {


        String s = "(()()(())";
        System.out.println(isBalanced(s));

    }

    private static boolean isBalanced(String s) {
        String[] brackets = s.split("");

        Stack<String> stack = new Stack<>();

        for (String bracket : brackets) {

            if (stack.empty() && bracket.equals(")")) {
                return false;
            } else if (bracket.equals("(")) {
                stack.push(bracket);
            } else if (bracket.equals(")")) {
                stack.pop();
            }
        }

        return stack.empty();
    }


}
