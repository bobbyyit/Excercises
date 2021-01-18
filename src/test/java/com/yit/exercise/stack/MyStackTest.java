package com.yit.exercise.stack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MyStackTest {

    private MyStack myStack;

    @Before
    public void createStack() {
        myStack = new MyStack(2);
    }

    @Test
    public void canPushOneItem() {
        myStack.push(1);

        assertThat(myStack.pop(), is(1));
    }

    @Test
    public void canPushTwoItems() {
        myStack.push(1);
        myStack.push(2);

        assertThat(myStack.pop(), is(2));
        assertThat(myStack.pop(), is(1));
    }

    @Test
    public void canPushAfterPop() {
        myStack.push(1);
        myStack.push(2);
        assertThat(myStack.pop(), is(2));

        myStack.push(3);
        assertThat(myStack.pop(), is(3));

        assertThat(myStack.pop(), is(1));
    }

    @Test
    public void expandStackDuringPushWhenFull() {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        assertThat(myStack.pop(), is(3));
        assertThat(myStack.pop(), is(2));
        assertThat(myStack.pop(), is(1));

    }

    @Test
    public void returnsNullIfStackEmpty() {
        assertNull(myStack.pop());
    }
}