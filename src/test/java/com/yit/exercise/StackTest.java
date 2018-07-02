package com.yit.exercise;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void test() {
        assertThat("hello", is("hello"));
    }
}