package com.yit.exercise.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 10, 15, 20, 21, 25, 30, 31};
        int target = 30;

        int targetIndex =
//                recursiveBinarySearch(arr, target, 0, arr.length - 1);
                iterativeBinarySearch(arr, target);

        System.out.printf("%d is located at index %d%n", target, targetIndex);
    }

    private static int recursiveBinarySearch(int[] arr, int target, int leftIndex, int rightIndex) {
        if (rightIndex >= leftIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (arr[midIndex] == target) {
                return midIndex;
            }

            if (target < arr[midIndex]) {
                return recursiveBinarySearch(arr, target, leftIndex, midIndex - 1);
            }
            return recursiveBinarySearch(arr, target, midIndex + 1, rightIndex);

        }

        return -1;
    }

    private static int iterativeBinarySearch(int[] arr, int target) {
        int leftIndex = 0, rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (rightIndex + leftIndex) / 2;
            if (arr[midIndex] == target) {
                return midIndex;
            }

            if (target < arr[midIndex]) {
                rightIndex = midIndex - 1;
            } else {
                leftIndex = midIndex + 1;
            }

        }

        return -1;
    }


}