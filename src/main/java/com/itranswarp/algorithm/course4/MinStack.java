package com.itranswarp.algorithm.course4;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() > x) {
            minStack.push(x);
        } else minStack.push(minStack.peek());

    }

    public void pop() {
        //
        if (stack.isEmpty()) {
            throw new RuntimeException("错误操作, 栈为空");
        }
        stack.pop();
        minStack.pop();

    }

    public int top() {
        if (stack.isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return minStack.peek();
    }

}
