package com.yit.exercise.arrays;

public class ReverseArray {
    public static char[] reverse(char[] arrayOfCharacter) {
        char[] reverseChar = new char[arrayOfCharacter.length];

        int indexOfArray = arrayOfCharacter.length - 1;
        for (int index = 0; index < arrayOfCharacter.length; index++) {
            reverseChar[index] = arrayOfCharacter[indexOfArray];
            indexOfArray--;
        }

        return reverseChar;
    }
}
