package com.yit.exercise.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(longest("bbbbbbb"));
    }

    private static int longest(String s) {
        int leftPointer = 0, rightPointer = 0;
        Set<Character> tracker = new HashSet<>();
        int maxLength = 0;

        while (rightPointer < s.length()) {
            if (!tracker.contains(s.charAt(rightPointer))) {
                tracker.add(s.charAt(rightPointer));
                // Use max in order to record the highest max during traversal
                maxLength = Math.max(tracker.size(), maxLength);
                rightPointer++;
            } else {
                tracker.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }


        return maxLength;
    }


}
