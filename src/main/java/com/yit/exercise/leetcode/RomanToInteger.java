package com.yit.exercise.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    public static void main(String[] args) {
        String s = "XXVII";


        Map<Character, Integer> reference = new HashMap<>();
        reference.put('I', 1);
        reference.put('V', 5);
        reference.put('X', 10);
        reference.put('L', 50);
        reference.put('C', 100);
        reference.put('D', 500);
        reference.put('M', 1000);

        Map<Character, Integer> sum = new HashMap<>();

        for (int i = s.length() - 1; i >= 0; i--) {
            char digit = s.charAt(i);

            if (sum.containsKey(digit) && reference.get(digit) >= reference.get(s.charAt(i + 1))) {
                sum.put(digit, sum.get(digit) + reference.get(digit));
            } else if (sum.containsKey(digit) && reference.get(digit) < reference.get(s.charAt(i + 1))) {
                sum.put(digit, sum.get(digit) - reference.get(digit));
            } else if (i + 1 < s.length()  && reference.get(digit) <= reference.get(s.charAt(i + 1))) {
                sum.put(digit, -reference.get(digit));
            } else {
                sum.put(digit, reference.get(digit));
            }

        }

        System.out.println(sum.values().stream().mapToInt(Integer::intValue).sum());
    }
}
