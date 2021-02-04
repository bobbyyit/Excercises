package com.yit.exercise.leetcode;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer <= rightPointer) {
            char rightCharacter = s.charAt(rightPointer);
            char leftCharacter = s.charAt(leftPointer);

            if (!Character.isLetterOrDigit(rightCharacter)) {
                rightPointer--;
                continue;
            }
            if (!Character.isLetterOrDigit(leftCharacter)) {
                leftPointer++;
                continue;
            }

            if (Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;

    }
}
