package com.yit.exercise.arrays;

public class ReverseArray {
    public static char[] reverse(char[] arrayOfCharacter) {
        char[] reverseArray = new char[arrayOfCharacter.length];

        int indexOfArrayStartingFromTheRight = arrayOfCharacter.length - 1;
        for (int index = 0; index < arrayOfCharacter.length; index++) {
            reverseArray[index] = arrayOfCharacter[indexOfArrayStartingFromTheRight];
            indexOfArrayStartingFromTheRight--;
        }

        return reverseArray;
    }
}
