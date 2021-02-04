package com.yit.exercise.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class BalanceBrackets {

    public static void main(String[] args) {


        String s = "(])";
        System.out.println(isBalanced(s));

    }

    private static boolean isBalanced(String s) {
        String[] brackets = s.split("");

        Stack<String> stack = new Stack<>();

        for (String bracket : brackets) {

            if (stack.empty() && (bracket.equals(")") || bracket.equals("]") || bracket.equals("}"))) {
                return false;
            } else if (bracket.equals("(") ||
                    bracket.equals("{") ||
                    bracket.equals("[")) {
                stack.push(bracket);
            } else if ((bracket.equals(")") && stack.peek().equals("(")) ||
                    (bracket.equals("]") && stack.peek().equals("[")) ||
                    (bracket.equals("}") && stack.peek().equals("{"))) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }


}
