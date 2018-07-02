package com.yit.exercise.arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ReverseArrayTest {
    @Test
    public void reverseArrayOfOneCharacter() {
        char[] array = new char[]{'a'};

        assertThat(ReverseArray.reverse(array), is(new char[]{'a'}));
    }

    @Test
    public void reverseArrayOfTwoCharacter() {
        char[] array = new char[]{'a', 'b'};

        assertThat(ReverseArray.reverse(array), is(new char[]{'b', 'a'}));
    }

    @Test
    public void reverseArrayOfFiveCharacter() {
        char[] array = new char[]{'a', 'b', 'b', 'c', 'd'};

        assertThat(ReverseArray.reverse(array), is(new char[]{'d', 'c', 'b', 'b', 'a'}));
    }
}