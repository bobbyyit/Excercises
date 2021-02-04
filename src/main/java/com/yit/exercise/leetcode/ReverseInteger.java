package com.yit.exercise.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        int current = x;

        if (isNegative) {
            current *= -1;
        }

        int reverse = 0;

        while (current > 0) {

            int end = current % 10;
            reverse = end +
                    reverse * 10;

            current = current / 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && end > 7)) return 0;
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && end < -8)) return 0;

        }

        if (isNegative) {
            reverse *= -1;
        }

        return reverse;
    }
}
