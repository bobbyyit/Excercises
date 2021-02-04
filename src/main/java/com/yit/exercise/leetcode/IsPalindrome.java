package com.yit.exercise.leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(120));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = reversed(x);
        return x == reversed;

    }

    private static int reversed(int x) {
        int reversed = 0;
        int current = x;

        //
        while (current > 0) {
            reversed =
                    (reversed * 10)
                            +
                            (current % 10); // Get the rightest digit
            current = current / 10; // Discard rightest digit
        }

        return reversed;
    }
}
