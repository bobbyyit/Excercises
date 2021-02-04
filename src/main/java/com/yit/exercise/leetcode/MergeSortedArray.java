package com.yit.exercise.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};

        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr1Pointer = m - 1,
                arr2Pointer = n - 1;


        for (int i = nums1.length - 1; i >= 0; i--) {
            if (arr2Pointer < 0) {
                return;
            }

            if (arr1Pointer >= 0 && nums1[arr1Pointer] > nums2[arr2Pointer]) {
                nums1[i] = nums1[arr1Pointer];
                arr1Pointer--;
            } else {
                nums1[i] = nums2[arr2Pointer];
                arr2Pointer--;
            }
        }

    }
}
