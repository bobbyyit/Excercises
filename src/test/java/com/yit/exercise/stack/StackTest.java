package com.yit.exercise.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;

    @Before
    public void createStack() {
        stack = new Stack(2);
    }

    @Test
    public void canPushOneItem() {
        stack.push(1);

        assertThat(stack.pop(), is(1));
    }

    @Test
    public void canPushTwoItems() {
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
    }

    @Test
    public void canPushAfterPop() {
        stack.push(1);
        stack.push(2);
        assertThat(stack.pop(), is(2));

        stack.push(3);
        assertThat(stack.pop(), is(3));

        assertThat(stack.pop(), is(1));
    }

    @Test
    public void expandStackDuringPushWhenFull() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertThat(stack.pop(), is(3));
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));

    }

    @Test
    public void returnsNullIfStackEmpty() {
        assertNull(stack.pop());
    }
}