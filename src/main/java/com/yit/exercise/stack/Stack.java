package com.yit.exercise.stack;

public class Stack {
    private int stackSize;
    private Integer[] stack;
    private int top = 0;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.stack = new Integer[stackSize];
    }

    public void push(int number) {
        if(top == stack.length) {
            Integer[] newStack = new Integer[stack.length * 2];

            for (int index = 0 ; index < stack.length ; index++) {
                newStack[index] = stack[index];
            }
            stack = newStack;
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
