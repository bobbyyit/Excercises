package com.yit.exercise.stack;

public class MyStack {
    private int stackSize;
    private Integer[] stack;
    private int top = 0;

    public MyStack(int stackSize) {
        this.stackSize = stackSize;
        this.stack = new Integer[stackSize];
    }

    public void push(int number) {
        /*
        Stack is full, create new stack double the size and copy data over
         */
        if(top == stack.length) {
            int newSize = stack.length * 2;
            Integer[] newStack = new Integer[newSize];

            for (int index = 0 ; index < stack.length ; index++) {
                newStack[index] = stack[index];
            }
            stack = newStack;
            stackSize = newSize;
        }

        stack[top++] = number;
    }

    public Integer pop() {
        if (top == 0) {
            return null;
        }
        return stack[--top];
    }
}
